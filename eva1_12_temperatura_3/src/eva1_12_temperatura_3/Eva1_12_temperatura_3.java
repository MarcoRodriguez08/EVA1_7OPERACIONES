/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura_3;

/**
 *
 * @author bisonte
 */
public class Eva1_12_temperatura_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double temp, cel, far;
        Scanner captu = new Scanner(System.in);
        //Solicitar datos al usario
        System.out.println("CAPURE TEMPERATURA EN GRADOS KELVIN:");
        temp = captu.nextDouble();
               
        //HACE EL CALCULO
        cel = temp - 273.15;//grados celcius
        far = 1.8*(temp-273.15)+32;//kelvin
        //recuerda que si divides entre doubles tiene que ser otro double para que te de el resultado en decimal, es decir ponle el ".0"
        
        //MOSTRAR RESULTADOS
        System.out.println(temp + "K = " + cel + "C");
        
        System.out.println(temp + "F = " + far + "F");
        
    }
    
}
