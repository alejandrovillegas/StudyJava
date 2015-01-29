/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinabebidas;
import java.util.Scanner;

public class MaquinaBebidas {

       public static void main(String[] args) {
           
       ClassMaquina omaquina = new ClassMaquina();
       int opcion=0;
       int cantidadNueva =0;
       Scanner sc = new Scanner (System.in);
       
       omaquina.inicializar(100, 500);
       
       while (opcion != 5){
           System.out.println("Ingrese Opcion: ");
           opcion = sc.nextInt();
           switch (opcion) {
               case 1:
                   omaquina.comprar ();
                   break;
               case 2:
                   System.err.println("el stock disponible es: "+ omaquina.getStockDisponible());
                   break;
               case 3:
                   System.err.println("el dinero recaudado es: "+ omaquina.getDineroRecaudado());
                   break;
               case 4: 
                   System.err.println("Indique cantidad Nueva: ");
                   cantidadNueva = sc.nextInt();
                   omaquina.repararStock(cantidadNueva);
                   break;
                   
           }
       }
           
        // TODO code application logic here
    }
    
}
