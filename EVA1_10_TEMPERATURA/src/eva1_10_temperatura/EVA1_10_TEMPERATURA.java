/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, far, kelvin;
        Scanner captu = new Scanner(System.in);
        //Solicitar datos al usario
        System.out.println("CAPURE TEMPERATURA EN GRADIS CELCIUS");
        temp = captu.nextDouble();
        
        
        //HACE EL CALCULO
        far = (temp * 1.8)+32;//grados farenheit
        kelvin = temp + 273.15;//kelvin
        
        //MOSTRAR RESULTADOS
        System.out.println(temp + "c = " + far + "F");
        
        System.out.println(temp + "c = " + kelvin + "K");
        
        
       
    }
    
}
