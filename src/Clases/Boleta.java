/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tedhay
 */
public class Boleta {
  
    private int cantidad, precio;
    private String categoria,tipoPago;

    public Boleta() {
    }
    
    public double ImportePagar(){
        return (getCantidad()*getPrecio());
    }
    
    
/*
    @Override
    public String toString() {
        return "   *********Detalle de Boleta*********     " + "\ncantidad = " + cantidad +  "\nprecio = " + precio + "\nTipo Pago =" + Tipo()+ "\nImporte Pagar=" + ImportePagar()+"\n\n";
    }*/

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    
    
    
    
    
}
