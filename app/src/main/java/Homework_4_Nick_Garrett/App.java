
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



        /*
        I kept trying to get a class to read data from a file, though I couldn't get it to work well enough to get new people, as well as relationships.
        So, I decided that it would be prudent to remove the terrible-looking class and instead have some hard-written lines of code (below) which show what the "file reader"
            would have called (except with populating the data fields with values from the file.)

         */

        //list of people and their information
        normalPerson JohnBaker = new normalPerson("John Baker", 21, "11/16");
        normalPerson LilianBaker = new normalPerson("Lilian Baker", 19, "2/14");
        normalPerson LailaCalder = new normalPerson("Laila Calder", 47, "10/23");
        normalPerson ElizaSnow = new normalPerson("Eliza Snow", 9, "12/13");
        normalPerson FelicitySmoke = new normalPerson("Felicity Smoke", 97, "7/27");
        normalPerson TaylorBaker = new normalPerson("Taylor Baker", 42, "8/17");

        //add relationships
        normalPerson name1 = JohnBaker;
        normalPerson name2 = LilianBaker;
        relationshipInterface r1 = new mother();
        r1.createRelationship(name1, name2);

        relationshipInterface r2 = new father();
        r2.createRelationship(LailaCalder, LilianBaker);

        relationshipInterface r3 = new brother();
        r3.createRelationship(TaylorBaker, ElizaSnow);

        
        //get the relationship between name1 and name2
        String[] getR = relationshipInterface.getRelationship(name1,name2);
        //print all relationships between the two people
        for(int i=0; i< getR.length; i++)
        System.out.println("relationship between" + name1.getName() + " and " + name2.getName() + " "+ getR[i]);



        //program ends
        System.out.println("\nProgram End");

    }
}
