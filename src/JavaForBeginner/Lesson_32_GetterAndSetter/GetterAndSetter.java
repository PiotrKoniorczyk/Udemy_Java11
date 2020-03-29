package JavaForBeginner.Lesson_32_GetterAndSetter;

public class GetterAndSetter {

    public static void main(String[] args) {


        Client clientMichal = new Client();
        clientMichal.setFirstName("Michal");
        clientMichal.setLastName("Forbs");


        Address michalAddress = new Address();
        michalAddress.setStreetNameAndHouseNumber("100 Victoria St");
        michalAddress.setCityName("London");
        michalAddress.setPostCode("LO16 4PA");

        clientMichal.setAddress(michalAddress);


        System.out.print(clientMichal.getFirstName());
        System.out.print(" ");
        System.out.println(clientMichal.getLastName());
        System.out.println(Client.COMPANY_NAME);
        System.out.println("----------------");
        System.out.println(clientMichal.getAddress().getStreetNameAndHouseNumber());
        System.out.println(clientMichal.getAddress().getCityName());
        System.out.println(clientMichal.getAddress().getPostCode());












    }


}
