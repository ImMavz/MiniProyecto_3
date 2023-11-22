package modelos;

public class ModeloCrud {

    private String nombre, cedula, promesas;
    private int votos;
    private Ideologia ideologia;
    private Ciudades ciudad;
    private Partidos partido;

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

    public void RegistrarCandidado(){
        
    }

}