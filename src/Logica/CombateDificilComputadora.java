
package Logica;

import javax.swing.JOptionPane;

public class CombateDificilComputadora {
    static int filaAtaqueDeComputadora=0, columnaAtaqueDeComputadora=0;
    static boolean posicionVacia=true, ataqueValido=true;
    static InstruccionesDeJuego idj = new InstruccionesDeJuego();
    static MetodosUtiles mu = new MetodosUtiles();
    static Tableros t = new Tableros();
    
    public static void generarAtaqueComputadora(){
        validarFilaColumnaAtaqueComputadora();
        atacarAJugador(filaAtaqueDeComputadora, columnaAtaqueDeComputadora);
        resetearFilaColumnaPosicion();
    }
    
    public static void resetearFilaColumnaPosicion(){
        filaAtaqueDeComputadora=0;
        columnaAtaqueDeComputadora=0;
        posicionVacia=true;
    }
    
    public static void generarFilaColumna(){
        filaAtaqueDeComputadora=(int)(Math.random()*10);
        columnaAtaqueDeComputadora=(int)(Math.random()*10);
    }
    
    public static void validarFilaColumnaAtaqueComputadora(){
        do {
            generarFilaColumna();
            if(idj.TableroJugador[filaAtaqueDeComputadora][columnaAtaqueDeComputadora].equals("O") || idj.TableroJugador[filaAtaqueDeComputadora][columnaAtaqueDeComputadora].equals("*")){
                posicionVacia=false;
            }else{
                posicionVacia=true;
            }
        } while (posicionVacia==false);
    }
    
    public static void atacarAJugador(int pFilaAtaque, int pColumnaAtaque){
        int i=pFilaAtaque;
        int j=pColumnaAtaque;
        if (idj.TableroJugador[i][j].equals("1") || idj.TableroJugador[i][j].equals("2") || idj.TableroJugador[i][j].equals("3") || idj.TableroJugador[i][j].equals("4")){
            idj.TableroJugador[i][j]="*";
            JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+", te han atacado una nave","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
            t.mostrarTablerosActualizados();
            if ((i-1)>=0 && idj.TableroJugador[i-1][j].equals(" ")) {
               idj.TableroJugador[i-1][j]="O";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+" te has salvado del tiro del enemigo, ha caído en el mar","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }else if ((i-1)>=0 && (idj.TableroJugador[i-1][j].equals("1") || idj.TableroJugador[i-1][j].equals("2") || idj.TableroJugador[i-1][j].equals("3") || idj.TableroJugador[i-1][j].equals("4"))) {
                idj.TableroJugador[i-1][j]="*";
                JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+", te han atacado una nave","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
                t.mostrarTablerosActualizados();
            }
            if ((i+1)<=(idj.TableroJugador.length-1) && idj.TableroJugador[i+1][j].equals(" ")) {
               idj.TableroJugador[i+1][j]="O";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+" te has salvado del tiro del enemigo, ha caído en el mar","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }else if ((i+1)<=(idj.TableroJugador.length-1) && (idj.TableroJugador[i+1][j].equals("1") || idj.TableroJugador[i+1][j].equals("2") || idj.TableroJugador[i+1][j].equals("3") || idj.TableroJugador[i+1][j].equals("4"))) {
               idj.TableroJugador[i+1][j]="*";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+", te han atacado una nave","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }
            if ((j-1)>=0 && idj.TableroJugador[i][j-1].equals(" ")) {
               idj.TableroJugador[i][j-1]="O";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+" te has salvado del tiro del enemigo, ha caído en el mar","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }else if ((j-1)>=0 && (idj.TableroJugador[i][j-1].equals("1") || idj.TableroJugador[i][j-1].equals("2") || idj.TableroJugador[i][j-1].equals("3") || idj.TableroJugador[i][j-1].equals("4"))) {
               idj.TableroJugador[i][j-1]="*";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+", te han atacado una nave","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }
            if ((j+1)<=(idj.TableroJugador[0].length-1) && idj.TableroJugador[i][j+1].equals(" ")) {
               idj.TableroJugador[i][j+1]="O";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+" te has salvado del tiro del enemigo, ha caído en el mar","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }else if ((j+1)<=(idj.TableroJugador[0].length-1) && (idj.TableroJugador[i][j+1].equals("1") || idj.TableroJugador[i][j+1].equals("2") || idj.TableroJugador[i][j+1].equals("3") || idj.TableroJugador[i][j+1].equals("4"))) {
               idj.TableroJugador[i][j+1]="*";
               JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+", te han atacado una nave","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
               t.mostrarTablerosActualizados();
            }
        }else if(idj.TableroJugador[i][j].equals(" ")){
            idj.TableroJugador[i][j]="O";
            JOptionPane.showMessageDialog(null,idj.getNombreUsuario()+" te has salvado del tiro del enemigo, ha caído en el mar","Ataque computadora",JOptionPane.INFORMATION_MESSAGE);
            t.mostrarTablerosActualizados();
        }
    }
    
}
