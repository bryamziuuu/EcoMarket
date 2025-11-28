/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Productos {
    public int id;
    public String reseña="";
    public String nombre="";
    public float precio;
    public String descripcion="";
    public String categoria="";
    
    //constructor principal
    public Productos(int id, String reseña, String nombre, float precio, String descripcion, String categoria){
        this.id=id;
        this.reseña=reseña;
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        this.categoria=categoria;
    }
    
    //constructor sin reseñas y categoria en caso de quel el usuario no haga reseñas
    
    public Productos(int id, String nombre, float precio, String descripcion){
        this.id=id;
        this.reseña="sin reseña";
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        this.categoria="sin asignar";
    }
    
    //constructor donde el usuario digita informacion
    
    public Productos(String nombre, float precio, String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        this.categoria="sin asignar";
        
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
 

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    //metodo para mostrar la informacion
    
    @Override
    public String toString(){
        String precioFormateado = String.format("%.3f", this.precio);
        return("\n id: "+id+"\n Comentarios: "+reseña+ "\n Nombre: "+nombre+ "\n Precio $:"+precioFormateado +
                "\n Descripcion: "+descripcion+"\n Categoria: "+categoria);
    }
    
    

    
            
}
