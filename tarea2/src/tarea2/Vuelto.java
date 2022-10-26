package tarea2;

import java.util.ArrayList;

public class Vuelto {
    private ArrayList<Moneda> monedasVuelto;

    public Vuelto() {
        monedasVuelto = new ArrayList<Moneda>();
    }   
    
    public void addMoneda(Moneda m){
        monedasVuelto.add(m);
    }
}