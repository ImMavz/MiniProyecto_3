package vistas;

import java.util.ArrayList;

import modelos.CandidatoModelo;
import modelos.Ciudades;
import modelos.Ideologia;
import modelos.Partidos;


public interface VistaCandidato {
    public void iniciar();
    public String getNombre();
    public String getPromesas();
    public String getCedula();
    public int getVotos();
    public Ideologia getIdeologia();
    public Ciudades getCiudad();
    public Partidos getPartido();
    public void RegistrarCandidado();
    public void ImprimirCandidato();
    public void ActualizarCandidato();
    public void EliminarCandidato();
    
}
 