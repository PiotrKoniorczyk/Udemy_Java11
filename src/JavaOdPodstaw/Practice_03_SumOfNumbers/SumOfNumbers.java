package JavaOdPodstaw.Practice_03_SumOfNumbers;

public class SumOfNumbers {
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
            System.out.print(ints[i]+" ");
            i++;

        }
        System.out.println();
        System.out.println("----------");
        var sum = 0;
        while (i<5){
            sum =+ ints[i];
            i++;



        }
        System.out.println("Sum = "+ sum);

        }


    }


