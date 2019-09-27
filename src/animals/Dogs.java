package animals;

public class Dogs extends Animals {

    private String breed;
    private String name;

    public Dogs(){
    }

    public String getBreed(){
        return this.breed;
    }

    public String getName(){
        return this.name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void  setName(String name){
        this.name = name;
    }

}
