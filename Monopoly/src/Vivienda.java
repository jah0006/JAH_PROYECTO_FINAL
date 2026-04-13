public class Vivienda extends Casilla{
    private double precio;
    private boolean disponibilidad;
    private String disponible;

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

    @Override
    public String toString() {
        if (this.disponibilidad) {
            this.disponible = "Si";
        }else{
            this.disponible = "No";
        }
        return "-------------------------------------------\n======= "+this.nombre+" =======\n\t| Precio: "+this.precio+"\n\t| Disponibilidad: "+this.disponible+" está disponible\n-------------------------------------------";
    }

    
    
}
