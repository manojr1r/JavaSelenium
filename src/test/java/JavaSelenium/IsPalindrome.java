package JavaSelenium;

import static java.lang.Integer.parseInt;

public class IsPalindrome {

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome2(12121));
    }


    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        char[] nu = Integer.toString(x).toCharArray();

        StringBuilder reverseStrNumber = new StringBuilder();
        for (int i = nu.length - 1; i >= 0; i--) {
            reverseStrNumber.append(nu[i]);
        }
        System.out.println(reverseStrNumber);

        int reverseNumber = parseInt(String.valueOf(reverseStrNumber));

        return x == reverseNumber;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int original = x;
        int reverseNumber =0;

        while (original > 0) {
             int temp = original % 10;
            reverseNumber = reverseNumber *10 + temp ;
            original = original/ 10;
        }

        return x == reverseNumber;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) {
            return false;
        }

        StringBuilder correctNumber = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = new StringBuilder(correctNumber);
        reverse.reverse();
        return String.valueOf(correctNumber).contentEquals(reverse);
    }
}
