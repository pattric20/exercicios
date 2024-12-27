package exe_vector;
public class Pensionato{
    private Locatario[] rooms = new Locatario[10];
    public void addLocatario(Locatario locatario){rooms[locatario.room] = locatario;}
    public  void removLocatario(Locatario locatario){rooms[locatario.room] = null;}

    public int contBusy(){
        int cont=0;
        for(Locatario l:rooms)
            if(l!=null)
                cont++;
        return cont;
    }

    public Locatario[] getBusyRooms(){
        Locatario[] loc = new Locatario[contBusy()];
        int i=0;
        for(Locatario l:rooms){
            if(l!=null){
                loc[i]=l;i++;
            }
        }
        return loc;
    }
}
