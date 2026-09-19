/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                double a,b,c, res1, res2;
        Scanner captu = new Scanner(System.in);// 
        //Solicitar datos al usario
        System.out.println("VALOR a:");
        a = captu.nextDouble(); 
        
        System.out.println("VALOR b:");
        b = captu.nextDouble();
        
        System.out.println("VALOR c:");
        c = captu.nextDouble();
        
        //HACE EL CALCULO
        res1 = ((-1*b)+( Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        res2 = ((-1*b)-(Math.sqrt(Math.pow(b, 2)-4*a*c)))/2*a;
        
        System.out.print("El primer resultado es:");
        System.out.println(res1);
        
        System.out.print("El segundo resultado es:");
        System.out.println(res2);
        
       
        //recuerda que si divides entre doubles tiene que ser otro double para que te de el resultado en decimal, es decir ponle el ".0" en este caso el a puede ser fracionario porque es souble entonces se deja asi
        
        //MOSTRAR RESULTADOS2
       
    }
    
}
