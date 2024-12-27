package exe_vector;
public class Locatario {
    private final String name,email;
    int room;
    public Locatario(String name, String email, int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }
    public String getEmail() {return email;}
    public String getName() {return name;}
    public int getRoom() {return room;}
}
