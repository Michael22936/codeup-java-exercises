package util;

import util.Input;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString("Give me a string"));
//        System.out.println(input.yesNo());
        System.out.println(input.getInt());
//        System.out.println(input.getInt(1,10));
        System.out.println(input.getDouble("Give me a decimal"));
//        System.out.println(input.getDouble(1.1,1.5));


    }

}
