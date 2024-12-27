package exe_vector;
public class Employees {
    private final int id;
    private final String name;
    private float salary;
    public Employees(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {return id;}

    public String getName() { return name;}

    public float getSalary() {return salary;}
    public void setSalary(float increase) {salary += salary*increase;}
}
