package JavaForBeginner.Lesson_25_SwichCase;

public class SwichCase {
    public static void main(String[] args) {

        int menu = 4;
        switch (menu){
            case 1:
                System.out.println("main menu");
                break;
            case 2:
                System.out.println("game menu");
                break;
            case 3:
                System.out.println("end menu");
                break;
            default:
                System.out.println("invalid number");
                break;
        }


    }
}
