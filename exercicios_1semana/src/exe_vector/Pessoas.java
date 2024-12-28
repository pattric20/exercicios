package exe_vector;

public class Pessoas {
    private String name;
    private float height;
    private  int age;
    private char gender;
    public Pessoas(String name, int age,float height) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public Pessoas(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Pessoas(float height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public String getName() {return name;}

    public float getHeight() {return height;}
    public void setHeight(float height) {this.height = height;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public char getGender() {return gender;}

    public void setGender(char gender){this.gender = gender;}
}
