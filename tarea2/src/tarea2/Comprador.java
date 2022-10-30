package tarea2;

public class Comprador{
    private String tipoBebida;
    private int cuantoVuelto;
    private int serie;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        try{        
            
            Bebida b = exp.comprarBebida(m, cualBebida);
            tipoBebida = b.beber();
            serie = b.getSerie(); 
            cuantoVuelto = exp.vueltoCliente();
        } 
        catch(PagoIncorrectoException ex){
            System.out.println("error: "+ex.getMessage());
        }
        catch(PagoInsuficienteException | NoHayBebidaException ex){
            cuantoVuelto = m.getValor();
            System.out.println("error: "+ex.getMessage());
        }
    }
    public int cuantoVuelto(){        
        return cuantoVuelto;
    }
    public String queBebiste(){
        return tipoBebida;
    }
    public int SerieBebida(){
        return serie;
    }
}