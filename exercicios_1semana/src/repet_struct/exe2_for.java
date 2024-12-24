package repet_struct;

import java.util.Scanner;

public class exe2_for{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(), in=0, out=0, read = 0;
    public exe2_for(){
        for(int i = 1; i<=num; i++){
            read = sc.nextInt();
            if(read >= 10 && read <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.printf("in: %d\nout: %d",in, out);
        sc.close();
    }
}
