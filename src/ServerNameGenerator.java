import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"crashing", "rhythmic", "fast", "acidic", "billions", "melodic", "microscopic", "lazy", "fierce", "defeated"};

    public static String[] nouns = {"ship", "hero", "fish", "dog", "cat", "world", "student", "business", "night", "man"};

    static String randomCombo(String [] random){
        int rnd = new Random().nextInt(random.length);
        return random[rnd];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(randomCombo(adjectives)+ "-" + randomCombo(nouns));

    }

}
