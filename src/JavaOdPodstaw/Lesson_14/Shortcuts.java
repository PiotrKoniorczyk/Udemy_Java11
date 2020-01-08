package JavaOdPodstaw.Lesson_14;

public class Shortcuts{
    public static void main(String[] args) {
        int i1 = 10;

        //Kolejność działań. Inkrementacja po zmiennej i przed zmienna (Przedrostrkowa (++x) I Przyrostkowa (x++)
        System.out.println(i1++);
        //10
        System.out.println(i1);
        //11 (Działanie dodało się po poprzednim wydruku)
        System.out.println(i1++);
        //11
        System.out.println(i1);
        //12
        System.out.println(i1--);
        //12
        System.out.println(i1);
        //11
        System.out.println(--i1);
        //10

        System.out.println("----------------------------");
        i1 += 5;
        System.out.println(i1);
        //15
        i1 -=5;
        System.out.println(i1);
        //10
        i1 *=5;
        System.out.println(i1);
        //50
        i1 /=5;
        System.out.println(i1);
        //10
        i1 %=6;
        System.out.println(i1);
        //4




    }



}