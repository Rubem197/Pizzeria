package principal;

enum TamanoPa {SEVILLA, GRANADA, ALMERIA}

enum SimpDoble {SIMPLE, DOBLE}

public class Pannini extends Producto {

    protected TamanoPa tamanoPa;
    protected SimpDoble simpDoble;
    protected  static int nPannini;

    public Pannini(Tipo tipo, TamanoPa tamanoPa, SimpDoble simpDoble) {
        super(tipo);
        this.tamanoPa = tamanoPa;
        this.simpDoble=simpDoble;
    }
}
