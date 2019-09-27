package animals;

public class InheritanceTest {

    public static void main(String[] args) {
        Animals animals = new Animals();
        Dogs dogs = new Dogs();
        dogs.setName("patches");
        animals.setAlive("Alive");
        System.out.println(dogs.getName());
        System.out.println(animals.getAlive());

    }

}
