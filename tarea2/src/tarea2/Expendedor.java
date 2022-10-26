package tarea2;

public class Expendedor {

    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private Deposito kem;
    private int precio;
    public Vuelto vueltoMaquina;

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

        if (cualBebida == 1) { //es coca
            coca.getBebida();
        }
        if (cualBebida == 2) { //es sprite
            sprite.getBebida();
        }
        if (cualBebida == 3) { // es fanta
            fanta.getBebida();
        }
        if (cualBebida == 4) { // es kem
            kem.getBebida();
        }
    }

    public Bebida comprarBebida(Moneda m, int cualBebida) throws PagoIncorrectoException , PagoInsuficienteException, NoHayBebidaException{
        Bebida b = null;

        if (m == null) { //PagoIncorrectoException cuando compra sin dinero
            throw new PagoIncorrectoException("Error, estas intentando comprar sin dinero");
        }
        if (m.getValor() < precio) { //Pago insuficiente, bebida por un valor inferior al precio
            throw new PagoInsuficienteException("Error su moneda ingresada es inferior al precio");
        }
        //NohaybebidaException
        if(m.getValor() >= precio && coca.getBebida()==null){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada");
        }
        
        if(m.getValor() >= precio && sprite.getBebida()==null){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada");
        }
        
        if(m.getValor() >= precio && fanta.getBebida()==null){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada");
        }
        
        if(m.getValor() >= precio && kem.getBebida()==null){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada");
        }
        
        
        //compra exitosa de coca
        if (cualBebida == 1 && m.getValor() >= precio) {
            return coca.getBebida();
        }
        if (cualBebida == 2 && m.getValor() >= precio) {
            return sprite.getBebida();
        }
        if (cualBebida == 3 && m.getValor() >= precio) {
            return fanta.getBebida();
        }
        if (cualBebida == 4 && m.getValor() >= precio) {
            return kem.getBebida();
        }

        return null;

    }

    public void getVuelto() { //retorna moneda, null si deposito está vacío
        //Vuelto VueltoMaquina = new Vuelto();
        Moneda m = new Moneda100();
        vueltoMaquina.addMoneda(m);
    }
}



