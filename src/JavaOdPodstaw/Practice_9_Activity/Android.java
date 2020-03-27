package JavaOdPodstaw.Practice_9_Activity;

public class Android extends Activity{

    private String phoneName;

    public Android(String phoneName) {
        this.phoneName = phoneName;
    }

    public Android() {

    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
