import java.util.Arrays;

public class Jugador {
    private String figura;
    private double saldo;
    private Vivienda[] propiedades;
    private int casillaX;
    private int casillaY;

    public Jugador(String figura) {
        this.figura = figura;
        this.saldo = 100;
        this.casillaX = 0;
        this.casillaY = 0;
    }
    public String getFigura() {
        return figura;
    }
    public void setFigura(String figura) {
        this.figura = figura;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Vivienda[] getPropiedades() {
        return this.propiedades;
    }
    public void setPropiedades(Vivienda[] propiedades) {
        this.propiedades = propiedades;
    }
    public int getCasillaX() {
        return this.casillaX;
    }
    public void setCasillaX(int casillaX) {
        this.casillaX = casillaX;
    }
    public int getCasillaY() {
        return this.casillaY;
    }
    public void setCasillaY(int casillaY) {
        this.casillaY = casillaY;
    }

    @Override
    public String toString() {
        return "Jugador [figura=" + figura + ", saldo=" + saldo + ", propiedades=" + Arrays.toString(propiedades)
                + ", casillaX=" + casillaX + ", casillaY=" + casillaY + "]";
    }

    

    
}
