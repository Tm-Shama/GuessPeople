package driver;

import java.util.Scanner;
public class Player {
    //Scanner scanner = new Scanner(System.in);
    private String name;;
    private int age;
    private int points;
    private String current_question;

public Player(int age, String name,int points,String current_question){
    this.name = name.trim();
    this.age = age;
    this.points = points; // starts with zero points
    this.current_question = " ";
}

    public String getName(){
     return name;
    }

    public int getAge(){
        return age;
    }

    public int getPoints(){
        return points;
    }

    public String getCurrent_question(){
        return current_question;
    }























}
