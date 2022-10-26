package tarea2;

public class Tarea2 {

    public static void main(String[] args){
        Moneda milQuinientos = new Moneda1500();
        Expendedor exp = new Expendedor(2,2); //1 coca cola
        exp = new Expendedor(1,2); //1 sprites
        exp = new Expendedor(1,3); //1 fantas
        exp = new Expendedor(1,4); // 1 kem
        Comprador cliente = new Comprador(milQuinientos, 1, exp); // tiene mil, elije bebida 1 que es coca cola, del expendedor exp
    }
}