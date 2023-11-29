import controlador.ControladorGUI;
import vistas.VistaCandidatoConsola;

public class App {

    public static void main(String[] args) {
        ControladorGUI controlador = new ControladorGUI();
        VistaCandidatoConsola vistaCandidatoConsola = new VistaCandidatoConsola();

        controlador.iniciarVistaCandidatoGUI();
        controlador.iniciarVistaEliminarCandidato();
        controlador.iniciarVistaListaCandidato();
        controlador.iniciarVistaVotosCandidatos();
        controlador.iniciarVistaCandidatoGanador();
        controlador.iniciarVistaCiudadesCandidato();
        controlador.iniciarVistaPartidosCandidato();
        controlador.iniciarVistaCrearCandidato();

        vistaCandidatoConsola.iniciar();

    }
}
