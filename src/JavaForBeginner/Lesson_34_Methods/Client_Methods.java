package JavaForBeginner.Lesson_34_Methods;

public class Client_Methods {



    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void introduceYourSelf(){
        System.out.println("Hello, I am " + getFirstAndLastNAme());
    }


    private String getFirstAndLastNAme(){
        return  firstName + " " + lastName;
    }
}
