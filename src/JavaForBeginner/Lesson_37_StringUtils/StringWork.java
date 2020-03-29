package JavaForBeginner.Lesson_37_StringUtils;


public class StringWork {
    public static void main(String[] args) {

        String s = "a,b,c,d,e";

        String[] strings = s.split(",");

        String result = "";
        for (String str : strings){
            result = result + str + ", ";
        }
        System.out.println(result);
        System.out.println(StringUtils.removeLastSeparator(result,","));
    }









}
