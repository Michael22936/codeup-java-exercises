package mystore;

public class Phone {

    private String number;
    private double screenSize;
    private String OS;

    public Phone(double sS, String OS){
        this.screenSize = sS;
        this.OS = OS;
    }

    public String getOS(){
        return this.OS;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public double getScreenSize(){
        return this.screenSize;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    public void call(String aNumber){
        System.out.println("aNumber = " + aNumber);
    }
}
