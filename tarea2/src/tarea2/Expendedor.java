package tarea2;

public class Expendedor {

    //atributos
    
    private final Deposito coca;
    private final Deposito sprite;
    private final Deposito fanta;
    private final Deposito kem;
    private final int precio;

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
        else if(m.getValor() >= precio && coca.getBebida()==null && cualBebida == 1){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(coca)");
        }
        
        else if(m.getValor() >= precio && sprite.getBebida()==null&& cualBebida == 2){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(sprite)");
        }
        
        else if(m.getValor() >= precio && fanta.getBebida()==null && cualBebida == 3){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(fanta)");
        }
        
        else if(m.getValor() >= precio && kem.getBebida()==null && cualBebida == 4){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(kem)");
        }
        else if(m.getValor()>=1300){
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
    public void getVuelto() { //retorna moneda, null si deposito está vacío
        Vuelto vueltoMaquina = new Vuelto();
        Moneda m = new Moneda100();
        vueltoMaquina.addMoneda(m);
    }
    public int BebidaQueQueda(){
        return coca.arrayLong();
    }
}



