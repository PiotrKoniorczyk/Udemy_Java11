package JavaForBeginner.Lesson_20_LoopForeach;

public class Foreach {
    public static void main(String[] args) {

        int[] ints = {4,3,65,123,2,90,15};

        for(int i=0; i<ints.length;i++){
            System.out.println(ints[i]);
        }

        System.out.println("--------------------------------------------");

        //Thats how foreach its working

        for(int i : ints){
            System.out.println(i);
        }
    }
}
