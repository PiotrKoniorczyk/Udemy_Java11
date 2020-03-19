package JavaOdPodstaw.Lesson_38_StringBuilder;

public class String_Builder {
    public static void main(String[] args) {

/*
        String result = "";
        for (int i = 0; i < 1000000 ; i++) {
            result += "a";
        }
        System.out.println(result);
*/


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000 ; i++) {
            sb.append("a");
        }
        System.out.println(sb);

    }
}
