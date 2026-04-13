import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // CREACION JUGADORES
        Jugador jugador1 = new Jugador("Zapato");
        Jugador jugador2 = new Jugador("Perro");

        //Array de jugadores
        Jugador[] jugadores = {jugador1, jugador2};

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

        // CREACION DE LOS TABLEROS

        // en esta matriz, guardo todas las casillas que hay para darles una posicion
        Casilla[][] tableroCasillas = {
                { salida, vivienda1, vivienda2, premio1, vivienda3, vivienda4, multa1, vivienda5, vivienda6, carcel1 },
                { vivienda7, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda8 },
                { vivienda9, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda10 },
                { multa2, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, premio2 },
                { vivienda11, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda12 },
                { vivienda13, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda14 },
                { premio3, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, multa3 },
                { vivienda15, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda16 },
                { vivienda17, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vacia, vivienda18 },
                { carcel2, vivienda19, vivienda20, multa4, vivienda21, vivienda22, premio4, vivienda23, vivienda24, vivienda25 }

        };

        //esta matriz, sera la que se verá por consola
        String[][] tablero = new String[10][10];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i == 0) {
                    tablero[i][j] = " O ";
                } else if (i == 9) {
                    tablero[i][j] = " O ";
                } else if (j == 9) {
                    tablero[i][j] = " O ";
                } else if (j == 0) {
                    tablero[i][j] = " O ";
                } else {
                    tablero[i][j] = "   ";
                }
            }
        }

        //Creacion Scanner y variables que se utilizaran
        Scanner sc = new Scanner(System.in);
        int numDado = 0;
        int eleccion = 0;

        //comienza el bucle de la partida
        while (true) {
            if (jugador1.getSaldo()>0 && jugador2.getSaldo()>0) {
                

                for (int i = 0; i < jugadores.length; i++) {
                    if (jugadores[i].getCarcel()==0) {
                        System.out.println("TURNO DE "+jugadores[i].getFigura().toUpperCase()+" (Jugador "+(i+1)+")");
                        System.out.println("Tira el dado (Enter)");
                        sc.nextLine();
                        numDado = Dado.tirarDado();
                        System.out.println("\t<< "+numDado+" >>\n");

                        //VUELVO A PONER TODO EL TABLERO CON 0
                        for (int h = 0; h < tablero.length; h++) {
                            for (int j = 0; j < tablero.length; j++) {
                                if (h == 0) {
                                    tablero[h][j] = " O ";
                                } else if (h == 9) {
                                    tablero[h][j] = " O ";
                                } else if (j == 9) {
                                    tablero[h][j] = " O ";
                                } else if (j == 0) {
                                    tablero[h][j] = " O ";
                                } else {
                                    tablero[h][j] = "   ";
                                }
                            }
                        }


                        //movimiento del jugador a lo largo del tablero, segun el resultado del dado

                        for (int j = 0; j < numDado; j++) {
                            if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()==0 && jugadores[i].isComenzado()) { //si ha comenzado la partida y pasa por 0,0 se le suman 20
                                jugadores[i].setSaldo(jugadores[i].getSaldo()+20); 
                                System.out.println("Casilla de Salida. Recibes 20ME");
                                jugadores[i].setCasillaY(jugadores[i].getCasillaY()+1);            
                            }else if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()<9) {  //lado superior del tablero
                                jugadores[i].setCasillaY(jugadores[i].getCasillaY()+1);
                                jugadores[i].setComenzado(true);

                            }else if (jugadores[i].getCasillaY()==9 && jugadores[i].getCasillaX()<9) {  //lado derecho del tablero
                                jugadores[i].setCasillaX(jugadores[i].getCasillaX()+1);

                            }else if (jugadores[i].getCasillaX()==9 && jugadores[i].getCasillaY()>0) {  //lado inferior del tablero
                                jugadores[i].setCasillaY(jugadores[i].getCasillaY()-1);

                            }else if (jugadores[i].getCasillaY()==0 && jugadores[i].getCasillaX()>0) {  //lado izquierdo del tablero
                                jugadores[i].setCasillaX(jugadores[i].getCasillaX()-1);
                            }

                        }

                        //MODIFICA EL TABLERO CON LA POSICION DE LOS JUGADORES      
                        if (jugadores[0].getCasillaX()==jugadores[1].getCasillaX() && jugadores[0].getCasillaY()==jugadores[1].getCasillaY()) {
                            tablero[jugadores[i].getCasillaX()][jugadores[i].getCasillaY()] = " X ";
                        }else{
                            tablero[jugadores[0].getCasillaX()][jugadores[0].getCasillaY()] = " 1 ";
                            tablero[jugadores[1].getCasillaX()][jugadores[1].getCasillaY()] = " 2 ";
                        }

                            //MUESTRO EL TABLERO (POSICIONES)
                        for (int j = 0; j < tablero.length; j++) {
                            for (int j2 = 0; j2 < tablero.length; j2++) {
                                System.out.print(tablero[j][j2]);
                            }System.out.println();
                        }System.out.println();

                            // diferentes acciones segun la casilla donde se caiga

                            //CASILLAS ESPECIALES
                        if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()==0) {                               //casilla de salida
                            System.out.println(tableroCasillas[jugadores[i].getCasillaX()][jugadores[i].getCasillaY()]);

                                                                                                                            //casilla carcel
                        }else if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()==9 || jugadores[i].getCasillaX()==9 && jugadores[i].getCasillaY()==0) {
                            System.out.println(tableroCasillas[jugadores[i].getCasillaX()][jugadores[i].getCasillaY()]);
                            carcel1.enviarCarcel(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()==3) {                         //casilla premio1
                            System.out.println(premio1);
                            System.out.println("Has ido a ver la Fuente de la Salud \ny te has encontrado dinero del que \nsuelen tirar a la fuente.\nGanas 20ME\n-------------------------------------------");
                            premio1.darPremio(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==3 && jugadores[i].getCasillaY()==9) {                         //casilla premio2
                            System.out.println(premio2);
                            System.out.println("Paseando por el Balcon del Adarve, \nte encuentras un billete en el suelo.\nGanas 20ME\n-------------------------------------------");
                            premio2.darPremio(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==6 && jugadores[i].getCasillaY()==0) {                         //casilla premio3
                            System.out.println(premio3);
                            System.out.println("Dando un paseo por la Villa, \nse cae una maceta y ves que \ntiene billetes dentro.\nGanas 20ME\n-------------------------------------------");
                            premio3.darPremio(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==9 && jugadores[i].getCasillaY()==6) {                         //casilla premio4
                            System.out.println(premio4);
                            System.out.println("En el paseillo le robas el sombrero a \nun hombre que estaba pidiendo.\nPoco ético, pero ganas dinero.\nGanas 20ME\n-------------------------------------------");
                            premio4.darPremio(jugadores[i]);

                        }else if (jugadores[i].getCasillaX()==0 && jugadores[i].getCasillaY()==6) {                         //casilla multa1
                            System.out.println(multa1);
                            System.out.println("Sales de fiesta a la Museum \ny te pegan una atracada por el \nprecio de la entrada y una copa.\nPierdes 20ME\n-------------------------------------------");
                            multa1.darMulta(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==3 && jugadores[i].getCasillaY()==0) {                         //casilla multa2
                            System.out.println(multa2);
                            System.out.println("Vas a cenar al Cortijero, \nla comida está buenísima \npero un poco caro.\nPierdes 20ME\n-------------------------------------------");
                            multa2.darMulta(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==6 && jugadores[i].getCasillaY()==9) {                         //casilla multa3
                            System.out.println(multa3);
                            System.out.println("Te cruzas con la Feria de Priego, \nacabas solo a las 5 de la mañana y te atraca \nun grupo de -diferentes- que pasaba.\nPierdes 20ME\n-------------------------------------------");
                            multa3.darMulta(jugadores[i]);


                        }else if (jugadores[i].getCasillaX()==9 && jugadores[i].getCasillaY()==3) {                         //casilla multa4
                            System.out.println(multa4);
                            System.out.println("Sales de fiesta al Gadabout, \ncomo los cubatas son baratos \nse te olvida que cuestan dinero.\nPierdes 20ME\n-------------------------------------------");
                            multa4.darMulta(jugadores[i]);
                        }





















                    }else{
                        System.out.println("\n\nEl jugador "+jugadores[i].getFigura()+" esta en la cárcel. Pierde turno\n\n");
                        jugadores[i].setCarcel(0);
                    }
                    
                }



























            }else{
                System.out.println("========== FIN DE LA PARTIDA ==========");
                break;
            }
        }

        sc.nextLine();
        sc.close();


    }
}
