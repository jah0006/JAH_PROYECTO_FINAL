public class Vivienda extends Casilla{
    private double precio;
    private boolean disponibilidad;
    private Jugador propietario;

    public Vivienda(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
        this.disponibilidad = true;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Jugador getPropietario() {
        return propietario;
    }

    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vivienda [nombre=" + nombre + ", precio=" + precio + ", disponibilidad=" + disponibilidad
                + ", propietario=" + propietario + "]";
    }

    
    
}
