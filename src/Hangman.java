import java.util.Scanner;

public class Hangman{

    Scanner sc;
    String wordSoFar;
    String wordGuess;
    String wordCopy = "";
    String chooseGuessLetterOrWord;
    String letterGuess;
    int noOfRounds;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wanna play Hangman???[Y/N]");

        String userResponce = sc.nextLine();

        if (userResponce.equalsIgnoreCase("y")) {

            System.out.println("Type in a word.");

            String userWord = sc.nextLine();

            int userWordToNumber = userWord.length();

            String asterisk = new String(new char[userWord.length()]).replace("\0", "*");

            int count = 0;

            while (count < userWordToNumber && asterisk.contains("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess = sc.next();
//                hang(guess);
            }
            sc.close();
        }

    }

}

