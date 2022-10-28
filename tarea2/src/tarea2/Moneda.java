package tarea2;

public abstract class Moneda{
    public String getSerie(){ //significa que retorna su dirección en RAM como número de serie
        return this.toString();
    }
    public abstract int getValor(); //retorna la cantidad de $que vale la moneda
    public abstract String MonedaDevuelta();
}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super();
    }
    public int getValor(){
        return 1500;
    }
    public String MonedaDevuelta(){
        return "1500";
    }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
    public String MonedaDevuelta(){
        return "1000";
    }
}
class Moneda500 extends Moneda{
public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
    public String MonedaDevuelta(){
        return "500";
    }
}
class Moneda100 extends Moneda{
public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
    public String MonedaDevuelta(){
        return "--100--";
    }
}