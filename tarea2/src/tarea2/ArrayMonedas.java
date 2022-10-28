package tarea2;

import java.util.ArrayList;

public class ArrayMonedas{
    private ArrayList<Moneda> monedasVuelto;

    public ArrayMonedas() {
        monedasVuelto = new ArrayList<Moneda>();
    }   
    
    public void addMoneda(Moneda m){
        monedasVuelto.add(m);
    }
}