
package Homework_4_Nick_Garrett;


import java.lang.reflect.Array;
import java.util.List;

public class App {
    //client

    public static void main(String[] args) {
        //initialize references
        //Relationship family = new Relationship();

        //program starts
        System.out.println("Program Start\n");

        //list of people and their information
        normalPerson JohnBaker = new normalPerson("John Baker", 21, "11/16");
        normalPerson LilianBaker = new normalPerson("Lilian Baker", 19, "2/14");
        normalPerson LailaCalder = new normalPerson("Laila Calder", 47, "10/23");
        normalPerson ElizaSnow = new normalPerson("Eliza Snow", 9, "12/13");
        normalPerson FelicitySmoke = new normalPerson("Felicity Smoke", 97, "7/27");
        normalPerson TaylorBaker = new normalPerson("Taylor Baker", 42, "8/17");


        //add relationships
        /*
        JohnBaker.isFatherTo(LilianBaker);
        LailaCalder.isSisterTo(JohnBaker);
        LailaCalder.isMotherTo(LilianBaker);
        FelicitySmoke.isSisterTo(LilianBaker);
        TaylorBaker.isAuntTo(FelicitySmoke);
        */
        Relationship replationship = new Relationship(TaylorBaker, FelicitySmoke, "Mother");


        //program ends
        System.out.println("\nProgram End\n");

    }
}
