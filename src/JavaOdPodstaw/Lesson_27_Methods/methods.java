package JavaOdPodstaw.Lesson_27_Methods;

public class methods {

//    public static void main(String[] args) {
//        sayHi1("Tomek", "Marek");
//    }

    public static void main(String[] args) {
        sayHi2();
        sayHi2("Tomek", "Marek", "Wojtek");


    }


    private static void sayHi1(String name, String name2) {
        System.out.println("Hello " + name + " ," + name2);
    }

    private static void sayHi2(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi " + result);
    }
}