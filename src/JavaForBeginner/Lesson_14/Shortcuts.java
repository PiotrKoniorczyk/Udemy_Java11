package JavaForBeginner.Lesson_14;

public class Shortcuts{
    public static void main(String[] args) {
        int i1 = 10;

        //Sequence of actions. Increment after and before variable (Prefix (++ x) And Suffix (x ++)
        System.out.println(i1++);
        //10
        System.out.println(i1);
        //11 (Action added after previous print)
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