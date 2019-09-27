package mystore;

public class Iphone extends Phone {
    public Iphone (double sS){
        // how the phone(IPhone) gets created
        super(sS, "iOS");
    }

    public boolean facialUnlock(String face){
        return true;
    }


}
