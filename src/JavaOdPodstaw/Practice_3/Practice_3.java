package JavaOdPodstaw.Practice_3;

public class Practice_3 {
    public static void main(String[] args) {

        int[] ints;
        ints = new int[5];
        ints[0] = 6;
        ints[1] = 15;
        ints[2] = 33;
        ints[3] = 52;
        ints[4] = 77;

        var i = 0;
        while (i<5) {
            System.out.print(ints[i]);
            i++;

        }
        System.out.println();
        System.out.println("----------");
        var sum = ints[0]+ints[1]+ints[2]+ints[3]+ints[4];
        System.out.println("Sum = "+ sum);

        }


    }


