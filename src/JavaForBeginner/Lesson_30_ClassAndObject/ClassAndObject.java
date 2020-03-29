package JavaForBeginner.Lesson_30_ClassAndObject;

public class ClassAndObject {
    public static void main(String[] args) {
        int x = 1;
        String s = " ";

        Client client1 = new Client();
        client1.name = "Tomek";
        s = Client.Company_Name;

        System.out.println(client1.name+s);



    }

}
