import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;



        System.out.format("The value of pi is approximately: %.2f.\n", pi);

        System.out.println("Pick a number.");

        int number = input.nextInt();



         System.out.println("Pick three random words");

         String one = input.next();

        String two = input.next();

         String three = input.nextLine();


        System.out.println("write me a sentence");

        String sentence = input.nextLine();


        System.out.println("What is the length and width of the classroom?");

        int length = Integer.parseInt(input.nextLine());

        int width = Integer.parseInt(input.nextLine());

        int parameter = (length + width) * 2;

        int area = length * width;

        System.out.println("You entered " + number);

         System.out.println("word one "+ one);
        System.out.println("word two "+ two);
        System.out.println("word three "+ three);

        System.out.println(sentence);

        System.out.println("parameter = " + parameter);

        System.out.println("area = " + area);

    }

}
