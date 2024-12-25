package conceitosPOO;

import java.util.Scanner;

public class exe3_fix{
    Scanner sc = new Scanner(System.in);
    private String name;
    private float note1,note2,note3;
    public exe3_fix(){
        name = sc.nextLine();
        note1 = sc.nextFloat();
        note2 = sc.nextFloat();
        note3 = sc.nextFloat();
    }

    public String noteFaltante(){
        if(note1*0.3+note2*0.35+note3*0.35 < 60.0){
            return (String) "FAILED!\nFalta " + (60 -(note1*0.3+note2*0.35+note3*0.35));
        }else{
            return "PASS";
        }
    }

    public float finalNote(){return (float) (note1*0.3+note2*0.35+note3*0.35);}
    public String getName(){return name;}
}
