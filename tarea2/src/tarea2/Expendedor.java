package tarea2;

public class Expendedor {

    //atributos
    
    private final Deposito coca;
    private final Deposito sprite;
    private final Deposito fanta;
    private final Deposito kem;
    private final int precio;
    private int vuelto;

    public Expendedor(int cantBebidas, int cualBebida) {
        
        //creamos los depositos de cada bebida para llenar el expendedor
        
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        kem = new Deposito();
        
        //asignamos un precio a nuestras bebidas
        precio = 1300;
        
        // si escogio opcion i{1,2,3,4}, se hace un ciclo en el cual llenamos nuestra expendedora, segun la cantidad
        //de bebidas que ingresamos, usamos addBebida para llenar, en el cual tiene como parametro una bebida, que le
        //ingresamos y recordar que bebida tiene su serie.
        if (cualBebida == 1) {
            for (int serie = 0; serie < cantBebidas; serie++) {
                coca.addBebida(new CocaCola(100 + serie));
            }   
        }
        if(cualBebida == 2){
            for (int serie = 0; serie < cantBebidas; serie++) {
                sprite.addBebida(new Sprite(200 + serie));
            }
        }
        if(cualBebida == 3){
            for (int serie = 0; serie < cantBebidas; serie++) {
                fanta.addBebida(new Fanta(300 + serie));
            }
        }
        if(cualBebida == 4){
            for (int serie = 0; serie < cantBebidas; serie++) {
                kem.addBebida(new Kem(400 + serie));
            }
        }
        //segun sergio esta bien esto
    }
    public Bebida comprarBebida(Moneda m, int cualBebida)throws PagoIncorrectoException , PagoInsuficienteException, NoHayBebidaException{
        
        if (m == null) { //PagoIncorrectoException cuando compra sin dinero
            throw new PagoIncorrectoException("Error, estas intentando comprar sin dinero");
        }
        else if (m.getValor() < precio) { //Pago insuficiente, bebida por un valor inferior al precio
            throw new PagoInsuficienteException("Error su moneda ingresada es inferior al precio");
        }
        //NohaybebidaException
        else if(m.getValor() >= precio && coca.arrayLong()==0 && cualBebida == 1){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(coca)");
        }
        
        else if(m.getValor() >= precio && sprite.arrayLong()==0&& cualBebida == 2){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(sprite)");
        }
        
        else if(m.getValor() >= precio && fanta.arrayLong()==0 && cualBebida == 3){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(fanta)");
        }
        
        else if(m.getValor() >= precio && kem.arrayLong()==0 && cualBebida == 4){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(kem)");
        }
        else if(m.getValor()>=precio){
            vuelto = m.getValor() - precio;
            ArrayMonedas MonedasDelExp = new ArrayMonedas();
            
            if (cualBebida == 1) { //compra exitosa de coca
                for(int i = 0 ; i < cantMonedas100(); i++){
                    MonedasDelExp.addMoneda(getVuelto());
                    System.out.println(MonedasDelExp.Monedas(i)); 
                }
                //System.out.println("hay "+ MonedasDelExp.arrayLong() +" monedas de 100");
                return coca.getBebida();
            }
            if (cualBebida == 2) {
                for(int i = 0 ; i < cantMonedas100(); i++){
                    MonedasDelExp.addMoneda(getVuelto());
                    //System.out.println("hay "+(i+1)+ " monedas"+MonedasDelExp.Monedas(i)); 
                }
                return sprite.getBebida();
            }
            if (cualBebida == 3) {
                for(int i = 0 ; i < cantMonedas100(); i++){
                    MonedasDelExp.addMoneda(getVuelto());
                    //System.out.println("hay "+(i+1)+ " monedas"+MonedasDelExp.Monedas(i)); 
                }
                return fanta.getBebida();
            }
            if (cualBebida == 4) {
                for(int i = 0 ; i < cantMonedas100(); i++){
                    MonedasDelExp.addMoneda(getVuelto());
                    //System.out.println("hay "+(i+1)+ " monedas "+MonedasDelExp.Monedas(i)); 
                }
                return kem.getBebida();
            }
        }
        return null;
    }
    public Moneda getVuelto() { //retorna moneda, null si deposito está vacío
        Moneda m = new Moneda100();
        return m;
    }
    public int BebidaQueQueda(){///////////
        return coca.arrayLong();
        
    }
    public int cantMonedas100(){
        return vuelto/100;
    }
}


