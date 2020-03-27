package JavaOdPodstaw.Practice_9_Activity;

public class Test {
    public static void main(String[] args) {

        Android newApp = new Android();

        newApp.onCreate();

        newApp.onStop();

        newApp.onPause();

        newApp.setPhoneName("Motorola");

        System.out.println(newApp.getPhoneName());
    }

}
