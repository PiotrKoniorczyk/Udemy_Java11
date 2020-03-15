package JavaOdPodstaw.Lesson_24_If_Else;

public class If_else {
    public static void main(String[] args) {

        int[] ints = {2, 3, 4, 5, 6, 7};


        for (int i : ints) {
            if (i % 2 == 0) {
                System.out.println(i + " is divisible by 2");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else System.out.println(i + " is not divisible by 2 or 3");


        }
        System.out.println("-----------------------------------------");

        for (int i : ints) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " is divisible by 2 and by 3");
            }
            else if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i + " is divisible by 2 or by 3");
            }
            else
                System.out.println(i + " is NOT divisable by 2 or 3");
        }
    }
}