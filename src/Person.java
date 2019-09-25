public class Person {

    private String name;

    // returns the person's name
    public String getName(){
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name){

        this.name = name;

    }

    // CONSTRUCTOR
    public Person(String name){

        setName(name);

    }

    // prints a message to the console using the person's name
    public void sayHello(){
       System.out.println("Hello from " + this.getName());
    }

    public static void main(String[] args) {
        Person michael = new Person("Michael");
        System.out.println(michael.getName());
        michael.sayHello();

        Person bob = new Person("bob");
        System.out.println(bob.getName());
        bob.sayHello();
    }

}
