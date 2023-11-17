package modelos;

public class CandidatoModelo{

    public String nombre;
    public String cedula;
    public String promesas;
    public int votos;
    public Ideologia ideologiaSeleccionada;
    public Ciudades ciudadSeleccionada;
    public Partido partidoSeleccionado;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getPromesas() {
        return promesas;
    }
    public void setPromesas(String promesas) {
        this.promesas = promesas;
    }
    public int getVotos() {
        return votos;
    }
    public void setVotos(int votos) {
        this.votos = votos;
    }
    public Ideologia getIdeologiaSeleccionada() {
        return ideologiaSeleccionada;
    }
    public void setIdeologiaSeleccionada(Ideologia ideologiaSeleccionada) {
        this.ideologiaSeleccionada = ideologiaSeleccionada;
    }
    public Ciudades getCiudadSeleccionada() {
        return ciudadSeleccionada;
    }
    public void setCiudadSeleccionada(Ciudades ciudadSeleccionada) {
        this.ciudadSeleccionada = ciudadSeleccionada;
    }
    public Partido getPartidoSeleccionado() {
        return partidoSeleccionado;
    }
    public void setPartidoSeleccionado(Partido partidoSeleccionado) {
        this.partidoSeleccionado = partidoSeleccionado;
    }

}
