package JavaForBeginner.Practice_08_PhoneInterface;

public class testPhone {
    public static void main(String[] args) {
        PhoneCall number = new PhoneCall();
        PhoneSMS txt = new PhoneSMS();

        String message = "I will be there in 5 min";
        int phoneNumber = 777777777;

        PhoneInterface call = new PhoneInterface() {
            @Override
            public boolean unLock(int x) {

                return true;
            }

            @Override
            public String inProgress(String path) {
                System.out.println("Calling "+phoneNumber);
                return null;
            }

            @Override
            public String finish() {
                return null;
            }
        };

    }

}
