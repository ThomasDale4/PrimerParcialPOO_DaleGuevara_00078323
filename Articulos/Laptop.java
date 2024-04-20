package Articulos;

public class Laptop extends Articulo{
    private int cores;
    private int tamanoPantalla;

    public Laptop(Articulo articulo, int cores, int tamanoPantalla){
        super(articulo);
        this.cores = cores;
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public void ObtenerDescripcion() {
        setDescripcion("Este es una laptop " + getModelo());
    }

    @Override
    public void ObtenerPrecio() {
        float precio = (float) (cores * tamanoPantalla * 15);
        setPrecio(precio);
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
}
