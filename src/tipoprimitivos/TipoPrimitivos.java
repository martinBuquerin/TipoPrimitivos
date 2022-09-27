
package tipoprimitivos;

/**
 *Clasificacion de los datos primitivos
 * @author Martín
 */
public class TipoPrimitivos {

    public static void main(String[] args) {
       /*
        Enteros: 
            -byte: 8 bits | Byte.MIN_VALUE   - Byte.MAX_VALUE
        
        */
       
        Byte enteroByte;
        Short enteroShort;
        Integer enteroInt;
        long enteroLong;
        float decimalFloat;
        double decimalDouble;
        char caracter='!';
        char caracter1='\u0021';
        
        System.out.println("Byte");
        System.out.println("Valor mínimo "+Byte.MIN_VALUE);
        System.out.println("Valor máximo "+ Byte.MAX_VALUE);

        System.out.println("");
        System.out.println("Short");
        System.out.println("Valor mínimo "+Short.MIN_VALUE);
        System.out.println("Valor máximo "+ Short.MAX_VALUE);
         
        System.out.println("");
        System.out.println("Integer");
        System.out.println("Valor mínimo "+ Integer.MIN_VALUE);
        System.out.println("Valor máximo "+ Integer.MAX_VALUE);
        
        System.out.println("");
        System.out.println("Long");
        System.out.println("Valor mínimo "+ Long.MIN_VALUE);
        System.out.println("Valor máximo "+ Long.MAX_VALUE);
        
        System.out.println("");
        System.out.println("Float");
        System.out.println("Valor mínimo "+ Float.MIN_VALUE);
        System.out.println("Valor máximo "+ Float.MAX_VALUE);
        
        System.out.println("");
        System.out.println("Double");
        System.out.println("Valor mínimo "+ Double.MIN_VALUE);
        System.out.println("Valor máximo "+ Double.MAX_VALUE);
        
        System.out.println("");
        System.out.println("Char");
        System.out.println("Valor caracter "+ caracter);
        System.out.println("Valor caracter1 "+ caracter1);
        
        
        
        String test = "hola";
        Integer testing = Integer.parseInt(test);
        System.out.println(testing);
    
    }
    
}
