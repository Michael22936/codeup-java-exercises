import java.util.Random;

public class ServerNameGenerator {
    static String randomCombo(String [] random){
        int rdn = new Random().nextInt(random.length);
        return random[rdn];
    }


    public static void main(String[] args) {
    String[] adjectives = {"crashing", "rhythmic", "fast", "acidic", "billions", "melodic", "microscopic", "lazy", "fierce", "defeated"};
    String[] nouns = {"ship", "hero", "fish", "dog", "cat", "world", "student", "business", "night", "man"};
        System.out.println("Here is your server name: ");
        System.out.println(randomCombo(adjectives)+ "-" + randomCombo(nouns));

    }

}
