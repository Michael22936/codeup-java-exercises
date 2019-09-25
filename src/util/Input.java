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

    public boolean yesNo(){

        String checked = scanner.nextLine();

        return checked.equalsIgnoreCase("y") || checked.equalsIgnoreCase("yes");

    }

    public int getInt(int min, int max){

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

     public int getInt(){

        if (scanner.hasNextInt()){

        return scanner.nextInt();

        }
        return getInt();
     }

    public double getDouble(){

            return scanner.nextDouble();

    }

     public double getDouble(double min, double max){

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

}
