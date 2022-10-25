package tarea2;

public class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito kem;

    public Expendedor(int cantBebidas, int cualBebida) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        kem = new Deposito();
        int serie;
        for (serie = 0; serie < cantBebidas; serie++) {
            coca.addBebida(new CocaCola(100 + serie));
            sprite.addBebida(new Sprite(200 + serie));
            fanta.addBebida(new Sprite(300 + serie));
            kem.addBebida(new Sprite(400 + serie));
        }
        if(cualBebida == 1){}
        if(cualBebida == 2){}
        if(cualBebida == 3){}
        if(cualBebida == 4){}
    }
    
    public Bebida comprarBebida(Moneda m, int cualBebida){
        Bebida = null;
        
        if(m == null){ //PagoIncorrectoException cuando compra sin dinero
            throw new PagoIncorrectoException("Error, estas intentando comprar sin dinero");
        }
        if(m < Bebida.precio ){ //Pago insuficiente, bebida por un valor inferior al precio
            throw new PagoInsuficienteException("Error su mone ingresada es inferior al precio");
        }
        if(){ // No hay Bebida 
            
        }
        
        
    }
    
    public Moneda getVuelto(){ //retorna moneda, null si deposito está vacío
        
    }
}
