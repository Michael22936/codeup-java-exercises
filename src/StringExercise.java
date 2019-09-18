import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String messages = "We don't need no education\n" +
                "We don't need no thought control";

        String str1 = "Check \"this\" out!, \"s inside of \"s!";

        String str2 = "In windows, the main drive is usually C:\\";

        String str3 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";

        System.out.println(messages);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        do {

            System.out.println("Tell bob anything");

            String bob = String.valueOf(input.nextLine());


            if (bob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {

                String last = String.valueOf(bob.charAt(bob.length() - 1));

                switch (last) {
                    case "?":
                        System.out.println("Sure.");
                        break;
                    case "!":
                        System.out.println("Whoa, chill out!");
                        break;
                    default:
                        System.out.println("Whatever.");
                }
            }
            System.out.println("Would you like to continue Y/N");
        }while(input.nextLine().equalsIgnoreCase("y"));
    }
}
