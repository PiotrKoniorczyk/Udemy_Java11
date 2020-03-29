package JavaForBeginner.Lesson_61_FileWriter;

import java.io.File;

public class FileWriter {
    public static void main(String[] args) {
//"/Users/pro/Programowanie/Java/Udemy/src/JavaForBeginner/Lesson_61_FileWriter/FileToWrite"




        try{
            FileWriter writer = new FileWriter("/Users/pro/Programowanie/Java/Udemy/src/JavaForBeginner/Lesson_61_FileWriter/FileToWrite.txt");
            writer.write("Hello");
            writer.write("\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
