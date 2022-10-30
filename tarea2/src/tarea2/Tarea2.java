package tarea2;

public class Tarea2 {

    public static void main(String[] args){
        int precioBebidas = 1300;
        int bebidasDepositadas = 5;
        Expendedor expBebidas = new Expendedor(bebidasDepositadas, precioBebidas);
        Moneda moneda1500 = new Moneda1500();
        Moneda moneda500 = new Moneda500();
        Moneda moneda1000 = new Moneda1000();
        int cocaCola = 1;
        int sprite = 2;
        int fanta = 3;
        int kem = 4;

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Sergio");
        Comprador Sergio = new Comprador(moneda1500, cocaCola, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(cocaCola)+ " "+Sergio.queBebiste()+" por ende bebi una");
        System.out.println("serie de la bebida: "+Sergio.SerieBebida()+" y mi vuelto es: "+Sergio.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Fernanda");
        Comprador Fernanda = new Comprador(moneda1500, cocaCola, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(cocaCola)+ " "+Fernanda.queBebiste()+" por ende bebi una");
        System.out.println("serie de la bebida: "+Fernanda.SerieBebida()+" y mi vuelto es: "+Fernanda.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Jorge");
        Comprador Jorge = new Comprador(moneda1500, sprite, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(sprite)+ " "+Jorge.queBebiste()+" por ende bebi una");
        System.out.println("serie de la bebida: "+Jorge.SerieBebida()+" y mi vuelto es: "+Jorge.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Pedro");
        Comprador Pedro = new Comprador(null, fanta, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(fanta)+ " "+Pedro.queBebiste()+" por ende bebi cero");
        System.out.println("serie de la bebida: "+Pedro.SerieBebida()+" y mi vuelto es: "+Pedro.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Andres");
        Comprador Andres = new Comprador(moneda1000, kem, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(kem)+ " "+Andres.queBebiste()+" por ende bebi cero");
        System.out.println("serie de la bebida: "+Andres.SerieBebida()+" y mi vuelto es: "+Andres.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Miguel");
        Comprador Miguel = new Comprador(moneda500, sprite, expBebidas);
        System.out.println("hay: "+expBebidas.BebidaQueQueda(kem)+ " "+Miguel.queBebiste()+" por ende bebi cero");
        System.out.println("serie de la bebida: "+Miguel.SerieBebida()+" y mi vuelto es: "+Miguel.cuantoVuelto());
        System.out.println("-------------------------------------------------------------------------------------");
    }
}