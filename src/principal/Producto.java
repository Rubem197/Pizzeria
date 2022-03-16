package principal;

enum Tipo {MARGARITA, CUATROQUESO, FUNGHI}

enum Estado {PEDIDA, SERVIDA}

public class Producto {
    protected static Estado estado;
    public Producto(Tipo tipo) {
        this.estado=Estado.PEDIDA;
    }

    public static void servir(Producto producto){
        producto.setEstado(Estado.SERVIDA);
    }


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
