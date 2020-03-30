package JavaForBeginner.Lesson_61_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {
    public static void main(String[] args) {


        try{
            FileWriter writer = new FileWriter("/Users/pro/Programowanie/Java/Udemy/src/JavaForBeginner/Lesson_61_FileWriter/FileToWrite",true);
            writer.write("To be, or not to be,");
            writer.write("\r\n");
            writer.write("that is the question");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(Math.abs(4));
    }
}
