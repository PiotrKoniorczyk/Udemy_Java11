package JavaForBeginner.Lesson_44_to_46_Inheritance;

public class PhoneFactory extends Factory {


    @Override
    public void checkState() {
        //super.checkState();
        System.out.println("checkStateFactory");
    }

    public void testCall(){
        System.out.println("testCall");

    }


    @Override
    public void destroid() {
        System.out.println("phoneDestroid");
    }

    @Override
    public String introduceYourself() {
        super.checkState();
        return super.introduceYourself();
    }
}
