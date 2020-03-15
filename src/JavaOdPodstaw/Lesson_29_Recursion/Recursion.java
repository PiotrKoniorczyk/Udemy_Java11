package JavaOdPodstaw.Lesson_29_Recursion;

public class Recursion {

    public static void main(String[] args) {
    foo();
        System.out.println(factorial(8));
    }

    private static void foo(){

        System.out.println("foo");
//        foo();
    }

    // n! // 5! = 5*4*3*2*1

    private static long factorial(long n){
        if(n==1)
            return 1;
        else
            return (n*factorial(n-1));
    }

}
