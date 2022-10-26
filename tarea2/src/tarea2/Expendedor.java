package tarea2;

public class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito kem;
    private int precio;

    public Expendedor(int cantBebidas, int cualBebida) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        kem = new Deposito();
        precio = 1300;
        int serie;
        
        for (serie = 0; serie < cantBebidas; serie++) {
            coca.addBebida(new CocaCola(100 + serie));
        }
        for (serie = 0; serie < cantBebidas; serie++) {
            sprite.addBebida(new Sprite(200 + serie));
        }
        for (serie = 0; serie < cantBebidas; serie++) {
            fanta.addBebida(new Fanta(300 + serie));
        }
        for (serie = 0; serie < cantBebidas; serie++) {
            kem.addBebida(new Kem(400 + serie));
        }
        
        
        if(cualBebida == 1){ //es coca
            coca.getBebida();
        }
        if(cualBebida == 2){ //es sprite
            sprite.getBebida();
        }
        if(cualBebida == 3){ // es fanta
            fanta.getBebida();
        }
        if(cualBebida == 4){ // es kem
            kem.getBebida();
        }
    }
    
    public Bebida comprarBebida(Moneda m, int cualBebida){
        
        
        return null;
        
        
    }
    
    public void getVuelto(){ //retorna moneda, null si deposito está vacío
        Vuelto Billetera = new Vuelto();
        Moneda m = new Moneda100();
        Billetera.addMoneda(m);
    }       
}
