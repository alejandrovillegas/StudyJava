/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinabebidas;

public class ClassMaquina {
    int stockBebidas=0;
    int cantidadVendidas=0;
    int precioBebida=500;
    boolean pagado=false;
    
    public void inicializar (
    int stockActual,
    int precioActual) {
        this.stockBebidas=stockActual;
        this.precioBebida = precioActual;
        
    }
    public void comprar() {
        if (this.stockBebidas > 0) {
            //vender
            this.stockBebidas = this.stockBebidas -1;
            this.cantidadVendidas = this.cantidadVendidas +1;
            System.out.println("retire su bebida y su dinero");
            
         {
        
    }
        }else{
            //devolver y avisar
        System.out.println("no hay bebidas, toma su vuelta");
        }
    }
    
    public int getStockDisponible (){
        return this.stockBebidas;
    }
    public int getDineroRecaudado (){
        return this.cantidadVendidas * this.precioBebida;
    }
    public void repararStock (int cantidadNueva) {
        this.stockBebidas = cantidadNueva;
    }
}
