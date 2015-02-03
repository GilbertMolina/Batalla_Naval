
package Logica;

import javax.swing.JOptionPane;

public class InstruccionesDeJuego {
    static String nombreUsuario="", textoNivelDificultad="";
    static int obtenerNivelDificultad=0, instruccionesDeJuego=1;
    static String TableroJugador[][] = new String[10][10];
    static String TableroComputadoraBackEnd[][] = new String[10][10];
    static String TableroComputadoraFrontEnd[][] = new String[10][10];

    public static void mostrarInstruccionesInicialesDeJuego(){
        String instrucciones;
        instrucciones = "  Guerra Naval es un juego similar al hundir la flota, que se desarrolla sobre dos tableros de tamaño 10 por 10.\n" + 
                        "  El objetivo del juego es hundir todas naves del contrario, en este caso el contrario será la computadora.\n\n" + 
                        "  Instrucciones de juego\n\n" + 
                        "- El usuario deberá digitar su nombre, en caso de que no lo desee, el sistema lo nombrará como \"Anónimo\".\n" + 
                        "- El usuario deberá seleccionar entre dos niveles, fácil y difícil.\n" + 
                        "- El usuario deberá situar cuatro tipos de naves en su tablero, los cuales son los siguientes:\n" + 
                        "     a) Submarinos, ocupan una posición, son 4 en el campo juego.\n" + 
                        "     b) Destructores, ocupan dos posiciones, son tres en campo el juego.\n" + 
                        "     c) Cruceros, ocupan tres posiciones, son dos en el campo de juego.\n" + 
                        "     d) Acorazado, ocupan cuatro posiciones, es solo uno en el campo de juego.\n" + 
                        "- Los tableros de juego, tanto del jugador como de la computadora serán mostrados por medio de la consola.\n" + 
                        "- Las naves se colocarán mediante las coordenadas que sean dadas por el usuario, las cuales son el número de fila y número de columna.\n" + 
                        "- La computadora colocará sus naves mediante forma aleatoria.\n" + 
                        "- Una vez que el usuario como la computadora tienen las naves colocados en el campo de batalla, se irán solicitando al usuario las\n" + 
                        "  coordenadas en las cuales desea atacar, en caso de que el usuario falle, deberá mostrar un \"0\" en el tablero de la computadora simbolizando\n" +
                        "  el mar abierto, de caso contrario, si el usuario acierta alguna nave de la computadora, deberá mostrar un \"*\".\n" + 
                        "- Luego de que el usuario digita las coordenadas y se muestra el resultado del tiro, la computadora hará un tiro aleatorio (fila y columna)\n" + 
                        "  en el campo de batalla del usuario, este tipo de juego será el nivel fácil, en caso de que el jugador haya elegido el nivel difícil, y que\n" +
                        "  la computadora haya acertado, esta deberá seguir atacando la nave que haya sido dañado en vez de seguir de forma aleatoria (nivel fácil).";
        instruccionesDeJuego=JOptionPane.showOptionDialog(null, "¿Desea leer las intrucciones del juego?", "Instrucciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si","No"}, null);
        if (instruccionesDeJuego==0) {
            JOptionPane.showMessageDialog(null, instrucciones, "Instrucciones de juego",JOptionPane.INFORMATION_MESSAGE);
        }
        do {
            nombreUsuario = JOptionPane.showInputDialog(null,"Por favor digite su nombre de usuario","Nombre de usuario",JOptionPane.QUESTION_MESSAGE);
            if (nombreUsuario==null) {
                JOptionPane.showMessageDialog(null, "No digitó el nombre de usuario, este es necesario para iniciar el juego");
            }else if (nombreUsuario.equals("")) {
                JOptionPane.showMessageDialog(null, "No digitó el nombre de usuario, por lo que su nombre de usuario será: Anónimo");
                nombreUsuario="Anónimo";
            }
        } while ((nombreUsuario==null));
        JOptionPane.showMessageDialog(null, "    Bienvenido(a): " + nombreUsuario, "Bienvenida",JOptionPane.INFORMATION_MESSAGE);
        obtenerNivelDificultad=JOptionPane.showOptionDialog(null, "Seleccione el nivel de dificultad", "Nivel de dificultad", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Fácil","Difícil"}, null);
        if (obtenerNivelDificultad==0) {
            textoNivelDificultad="Fácil";
        }else{
            textoNivelDificultad="Difícil";
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getObtenerNivelDificultad() {
        return obtenerNivelDificultad;
    }

    public String getTextoNivelDificultad() {
        return textoNivelDificultad;
    }
    
}
