package vistas;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelos.CandidatoModelo;
import modelos.ModeloCrud;

public class VistaCandidatoGanadorGUI extends JFrame{
    public VistaCandidatoGanadorGUI(){
        ArrayList <CandidatoModelo> listaCandidato = ModeloCrud.ImprimirCandidato();
        CandidatoModelo candidatoConMasVotos = listaCandidato.get(0);

        JTextArea etiqueta = new JTextArea();
        StringBuilder texto = new StringBuilder();
        StringBuilder candidatoGanadorTexto = new StringBuilder();

        for (CandidatoModelo candidato: listaCandidato){
            if (candidato.getVotos() > candidatoConMasVotos.getVotos()) {
                candidatoConMasVotos = candidato;
            }    
        }

        texto.append("  CANDIDATO GANADOR!!!").append("\n").append("\n");
        candidatoGanadorTexto.append("El candidator ganador es ").append(candidatoConMasVotos.getNombre()).append(" con ").append(candidatoConMasVotos.getVotos()).append(" votos").append("\n");
        candidatoGanadorTexto.append("Promesas del candidato ganador: ").append(candidatoConMasVotos.getPromesas()).append("\n");

        setTitle("Candidato Ganador");
        etiqueta.setText(texto.toString() + candidatoGanadorTexto.toString());
        add(etiqueta);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
