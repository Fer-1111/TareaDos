package tarea2;

public class Comprador{
    private String tipoBebida;
    private int cuantoVuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        try{
            Bebida b = null;
            b = exp.comprarBebida(m, cualBebida);
            cuantoVuelto = m.getValor()-1300;
            tipoBebida = b.beber();
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException ex) {
            System.out.println("error: "+ex.getMessage());
        }  
    }
    public int cuantoVuelto(){ //de vuelto        
        return cuantoVuelto;
    }
    public String queBebiste(){//el sonido de la Bebida: cocacola, sprite
        return tipoBebida;
    }
}
