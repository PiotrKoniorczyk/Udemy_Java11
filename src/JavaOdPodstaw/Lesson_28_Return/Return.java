package JavaOdPodstaw.Lesson_28_Return;

public class Return {


    public static void main(String[] args) {
        System.out.println(addition(9, addition(4,3,2)));
        System.out.println(checkBy3(3));

    }

    private static int addition(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    private static boolean checkBy3(int a){
/*
        if(a%3==0)
            return true;
        else
            return false;
*/

        return a%3 ==0;
    }



}
