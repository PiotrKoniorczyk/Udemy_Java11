package JavaForBeginner.Lesson_60_ReadingFromFile;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class ReadingFromFile {

    public static void main(String[] args) {

        String separator = File.separator;

        File file = new File( separator+"Users/pro/Programowanie/Java/Udemy/src/JavaForBeginner/Lesson_60_ReadingFromFile/FileToRead");
        System.out.println(file.exists());
        try{
            List<String> lines = Files.readAllLines(Paths.get("/Users/pro/Programowanie/Java/Udemy/src/JavaForBeginner/Lesson_60_ReadingFromFile/FileToRead"));
            for(String str:lines){
                System.out.println(str);

            }
        }catch (Exception e){
            e.printStackTrace();
        };


    }
}
