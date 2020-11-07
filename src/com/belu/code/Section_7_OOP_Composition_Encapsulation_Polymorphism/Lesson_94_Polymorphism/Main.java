package com.belu.code.Section_7_OOP_Composition_Encapsulation_Polymorphism.Lesson_94_Polymorphism;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "Plot from parent class(aka super class) here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark that easts lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Escape the maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Univers";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }

    // No plot here
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie# " + i +
                    ": " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }
    }
}
