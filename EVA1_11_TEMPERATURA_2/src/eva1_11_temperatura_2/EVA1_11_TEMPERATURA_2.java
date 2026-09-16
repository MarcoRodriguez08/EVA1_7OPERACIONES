/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, cel, kelvin;
        Scanner captu = new Scanner(System.in);
        //Solicitar datos al usario
        System.out.println("CAPURE TEMPERATURA EN GRADOS FAHRENHEIT:");
        temp = captu.nextDouble();
               
        //HACE EL CALCULO
        cel = (temp - 32)/1.8;//grados celcius
        kelvin = (temp -32)*(5/9.0)+ 273.15;//kelvin
        //recuerda que si divides entre doubles tiene que ser otro double para que te de el resultado en decimal, es decir ponle el ".0"
        
        //MOSTRAR RESULTADOS
        System.out.println(temp + "f = " + cel + "C");
        
        System.out.println(temp + "f = " + kelvin + "K");
        
    }
    
}
