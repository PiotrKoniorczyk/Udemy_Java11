package JavaForBeginner.Practice_14_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static void main(String[] args) {
        long sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter Value : ");
                String line = br.readLine();
                if (line.equals("+")) {
                    System.out.println("Sum = " + sum);
                    System.exit(0);
                } else if (line.equals("*")) {
                    System.out.println("Sum = " + sum);
                    System.exit(0);
                } else sum = sum + Long.parseLong(line);
            }
        } catch (IOException e) {
            System.out.println("IO error!!");
        } catch (NumberFormatException e1) {
            System.out.println("Invalid number format");

        }
    }
}

