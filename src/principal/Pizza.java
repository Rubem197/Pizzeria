package principal;

enum TamanoPi {MEDIANA, FAMILIAR}

public class Pizza extends Producto {

    protected TamanoPi tamanoPi;
    protected static int nPizza;
    public Pizza( Tipo tipo, TamanoPi tamanoPi) {
        super(tipo);
        this.tamanoPi = tamanoPi;
        nPizza++;
    }

}
