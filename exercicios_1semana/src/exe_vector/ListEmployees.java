package exe_vector;

import java.util.ArrayList;
import java.util.List;

public class ListEmployees {
    private List<Employees> list = new ArrayList<>();
    public ListEmployees(){}
    public void addEmplyoee(Employees e){list.add(e);}
    public void removEmplyoee(Employees e){list.remove(e);}
    public void increaseSalary(int id,float inc){
        for(Employees e:list){
            if(e.getId() == id){
                e.setSalary(inc);
            }
        }
    }

    public void printListEmployees(){
        for(Employees e:list)
            System.out.println(e.getId()+", " + e.getName()+", " + e.getSalary());
    }

}
