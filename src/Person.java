public class Person {

    private String name;

    // returns the person's name
    public String getName(){
        return String.format("My name is %s", name);
    }
    // changes the name property to the passed value
    public Person(String name){

        this.name = name;

    }
    // prints a message to the console using the person's name
    public String sayHello(){
       return String.format("Hello from %s", name);
    }

    public static void main(String[] args) {
        Person michael = new Person("Michael");
        System.out.println(michael.getName());
        System.out.println(michael.sayHello());

        Person bob = new Person("bob");
        System.out.println(bob.getName());
        System.out.println(bob.sayHello());
    }

}
