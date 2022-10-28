package tarea2;

public class Comprador{
    private String tipoBebida;
    private int cuantoVuelto;
    private int serie; // extra, para confirmar que sacamos la bebida correcta
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        try{
            Bebida b = null;
            b = exp.comprarBebida(m, cualBebida);

            //ArrayMonedas MonedasDelExp = new ArrayMonedas();
            for(int i = 0 ; i < exp.cantMonedas100(); i++){
                //MonedasDelExp.addMoneda(exp.getVuelto());
                cuantoVuelto += exp.getVuelto().getValor();
            }

            cuantoVuelto = m.getValor()-1300;

            tipoBebida = b.beber();
            serie = b.getSerie();
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
    public int SerieBebida(){ // metodo creado para confirmar mi serie
        return serie;
    }
}