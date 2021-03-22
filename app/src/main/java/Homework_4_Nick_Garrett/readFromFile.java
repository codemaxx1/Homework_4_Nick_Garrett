package Homework_4_Nick_Garrett;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromFile {

        public String readFromFile(){
            String data = null;
            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            return data;
        }

}
