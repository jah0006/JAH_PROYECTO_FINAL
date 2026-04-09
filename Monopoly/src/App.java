public class App {
    public static void main(String[] args) throws Exception {

        // CREACION JUGADORES
        Jugador jugador1 = new Jugador("Zapato");
        Jugador jugador2 = new Jugador("Perro");

        // CREACION CASILLAS
        Salida salida = new Salida("Salida");

        Carcel carcel1 = new Carcel("La Polisia");
        Carcel carcel2 = new Carcel("La Guardia Civi");

        Premio premio1 = new Premio("Fuente del Rey");
        Premio premio2 = new Premio("Los Adarves");
        Premio premio3 = new Premio("La Villa");
        Premio premio4 = new Premio("Paseillo");

        Multa multa1 = new Multa("Museum");
        Multa multa2 = new Multa("Cortijero");
        Multa multa3 = new Multa("Feria");
        Multa multa4 = new Multa("Gadabout");

        Vivienda vivienda1 = new Vivienda("Calle Río", 50);
        Vivienda vivienda2 = new Vivienda("Calle Ribera", 30);
        Vivienda vivienda3 = new Vivienda("Carrera de las Monjas", 30);
        Vivienda vivienda4 = new Vivienda("Carrera de Álvarez", 10);
        Vivienda vivienda5 = new Vivienda("Calle Dean Padilla", 5);
        Vivienda vivienda6 = new Vivienda("Calle Ronda", 5);
        Vivienda vivienda7 = new Vivienda("Avenida de España", 30);
        Vivienda vivienda8 = new Vivienda("Calle San Marcos", 35);
        Vivienda vivienda9 = new Vivienda("Calle Real", 40);
        Vivienda vivienda10 = new Vivienda("Calle Jazmines", 15);
        Vivienda vivienda11 = new Vivienda("Avenida de la Juventud", 30);
        Vivienda vivienda12 = new Vivienda("Avenida Niceto Alcala-Zamora", 50);
        Vivienda vivienda13 = new Vivienda("Calle Lozano Sidro", 50);
        Vivienda vivienda14 = new Vivienda("Calle Santa Ana", 50);
        Vivienda vivienda15 = new Vivienda("Calle Alta", 50);
        Vivienda vivienda16 = new Vivienda("Calle Tercia", 50);
        Vivienda vivienda17 = new Vivienda("Calle Jaén", 50);
        Vivienda vivienda18 = new Vivienda("Calle El Naranjo", 50);
        Vivienda vivienda19 = new Vivienda("Plaza de San Pedro", 50);
        Vivienda vivienda20 = new Vivienda("Plaza de Andalucia", 50);
        Vivienda vivienda21 = new Vivienda("Calle San Luis", 50);
        Vivienda vivienda22 = new Vivienda("Avenida de América", 50);
        Vivienda vivienda23 = new Vivienda("Calle Buen Suceso", 50);
        Vivienda vivienda24 = new Vivienda("Calle Málaga", 50);
        Vivienda vivienda25 = new Vivienda("Calle Loja", 50);

        Vacia vacia = new Vacia("      ");

        // CREACION DEL TABLERO
        Casilla[][] tablero = 
        {
            {salida, vivienda1, vivienda2, premio1, vivienda3, vivienda4, multa1, vivienda5,vivienda6, carcel1},
            {vivienda7,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda8},
            {vivienda9,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda10},
            {multa2,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,premio2},
            {vivienda11,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda12},
            {vivienda13,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda14},
            {premio3,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,multa3},
            {vivienda15,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda16},
            {vivienda17,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vacia,vivienda18},
            {carcel2, vivienda19, vivienda20, multa4, vivienda21, vivienda22, premio4, vivienda23, vivienda24, vivienda25}

        };

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i==0 || i==9 || j==0 || j==9) {
                    System.out.print(" ["+tablero[i][j].getNombre()+"] ");
                }else{
                    System.out.print("      ");
                }
            }System.out.println();
        }










        // for (int i = 0; i < tablero.length; i++) {
        // for (int j = 0; j < tablero.length; j++) {
        // if (i==0) {
        // tablero[i][j]=" O ";
        // }else if (i==9) {
        // tablero[i][j]=" O ";
        // }else if (j==9) {
        // tablero[i][j]=" O ";
        // }else if (j==0) {
        // tablero[i][j]=" O ";
        // }else{
        // tablero[i][j]=" ";
        // }
        // }
        // }

    }
}
