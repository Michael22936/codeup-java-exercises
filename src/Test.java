public class Test {

    public static void main(String[] args) {
        System.out.println(sayHello("hello"));
        fizzBuzzLoop(1,100);
    }

    public static String sayHello(String str){
        return str.toUpperCase();
    }

    public static void fizzBuzzLoop(int start, int end){

        if (start <= end){
            String print = "";

            if (start % 3 == 0){
                print += "Fizz";
            }
            if (start % 5 == 0){
                print += "Buzz";
            }
            System.out.println(print.length() > 0 ? print : start);
            fizzBuzzLoop(start + 1, end);

        }

    }

}
