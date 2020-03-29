package JavaForBeginner.Practice_09_Activity;

public abstract class Activity {
    public void onCreate() {
        System.out.println("onCreate");
    }

    public void onPause(){
        System.out.println("onPause");

    }
    public void onStop(){
        System.out.println("onStop");

    }
}
