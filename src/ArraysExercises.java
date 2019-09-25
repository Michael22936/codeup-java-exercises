import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));



        Person[] people =  new Person[3];

        people[0] = new Person("bob");
        people[1] = new Person("billy");
        people[2] = new Person("Tom");

//        for(Person name : Person){
//            System.out.println(name);
//        }

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
