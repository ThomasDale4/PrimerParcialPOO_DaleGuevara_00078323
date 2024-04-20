package Articulos;

public class Telefono extends Articulo{
    private String numeroTelefono;
    private int espacio;

    public Telefono(Articulo articulo, String numeroTelefono, int espacio){
        super(articulo);
        this.numeroTelefono = numeroTelefono;
        this.espacio = espacio;
    }

    @Override
    public void ObtenerDescripcion() {
        setDescripcion("Este es un telefono movil " + getModelo());
    }

    @Override
    public void ObtenerPrecio() {
        float precio = (float) (espacio * 2.5);
        setPrecio(precio);
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
}
