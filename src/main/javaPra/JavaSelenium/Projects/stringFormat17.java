package JavaSelenium.Projects;


import java.util.Arrays;

public class stringFormat17 {
    public static void main(String[] args) {
        String sentence = "this sentence contains mail id amr@gmail.com";
        printUserName(sentence);

        String sentence1 = "amr1@gmail.com";
        printUserName(sentence1);

        String sentence2 = "amr2gmail.com";
        printUserName(sentence2);

        String sentence3 = null;
        printUserName(sentence3);
    }

    private static void printUserName(String sentence) {
        String username = getUserName(sentence);
        System.out.println(username);
    }

    private static String sentenceFormatter(String sentence) {
        String[] words = sentence.split(" ");
        return Arrays.stream(words)
                .filter(word -> word.contains("@"))
                .findFirst()
                .orElse(null);
    }

    private static String getUserName(String mailid) {
        mailid = mailid.trim();

        String extractedMailI;

        if (mailid.contains(" ") && mailid.contains("@")) {
            extractedMailI = sentenceFormatter(mailid);
        } else if (mailid.contains("@") && !mailid.contains(" ")) {
            extractedMailI = mailid;
        } else {
            extractedMailI = null;
        }

        return extractedMailI != null ? extractedMailI.split("@")[0] : null;
    }

}


