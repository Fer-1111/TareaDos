package tarea2;

import java.util.ArrayList;

public class Deposito {

    private ArrayList<Bebida> ListBebidas;

    public Deposito() {
        ListBebidas = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        ListBebidas.add(b);
    }

    public Bebida getBebida() {
        if (ListBebidas.size() > 0) {
            Bebida b = ListBebidas.remove(0);
            return b;
        }
        else return null;
    }

}
