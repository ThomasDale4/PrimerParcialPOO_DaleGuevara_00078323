package Articulos;

public class Articulo implements DescripcionPrecio{
    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;

    public Articulo(){

    }
    public Articulo(String nombre, String modelo){
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public Articulo(Articulo articulo){
        setNombre(articulo.nombre);
        setModelo(articulo.modelo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
