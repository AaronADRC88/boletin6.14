/*(código: C1, precio: 24 euros), (código: H23, precio: 234 euros) y (código: M30, 
 precio: 109 euros). A continuación debe cambiarse o segundo producto da factura 
 polo seguinte (código: K123, precio:247 euros) e volve  a imprimir a factura */
package boletin6.pkg14;

public class Boletin614 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tenda tenda1 = new Tenda("C1", 24f);
        Tenda tenda2 = new Tenda("H23", 234f);
        Tenda tenda3 = new Tenda("M30", 109f);
        System.out.println("prezos do C1, H23 e M30" + "\n" + tenda1.toString() + "\t" + "\n" + tenda2.toString() + "\n" + tenda3.toString());
        tenda2.setCodigo("K123");
        tenda2.setPrezo(247);
        System.out.println("prezos do C1, K123 e M30" + "\n" + tenda1.toString() + "\t" + "\n" + tenda2.toString() + "\n" + tenda3.toString());
    }

}
