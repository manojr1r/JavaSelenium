package JavaSelenium.Projects;

public class stringformat {
    public static void main(String[] args) {
        String sentence = "this sentence contains mail id amr@gmail.com";
        String username = getUserName(sentence);
        System.out.println(username);

        String sentence1 = "amr1@gmail.com";
        String username1 = getUserName(sentence1);
        System.out.println(username1);

        String sentence2 = "amr2gmail.com";
        String username2 = getUserName(sentence2);
        System.out.println(username2);
    }
    
    public static String sentenceFormatter(String sentence){
        String mailid = null;
        String[] words = sentence.split(" ");
        for (String word : words){
            if (word.contains("@")){
                mailid = word;

            }
        }
        return mailid;

    }

    public static String getUserName(String mailid){
        String userName = null;
        String extractedMailI = null;
        mailid =mailid.trim();
        if (mailid != null && mailid.contains(" ") && mailid.contains("@")) {
            extractedMailI = sentenceFormatter(mailid);
        }
        if (mailid != null && mailid.contains("@") && !mailid.contains(" ")) {
            extractedMailI = mailid;
        }

        if (extractedMailI != null) {
            String[] parts = extractedMailI.split("@");
            if (parts.length == 2) {
                userName = parts[0];
            }
        }
        return userName;
    }
}
