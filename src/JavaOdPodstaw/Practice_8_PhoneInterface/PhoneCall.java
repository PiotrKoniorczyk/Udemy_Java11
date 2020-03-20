package JavaOdPodstaw.Practice_8_PhoneInterface;

public class PhoneCall implements PhoneInterface {


    @Override
    public boolean unLock(int x) {

        if (x == 1){
            return true;
        }
        return false;


    }

    @Override
    public String inProgress(String path) {
        return null;
    }



    public void PhoneCalling(){
        System.out.println("Calling in progress");
    }

    @Override
    public String finish() {
        System.out.println("Call finish");
        return null;
    }
}
