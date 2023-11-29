package controlador;

import modelos.CandidatoModelo;
import modelos.Ciudades;
import modelos.Ideologia;
import modelos.ModeloCrud;
import modelos.Partidos;
import vistas.*;

public class ControladorGUI {

    public static void registrarCandidato(
            String nombre, String cedula, String promesas, int votos,
            Ideologia ideologia, Ciudades ciudad, Partidos partido
    ) {
        CandidatoModelo candidato = new CandidatoModelo(ideologia, partido, votos, promesas, nombre, cedula, ciudad);
        ModeloCrud.RegistrarCandidado(candidato);
    }

    public static void imprimirCandidatos() {
        VistaListaCandidatoGUI vista = new VistaListaCandidatoGUI();
        vista.setVisible(true);
    }

    public static void imprimirVotosCandidatos() {
        VistaVotosCandidatosGUI vista = new VistaVotosCandidatosGUI();
        vista.setVisible(true);
    }

    public static void imprimirCandidatoGanador() {
        VistaCandidatoGanadorGUI vista = new VistaCandidatoGanadorGUI();
        vista.setVisible(true);
    }

    public static void imprimirCiudadesCandidato() {
        VistaCiudadesCandidatoGUI vista = new VistaCiudadesCandidatoGUI();
        vista.setVisible(true);
    }

    public static void imprimirPartidosCandidato() {
        VistasPartidosCandidatoGUI vista = new VistasPartidosCandidatoGUI();
        vista.setVisible(true);
    }

    public static void eliminarCandidato(String cedula) {
        ModeloCrud.EliminarCandidato(cedula);
    }

    public static void actualizarCandidato(
            String cedulaBuscar, String nombre, String promesas, int votos,
            Ideologia ideologia, Ciudades ciudad, Partidos partido
    ) {
        CandidatoModelo candidatoNuevo = new CandidatoModelo(ideologia, partido, votos, promesas, nombre, cedulaBuscar, ciudad);
        ModeloCrud.ActualizarCandidato(cedulaBuscar, candidatoNuevo);
    }

    public void iniciarVistaCandidatoGUI() {
        VistaCandidatoGUI vista = new VistaCandidatoGUI();
        vista.setVisible(true);
    }

    public void iniciarVistaEliminarCandidato() {
    }

    public void iniciarVistaVotosCandidatos() {
    }

    public void iniciarVistaListaCandidato() {
        /*VistaListaCandidatoGUI vista = new VistaListaCandidatoGUI();
        vista.setVisible(false);*/
    }

    public void iniciarVistaCandidatoGanador() {
    }

    public void iniciarVistaCiudadesCandidato() {
    }

    public void iniciarVistaPartidosCandidato() {
        /*VistasPartidosCandidatoGUI vista = new VistasPartidosCandidatoGUI();
        vista.setVisible(false);*/
    }

    public void iniciarVistaCrearCandidato() {
        /*VistaCrearCandidatoGUI vista = new VistaCrearCandidatoGUI();
        vista.setVisible(false);*/
    }

}
