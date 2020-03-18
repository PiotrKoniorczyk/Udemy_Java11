package JavaOdPodstaw.Lesson_36_StringMethods;

public class StringMethods {


    public static void main(String[] args) {
        StringMethods_additional example = new StringMethods_additional(null, 0,0);



        String text = "a" +"b";





        //concat
        System.out.println("---concate---");
        String text2 = "a".concat( "b");
        System.out.println(text2);

        //lenght
        System.out.println("---lenght---");
        int x = text.length();
        System.out.println(x);


        //split
        System.out.println("---split---");
        String s = "a,b,c,d,e";
        String[] splitString = s.split(",");
        System.out.println(splitString[4]);


        //char
        System.out.println("---char---");
        System.out.println(text.chars());


        //charAt
        System.out.println("---charAt---");
        System.out.println(text.charAt(1));


        //codePointAt
        System.out.println("---codePointAt---");
        System.out.println(text.codePointAt(0));











    }
}
