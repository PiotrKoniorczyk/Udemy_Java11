package JavaForBeginner.Lesson_35_String;

public class String_additional {

    private String client;
    private int id;
    private int invome;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvome() {
        return invome;
    }

    public void setInvome(int invome) {
        this.invome = invome;
    }

    public String_additional(String client, int id, int invome) {
        this.client = client;
        this.id = id;
        this.invome = invome;
    }
}

