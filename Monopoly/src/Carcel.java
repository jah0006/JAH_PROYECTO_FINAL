public class Carcel extends Casilla{

    public Carcel(String nombre) {
        super(nombre);
    }

    public void enviarCarcel(Jugador jugador){
        jugador.setCarcel(1);
        System.out.println("(Jugador enviado a la carcel correctamente)");
    }

    @Override
    public String toString() {
        return "-------------------------------------------\n======= "+this.nombre+
        " =======\nTe han pillado los locales por hacer \nuna banana a una abuela (pobretica)\nDebes pasar una ronda en la cárcel\n-------------------------------------------";
    }

    
    
}
