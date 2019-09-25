import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Write me a sentence.");
        System.out.println(input.getString());
        System.out.println("Pick [ Y | N ]");
        System.out.println(input.yesNo());
        System.out.println("Give me a number.");
        System.out.println(input.getInt());
        System.out.println("Pick a number between 1 and 10.");
        System.out.println(input.getInt(1,10));
        System.out.println("Give me a decimal number.");
        System.out.println(input.getDouble());
        System.out.println("Pick a number between 1.1 and 1.5.");
        System.out.println(input.getDouble(1.1,1.5));


    }

}
