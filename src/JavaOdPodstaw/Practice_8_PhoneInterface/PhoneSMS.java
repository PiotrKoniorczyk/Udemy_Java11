package JavaOdPodstaw.Practice_8_PhoneInterface;

public class PhoneSMS implements PhoneInterface {
    @Override
    public boolean unLock(int x) {

        if (x == 1){
            return true;
        }
        return false;
    }

    @Override
    public String inProgress(String path) {
        System.out.println("Writhing message in progress");
        return null;
    }

    @Override
    public String finish() {
        System.out.println("Call finish");
        return null;
    }
}
