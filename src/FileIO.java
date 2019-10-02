import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FileIO {

    public static void main(String[] args) {

        changeGame("Halo 3", "The Last", Paths.get("data", "games.txt"));

    }

    public static List<String> gamesMethod(String location) throws IOException{

        Path x = Paths.get(location);

        return Files.readAllLines(x);
    }

    public static void changeGame(String oldGame,String newGame, Path path){
        try {
            List<String> gameContents = gamesMethod(path.toString());
            List<String> newGames = new ArrayList<>();
            for(String line : gameContents){
                if (line.equals(oldGame)){
                    newGames.add(newGame);
                    continue;
                }
                newGames.add(line);
            }
            Files.write(path,newGames);
        }catch (IOException e){
            e.fillInStackTrace();
        }
    }

}
