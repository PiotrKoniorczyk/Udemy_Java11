package JavaForBeginner.Lesson_37_StringUtils;

public class StringUtils {


    public static String removeLastSeparator(String text, String separator){
        return text.substring(0,text.lastIndexOf(separator));

    }



}