import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for Line
        System.out.println("Enter Line:");  // input IDK how that happened. TTYL. from keyboard
        userLine = scnr.nextLine();

        System.out.println("You entered: " + userLine);
        System.out.println("");

        // CHECK FOR ABBREVIATIONS
        // use indexOf to find shorthands?
        // EXPAND abbreviations. Output a message for each abbreviation that is expanded, then out put the ?

        int numBff = userLine.indexOf("BFF");
        int numIdk = userLine.indexOf("IDK");
        int numJk = userLine.indexOf("JK");
        int numTmi = userLine.indexOf("TMI");
        int numTtyl = userLine.indexOf("TTYL");

        if (numBff != -1) {
            System.out.println("BFF: best friend forever");
        }
        if (numIdk != -1) {
            System.out.println("IDK: I don't know");
        }
        if (numJk != -1) {
            System.out.println("JK: just kidding");
        }
        if (numTmi != -1) {
            System.out.println("TMI: too much information");
        }
        if (numTtyl != -1) {
            System.out.println("TTYL: talk to you later");
        }

        userLine = userLine.replace("BFF", "best friends forever");
        userLine = userLine.replace("IDK", "I don't know");
        userLine = userLine.replace("JK", "just kidding");
        userLine = userLine.replace("TMI", "too much information");
        userLine = userLine.replace("TTYL", "talk to you later");

        // OUTPUT EXPANDED Line

        System.out.println("");
        System.out.println("Expanded: " + userLine);

    }
}



/*
https://github.com/wavebreak/javaspring2019git1-petrichority

You're not my BFF. IDK how I found you, TTYL. JK! You all are my BFFs.
https://github.com/wavebreak/javaspring2019git1-petrichority


*/