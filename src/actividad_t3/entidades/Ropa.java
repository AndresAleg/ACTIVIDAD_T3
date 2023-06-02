package actividad_t3.entidades;

/**
 *
 * @author Andres
 */
public class Ropa extends Producto implements Precio {
    
    private String genero;
    private String color;
    private double precio;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double conseguirPrecio() {
        return precio;
    }
    
    @Override
    public String mostrarInformacion() {
        return getNombre() + " - " + 
                getGenero() + " - " + 
                getColor() + " - " + 
                conseguirPrecio();
    }
}