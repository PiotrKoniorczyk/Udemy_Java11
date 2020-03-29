package JavaForBeginner.Lesson_56_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {



        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader(new FileReader(""));
            fileReader.readLine();
        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        try(BufferedReader fr = new BufferedReader(new FileReader(""))){
            fileReader.readLine();
        }catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
    }
    }
}
