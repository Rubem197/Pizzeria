package principal;

import static principal.Producto.servir;

public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza(Tipo.CUATROQUESO, TamanoPi.FAMILIAR);
        Pizza pizza2 = new Pizza(Tipo.MARGARITA, TamanoPi.MEDIANA);
        Pizza pizza3 = new Pizza(Tipo.FUNGHI, TamanoPi.MEDIANA);
        Pannini pannini1 = new Pannini(Tipo.FUNGHI, TamanoPa.SEVILLA, SimpDoble.SIMPLE);
        Pannini pannini2 = new Pannini(Tipo.MARGARITA, TamanoPa.ALMERIA, SimpDoble.DOBLE);

        System.out.println(pizza1.getEstado());
        servir(pizza1);
        servir(pannini1);

    }
}
