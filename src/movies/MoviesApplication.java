package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Welcome to the movie app");
        int userInput;
        boolean willContinue;
        do {
            displayMenu();

            userInput = input.getInt(0, 5);

            willContinue = processChoice();

            System.out.println(userInput);

        }while(willContinue);


    }

    public static void displayMenu(){
        String menu = "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category";

        System.out.println(menu);
    }

    public static boolean processChoice(int choice){
        boolean output = true;

        switch (choice){

            case 0:
                System.out.println("Exit");
                output = false;
                break;
            case 1:
                displayMovies();
                break;
            case 2:
                displayMovies("animated");
                break;
            case 3:
                displayMovies("drama");
                break;
            case 4:
                displayMovies("horror");
                break;
            case 5:
                displayMovies("scifi");
                break;
        }
        return output;
    }

    public static void displayMovies(){
        String output = "";

        for (Movie movie : MoviesArray.findAll()){
            output += String.format("%s -- %s%n", movie.getMovieName(), movie.getMovieCategory());
        }

        System.out.println(output);
    }

    public static void displayMovies(String category){
        String output = "";

        for (Movie movie : MoviesArray.findAll()){
            if (category.equalsIgnoreCase(movie.getMovieCategory())){
            output += String.format("%s -- %s%n", movie.getMovieName(), movie.getMovieCategory());

            }
        }

        System.out.println(output);
    }

}

