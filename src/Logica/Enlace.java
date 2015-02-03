
package Logica;

public class Enlace {
    static InstruccionesDeJuego idj = new InstruccionesDeJuego();
    static Tableros t = new Tableros();
    static MetodosUtiles mu = new MetodosUtiles();
    static PonerNavesJugador pnj = new PonerNavesJugador();
    static PonerNavesComputadora pnc = new PonerNavesComputadora();
    static BatallaFacilJugadorComputadora bfjc = new BatallaFacilJugadorComputadora();
    static BatallaDificilJugadorComputadora bdjc = new BatallaDificilJugadorComputadora();
    
    public static void enlazar(){
        mu.mostrarMensajeBienvenida();
        idj.mostrarInstruccionesInicialesDeJuego();
        t.tablerosParaInicioDeJuego();
        pnj.ponerTodasLasNavesJugador();
        pnc.ponerTodasLasNavesComputadora();
        t.mostrarTablerosActualizados();
        mu.mensajeInicioDeJuego();
        if (idj.getObtenerNivelDificultad()==0) {
            bfjc.batallaJugadorComputadora();
        }else if(idj.getObtenerNivelDificultad()==1){
            bdjc.batallaJugadorComputadora();
        }
        mu.mensajeFinDeJuego();
    }
    
}
