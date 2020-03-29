package JavaForBeginner.Practice_10_Polymorphism;

public class BoxPractice_Test {
    public static void main(String[] args) {



        BoxPractice<String, Integer> boxPractice= new BoxPractice<String, Integer>();

        boxPractice.setT1T2("T1", Integer.valueOf(5));
        System.out.println(boxPractice.getT1());
        System.out.println(boxPractice.getT2());


    }


}
