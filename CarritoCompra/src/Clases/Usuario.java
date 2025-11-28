/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    private List<Productos> historialCompra;

    public Usuario() {
        this.historialCompra = new ArrayList<>();
    }
    
    public void agregarHiistorial(Productos p){
        this.historialCompra.add(p);
    }
    
    //metodo para la recomiendacion
    
    public String generarRecomendaciones(){
        if(historialCompra.isEmpty()){
            return("no hay suficiente historial para generar recomendacion");
        }
        
        // Obtener la categoría del último producto comprado
        Productos ultimoProducto = historialCompra.get(historialCompra.size()-1);
        String categoriaPreferida = ultimoProducto.getCategoria();
        
        String mensaje = "Basado en tu última compra de '" + ultimoProducto.getNombre() + 
                         "', te podría interesar lo siguiente:\n\n";
        
        if (!categoriaPreferida.equals("Lácteos")) 
            if (categoriaPreferida.equals("Granos")) {
            mensaje += "Te recomendamos: Lentejas de 1kg (Categoría Granos)";
        } else {
            mensaje += "Te recomendamos: Pan Integral (Categoría Otros)";
        } else {
            mensaje += "Te recomendamos: Queso Mozzarella (Categoría Lácteos)";
        }
        
        return mensaje;
    }
    }//fin de la clase usuario
