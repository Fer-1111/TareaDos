package tarea2;

public class Comprador{
    private String tipoBebida;
    private int serie;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        try{
            exp.comprarBebida(m, 1);
        
        } catch (PagoIncorrectoException ex) {
            System.out.println("error: "+ex.getMessage());
        } catch (PagoInsuficienteException ex) {
            System.out.println("error: "+ex.getMessage());
        } catch (NoHayBebidaException ex) {
            System.out.println("error: "+ex.getMessage());
        }
    }
    public int cuantoVuelto(){ //de vuelto        
        return 200;
    }
    public String queBebiste(){//el sonido de la Bebida: cocacola, sprite
        
    }
}
