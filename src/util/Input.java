package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){

        scanner = new Scanner(System.in);

    }

    public String getString(){

        return scanner.nextLine();

    }

    public String getString(String prompt){

        if (prompt.isEmpty()){

            System.out.println("Type something: ");

        }

        System.out.println(prompt);

        return getString();

    }

    public boolean yesNo(){

        System.out.println("Pick [ Y | N ]");

        String checked = scanner.nextLine();

        return checked.equalsIgnoreCase("y") || checked.equalsIgnoreCase("yes");

    }

    public int getInt(int min, int max){

        System.out.println("Pick a number between 1 and 10.");

        if (scanner.hasNextInt()) {

            int userNum = scanner.nextInt();

            if (userNum >= min && userNum <= max) {

                return userNum;

            } else {

                System.out.println("Invalid range");

                return getInt(min, max);

            }

        } else {

            System.out.println("Invalid Input!");

            return getInt(min, max);

        }

    }

//     public int getInt(){
//
//        int input = scanner.nextInt();
//
//         System.out.println("Give me a number.");
//
//        if (scanner.hasNextInt()){
//
//        return scanner.nextInt();
//
//        }
//        return input;
//     }

//    public double getDouble(String prompt){
//
//        System.out.println(prompt);
//
//            return scanner.nextDouble();
//
//    }

     public double getDouble(double min, double max){

         System.out.println("Pick a number between 1.1 and 1.5.");

         if (scanner.hasNextDouble()) {

             double userNum = scanner.nextDouble();

             if (userNum >= min && userNum <= max) {

                 return userNum;

             } else {

                 System.out.println("Invalid range");

                 return getDouble(min, max);

             }

         } else {

             System.out.println("Invalid Input!");

             return getDouble(min, max);

         }

     }
    public int getInt() {
        int input;

        try {
            System.out.println("Give me a number.");
            input = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
            return getInt();
        }
        return input;
    }
    public double getDouble(String prompt) {
        System.out.println(prompt);

        double input;

        try {
            input = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
            return getDouble(prompt);
        }
        return input;
    }
}
