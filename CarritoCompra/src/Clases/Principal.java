    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import javax.swing.JOptionPane;
import java.util.ArrayList; 
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        
        Usuario usuarioActual=new Usuario();
        List<Productos> carrito=new ArrayList<>();
        boolean agregarMas=true;
        int id_producto=1;
        String nombre;
        String metodoPago;
        double total = 0.0;
        String recomendacion;
        
        //bucle para agregar los productos al carrito
        
        while(agregarMas){
           nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto");
           float precio;
           String precioStr = JOptionPane.showInputDialog("Ingrese el precio de " + nombre + ":");
           precio=Float.parseFloat(precioStr);
           String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion:");
           
           //crear los objetos productos
           
           Productos nuevoProductos=new Productos(
                   id_producto++,
                   nombre,
                   precio,
                   descripcion
           );
           
           //agregar el producto al carrito
           
           carrito.add(nuevoProductos);
           
           int respuesta=JOptionPane.showConfirmDialog(
                null,"'" + nombre + "' agregado. ¿Desea agregar otro producto?","Continuar", 
                JOptionPane.YES_NO_OPTION
            );
            if (respuesta == JOptionPane.NO_OPTION) {
                agregarMas = false;
            }
            
            //mostrar la informacion de carrito
            
            if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito de compras está vacío.");
        } else {
            String resumenCarrito = "CARRITO DE COMPRAS (" + carrito.size() + " productos):\n";
            
            // recorrer la lista para obtener los datos de cada producto
            
            for (Productos producto : carrito) {
                resumenCarrito += "--------------------------------------\n";
                resumenCarrito += producto.toString(); // agregar la informacion del producto
                total += producto.getPrecio();
            }
            
            resumenCarrito += "\n======================================\n";
            resumenCarrito += String.format("TOTAL A PAGAR: $%.3f", total);

            JOptionPane.showMessageDialog(null, resumenCarrito);
        }
    }//final de while
        
    metodoPago=JOptionPane.showInputDialog(null,"Total a pagar: " + String.format("$%.3f", total) + 
    "\nIngrese un número de tarjeta o Nequi (Simulación de pago):");
    
    if (metodoPago != null && metodoPago.length() <= 10) {  
    // mostrar confirmacion de pago
    JOptionPane.showMessageDialog(null,"¡Pago Exitoso!\nTotal cobrado: " + String.format("$%.3f", total) +
            "\nGracias por su compra.");
        
    carrito.clear();
    
    }else{
        JOptionPane.showMessageDialog(null, "Transacción fallida o cancelada. Intente de nuevo.");
    }
    
    
    //generar la recomendación y mostrarla
    recomendacion = usuarioActual.generarRecomendaciones();
    
    JOptionPane.showMessageDialog(null,"-- Recomendación Personalizada --\n" + recomendacion);
        
  }//final de void main
}//final de la clase
        
      
    


