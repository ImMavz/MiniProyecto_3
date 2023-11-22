package modelos;

import java.util.ArrayList;

public class ModeloCrud {

    private String nombre, cedula, promesas;
    private int votos;
    private Ideologia ideologia;
    private Ciudades ciudad;
    private Partidos partido;

    public static ArrayList <CandidatoModelo> listaCandidatos;

    public void CandidatoModelo(){
        ModeloCrud.listaCandidatos = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public String getPromesas(){
        return promesas;
    }

    public int getVotos(){
        return votos;
    }

    public Ideologia getIdeologia(){
        return ideologia;   
    }

    public Ciudades getCiudades(){
        return ciudad;
    }

    public Partidos gePartidos(){
        return partido;
    }

    public static void RegistrarCandidado(CandidatoModelo candidato){
        listaCandidatos.add(candidato);
    }

    public static ArrayList<modelos.CandidatoModelo> ImprimirCandidato(){
        return listaCandidatos;
    }

    public static void EliminarCandidato(String cedulaEliminar){
        
        CandidatoModelo candidatoEliminar = null;
        for(CandidatoModelo candidato: listaCandidatos){
            if(candidato.getCedula().equals(cedulaEliminar)){
                candidatoEliminar = candidato;
            }
        }

        if (candidatoEliminar != null) {
            listaCandidatos.remove(candidatoEliminar);
        } else{
            System.out.println("Canidato no encontrado");
        }

    }

    public static void ActualizarCandidato(String cedulaCandidatoActualizar, CandidatoModelo candidatoNew){
        // Busca el candidato por la cédula
        for (CandidatoModelo candidatoExistente : listaCandidatos) {
            if (candidatoExistente.getCedula().equals(cedulaCandidatoActualizar)) {
                // Actualiza los atributos del candidato existente con los nuevos valores
                candidatoExistente.setNombre(candidatoNew.getNombre());
                candidatoExistente.setPromesas(candidatoNew.getPromesas());
                candidatoExistente.setVotos(candidatoNew.getVotos());
                candidatoExistente.setCiudad(candidatoNew.getCiudad());
                candidatoExistente.setIdeologia(candidatoNew.getIdeologia());
                candidatoExistente.setPartido(candidatoNew.getPartido());

                System.out.println("Candidato actualizado exitosamente.");
                return; // Sal del método después de actualizar el candidato
            }
        }

        System.out.println("Candidato no encontrado");

        
    }
}