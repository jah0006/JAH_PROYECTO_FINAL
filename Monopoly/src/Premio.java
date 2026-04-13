public class Premio extends Casilla{

    public Premio(String nombre) {
        super(nombre);
    }

    public void darPremio(Jugador jugador){
        jugador.setSaldo(jugador.getSaldo()+20);
        System.out.println("(Premio ingresado correctamente)");
    }
    
    @Override
    public String toString() {
        return "-------------------------------------------\n======= "+this.nombre+" =======";
    }
}
