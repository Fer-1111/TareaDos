package tarea2;

public class Comprador{
    private String tipoBebida;
    private int serie;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        if(cualBebida == 1){
            tipoBebida = "CocaCola";
        }
        if(cualBebida == 2){
            tipoBebida = "Sprite";
        }
        if(cualBebida == 3){
            tipoBebida = "Fanta";
        }
        if(cualBebida == 4){
            tipoBebida = "Kem";
        }
        
    
    }
    public int cuantoVuelto(){ //de vuelto        
        return 200;
    }
    public String queBebiste(){//el sonido de la Bebida: cocacola, sprite
        
    }
}
