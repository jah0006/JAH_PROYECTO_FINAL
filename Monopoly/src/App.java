public class App {
    public static void main(String[] args) throws Exception {

        String[][] tablero = new String[10][10];


        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i==0) {
                    tablero[i][j]=" O ";
                }else if (i==9) {
                    tablero[i][j]=" O ";
                }else if (j==9) {
                    tablero[i][j]=" O ";
                }else if (j==0) {
                    tablero[i][j]=" O ";
                }else{
                    tablero[i][j]="   ";
                }
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }System.out.println();
        }
    }
}
