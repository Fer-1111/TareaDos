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
<<<<<<< HEAD
    public int arrayLong(){
        return monedasVuelto.size();
    }
    public String Monedas(int i){
        return monedasVuelto.get(i).MonedaDevuelta();
    }
=======
>>>>>>> 0b96ef4544d720218ab18854f4046613b0aa1793
}