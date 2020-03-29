package JavaForBeginner.Lesson_39_repeat_isBlank_strip_lines;

public class Repeat_isBlank_strip_lines {

    public static void main(String[] args) {
        System.out.println("text".repeat(5));
        System.out.println("     ".isBlank());
        System.out.println("    tekst tekst     ".strip());
        System.out.println("    tekst tekst     ".stripLeading());
        System.out.println("    tekst tekst     ".stripTrailing());
        System.out.println("on\noff\nn1\n0\n".lines().count());
       }
}
