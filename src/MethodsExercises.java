import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

//        System.out.println(addTogether(1,1));
//
//        System.out.println(subTogether(3,2));
//
//        System.out.println(productOfTwo(3,3));
//
//        System.out.println(divideTogether(3,3));
//
//        System.out.println(modulusOfTwo(3,2));

//        System.out.println("Pick a number between 1 and 10: ");
//        getInteger(1,10);

//        factorial(1,10);

        dice();


    }

//    public static int addTogether(int num, int num1){
//        return num + num1;
//    }
//
//    public static int subTogether(int num, int num1){
//        return num - num1;
//    }
//
//    public static int productOfTwo(int num, int num1){
//        return num * num1;
//    }
//
//    public static int divideTogether(int num, int num1){
//        return num / num1;
//    }
//
//    public static int modulusOfTwo(int num, int num1){
//        return num % num1;
//    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Invalid range");
//                return getInteger(min, max);
//            }
//        } else {
//            System.out.println("Invalid Input!");
//            return getInteger(min, max);
//        }
//    }
//
//
//    public static int factorial(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        int i,fact=getInteger(min,max);
//        int number= sc.nextInt();
//        for(i=1;i<=number;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+number+" is: "+fact);
//
//        return 0;
//    }
public static void dice(){

        Random dice = new Random();
        Scanner input = new Scanner(System.in);
        int faces;
        int result;

        do {

            System.out.println("How many faces does the dice have?");
            faces = input.nextInt();
            result = dice.nextInt(faces) + 1;
            System.out.println("\nThe dice rolled a " + result + ".");

            System.out.println("Would you like to roll the dice again Y/N");


        }while(input.nextLine().equalsIgnoreCase("y"));

}

}

