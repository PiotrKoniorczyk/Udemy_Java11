package JavaForBeginner.Lesson_59_IO;

import JavaForBeginner.Lesson_56_to_58_Exceptions.Exc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while (true){
                String line = br.readLine();
                if(line.equals("quit")){
                    System.exit(0);
                }
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
