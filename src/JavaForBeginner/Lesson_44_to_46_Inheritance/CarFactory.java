package JavaForBeginner.Lesson_44_to_46_Inheritance;

public class CarFactory extends Factory {



    @Override
    public void checkState() {
        //super.checkState();
        System.out.println("checkStateFactory");
    }

    public void testDrive(){
        System.out.println("testDrive");

    }

    @Override
    public void destroid() {
        System.out.println("carDestroid");

    }
}
