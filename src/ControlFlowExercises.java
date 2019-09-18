import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 5;
        while (i <= 15){
            System.out.println("i = " + i);
            i++;
        }



        boolean counting = true;

        int j = 100;

        do {
            if (j == -10){
                counting = false;
            }else{
                System.out.println("j = " + j);
            }

            j-=5;
        }while (counting);
        for (int j = 100; j >= -10; j-=5){
            System.out.println(j);
        }


        long k = 2;
        do {
            System.out.println(k);
            k*=k;
        }while(k < 100000);

        for(long i = 2; i < 100000; i *= i) {
            System.out.println(i);
        }


        for (int a = 1; a <= 100; a++){
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println( a+"FizzBuzz");
            }else if (a % 3 == 0){
                System.out.println(a+"Fizz");
            } else if (a % 5 == 0){
                System.out.println(a+"Buzz");
            } else {
                System.out.println(a);
            }

        }


        String yesNo = "Y";

        while (yesNo.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go up to?");

            int number = Integer.parseInt(input.nextLine());

            int square;
            int cube;

            System.out.println("Here is your table!");


            System.out.println("Number | Square  | Cube");
            System.out.println("------ | ------- | -----");



            for (int x=1; x<=number; x++)
            {
                square= x * x;
                cube= x * square;
                System.out.println(x + "\t   |" + square + " \t\t |" + cube);

            }
            System.out.println("Would you like to test another number Y/N");


            yesNo = input.nextLine();


        }
            System.out.println("Bye");

        do {

            System.out.println("Give me a grade number: ");

            int grade = Integer.parseInt(input.nextLine());

            String gradeLetter = "";

            if (grade <= 100 && grade >= 88) {
                gradeLetter = "A";
            } else if (grade <= 87 && grade >= 80) {
                gradeLetter = "B";
            } else if (grade <= 79 && grade >= 67) {
                gradeLetter = "C";
            } else if (grade <= 66 && grade >= 60) {
                gradeLetter = "D";
            } else if (grade <= 59 && grade >= 0) {
                gradeLetter = "F";
            }

            System.out.println(gradeLetter);

            System.out.println("Would you like to test another grade Y/N");
        }while (input.nextLine().equalsIgnoreCase("y"));
    }

}
