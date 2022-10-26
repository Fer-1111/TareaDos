package tarea2;

public class Tarea2 {

    public static void main(String[] args) {
        Moneda luka = new Moneda1000();
        Expendedor n1 = new Expendedor(1,1000);
        Comprador cliente = new Comprador(luka, 1, n1);
    }
}