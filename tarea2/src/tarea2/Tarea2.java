package tarea2;

public class Tarea2 {

    public static void main(String[] args){
        Moneda milQuinientos = new Moneda1500();

        Expendedor exp = new Expendedor(2,2); 
        System.out.println("hay "+exp.BebidaQueQueda()+" bebidas");
        Comprador Sergio = new Comprador(milQuinientos, 1, exp);
        System.out.println("su vuelto es: "+Sergio.cuantoVuelto()+" y quedan: "+exp.BebidaQueQueda()+" bebida: "+Sergio.queBebiste());
        System.out.println("serie bebida: "+Sergio.SerieBebida());
    
        }
}
/*
Moneda milQuinientos = new Moneda1500();
        Expendedor exp = new Expendedor(3,1);
        Expendedor exp = new Expendedor(5,2); 

        System.out.println("hay: "+exp.BebidaQueQueda());
        Comprador Sergio = new Comprador(milQuinientos, 2, exp);
        System.out.println("su vuelto es: "+Sergio.cuantoVuelto()+" y quedan: "+exp.BebidaQueQueda()+" bebida: "+Sergio.queBebiste());
        System.out.println("serie bebida: "+Sergio.SerieBebida());
        Sergio = new Comprador(milQuinientos, 1, exp);
        System.out.println("su vuelto es: "+Sergio.cuantoVuelto()+" y quedan: "+exp.BebidaQueQueda()+" bebida: "+Sergio.queBebiste());
        System.out.println("serie bebida: "+Sergio.SerieBebida());
        Sergio = new Comprador(null, 1, exp);
        System.out.println("su vuelto es: "+Sergio.cuantoVuelto()+" y quedan: "+exp.BebidaQueQueda()+" bebida: "+Sergio.queBebiste());
        System.out.println("serie bebida: "+Sergio.SerieBebida());
*/