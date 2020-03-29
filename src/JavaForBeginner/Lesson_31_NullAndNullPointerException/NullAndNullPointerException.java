package JavaForBeginner.Lesson_31_NullAndNullPointerException;

import JavaForBeginner.Lesson_30_ClassAndObject.Client;



public class NullAndNullPointerException {
    public static void main(String[] args) {



        Client client1 = new Client();
        client1.name = "Tomek";
        Client client2 = null;

        System.out.println(client1.name);
        System.out.println(client2);  //NullPointerException


        if(client2 != null){
            System.out.println(client2.name);
        } else {
            System.out.println("client2.name = null");
        }





    }

}
