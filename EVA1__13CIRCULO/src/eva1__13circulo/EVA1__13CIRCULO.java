/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1__13circulo;

import java.util.Scanner;// Se ua para que el prgrama pueda leer el teclado

/**
 *
 * @author bisonte
 */
public class EVA1__13CIRCULO {
    static final double PI =3.1416;//"Static final" se usa para convertir las variables en constantes 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double radio, per, vol, are;
        Scanner captu = new Scanner(System.in);// 
        //Solicitar datos al usario
        System.out.println("CAPURE EL RADIO DEL CIRCULO:");
        radio = captu.nextDouble();  // el radio es igual a lo que se capure
        
               
        //HACE EL CALCULO
        per = 2*Math.PI*radio;
        are =Math.PI*Math.pow(radio, 2);
        vol = (4/3.0)*Math.PI*radio*radio*radio;
        //recuerda que si divides entre doubles tiene que ser otro double para que te de el resultado en decimal, es decir ponle el ".0"
        
        //MOSTRAR RESULTADOS
        System.out.println("El perimetro es:"+per);
        
        System.out.println("El Área es:"+ are);
        
       System.out.println("El Volumen es:"+ vol);
    }
    
}
