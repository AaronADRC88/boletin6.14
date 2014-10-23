/*(código: C1, precio: 24 euros), (código: H23, precio: 234 euros) y (código: M30, 
precio: 109 euros). A continuación debe cambiarse o segundo producto da factura 
polo seguinte (código: K123, precio:247 euros) e volve  a imprimir a factura */
package boletin6.pkg14;


public class Boletin614 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Tenda tenda1=new Tenda("C1",24f);
     Tenda tenda2=new Tenda("H23",234f);
     Tenda tenda3=new Tenda("M30",109f);
        System.out.println("prezos do C1, H23 e M30"+"\n"+tenda1.getCodigo()+"\t"+tenda1.getPrezo()+"€"+"\n"+tenda2.getCodigo()+"\t"
        +tenda2.getPrezo()+"€"+"\n"+tenda3.getCodigo()+"\t"+tenda3.getPrezo()+"€");
     Tenda tenda4=new Tenda("K123",247f);
     System.out.println("prezos do C1, H23 e M30"+"\n"+tenda1.getCodigo()+"\t"+tenda1.getPrezo()+"€"+"\n"+tenda4.getCodigo()+"\t"
        +tenda4.getPrezo()+"€"+"\n"+tenda3.getCodigo()+"\t"+tenda3.getPrezo()+"€");
        
    
  
        
     
     
     
     
     
     
     
     
        
    }
    
}
