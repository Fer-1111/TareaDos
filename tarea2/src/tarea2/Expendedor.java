package tarea2;

public class Expendedor {

    private final Deposito coca;
    private final Deposito sprite;
    private final Deposito fanta;
    private final Deposito kem;
    private final int precio;
    private int vuelto;

    public Expendedor(int cantBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        kem = new Deposito();
        this.precio= precioBebidas;
        for (int serie = 0; serie < cantBebidas; serie++) {
            coca.addBebida(new CocaCola(100 + serie));
            sprite.addBebida(new Sprite(200 + serie));
            fanta.addBebida(new Fanta(300 + serie));
            kem.addBebida(new Kem(400 + serie));
        }
    }
    public Bebida comprarBebida(Moneda m, int cualBebida)throws PagoIncorrectoException , PagoInsuficienteException, NoHayBebidaException{
        
        if (m == null) {
            throw new PagoIncorrectoException("Error, estas intentando comprar sin dinero");
        }
        else if (m.getValor() < precio) {
            throw new PagoInsuficienteException("Error su moneda ingresada es inferior al precio");
        }
        else if(m.getValor() >= precio && coca.arrayLong()<1 && cualBebida == 1){ 
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(coca)");
        }
        
        else if(m.getValor() >= precio && sprite.arrayLong()<1 && cualBebida == 2){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(sprite)");
        }
        
        else if(m.getValor() >= precio && fanta.arrayLong()<1 && cualBebida == 3){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(fanta)");
        }
        
        else if(m.getValor() >= precio && kem.arrayLong()<1 && cualBebida == 4){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(kem)");
        }
        else if(m.getValor()>=precio){
            vuelto=m.getValor()-precio;
            ArrayMonedas MonedasDelExp = new ArrayMonedas();
            for(int i = 0 ; i < cantMonedas100(); i++){
                MonedasDelExp.addMoneda(getVuelto());
            }
            if (cualBebida == 1) {
                return coca.getBebida();
            }
            if (cualBebida == 2) {
                return sprite.getBebida();
            }
            if (cualBebida == 3) {
                return fanta.getBebida();
            }
            if (cualBebida == 4) {
                return kem.getBebida();
            }
        }
        return null;
    }
    public Moneda getVuelto(){
        
        if(vuelto == 0){
            return null;
        }
        else{
            Moneda m = new Moneda100();
            return m;
        }
    } 
    public int BebidaQueQueda(int i){
        switch (i) {
            case 1:
                return coca.arrayLong();
            case 2:
                return sprite.arrayLong();
            case 3:
                return fanta.arrayLong();
            case 4:
                return kem.arrayLong();
            default:
                break;
        }
        System.out.println("no esta esa opcion");
        return 0;
    }
    public int cantMonedas100(){
        return vuelto/100;
    }
    public int vueltoCliente(){
        return vuelto;
    }
}
