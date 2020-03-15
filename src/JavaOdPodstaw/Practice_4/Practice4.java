package JavaOdPodstaw.Practice_4;


public class Practice4 {
    public static void main(String[] args) {
        int i = 0;
        int maxValue = 10;
        while (i < maxValue) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i);
                if (++i < maxValue){
                    System.out.print(",");
                }
            }
            i++;

        }
    }
}