package tarea2;

import java.util.ArrayList;

public class Deposito {

    private final ArrayList<Bebida> ListBebidas;

    public Deposito() {
        ListBebidas = new ArrayList<>();
    }

    public void addBebida(Bebida b) {
        ListBebidas.add(b);
    }

    public Bebida getBebida() {
        if (ListBebidas.size() <= 0) return null;
        else {
            Bebida b = ListBebidas.remove(0);
            System.out.println(ListBebidas.size());
            return b;
        }
    }
    public int arrayLong(){
        return ListBebidas.size();
    }
}
