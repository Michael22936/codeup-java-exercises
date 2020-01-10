import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        //puts a group of numbers into an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));



        //is an array of people with a set size of 3
        Person[] people =  new Person[3];

        people[0] = new Person("bob");
        people[1] = new Person("billy");
        people[2] = new Person("Tom");


        addPerson(people, new Person("hello"));

    }

    static Person[] addPerson(Person [] add, Person name){
        Person[] newPerson = Arrays.copyOf(add, add.length+1);

        newPerson[newPerson.length-1] = name;

        for (Person people : newPerson){
            System.out.println(people.getName());
        }

        return newPerson;
    }

}
