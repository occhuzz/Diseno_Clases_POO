package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("Entrada USB", "Logitech");
        Raton raton1 = new Raton("Entrada Wireless", "DragonWar");
        Monitor monitor1 = new Monitor("Samsung", 15.0);
        Computadora pc1 = new Computadora("Computadora 1", monitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc1);
        orden1.mostrarOrden();
    }
}
