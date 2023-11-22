package vistas;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelos.CandidatoModelo;
import modelos.ModeloCrud;


public class VistaListaCandidatoGUI extends JFrame{

    public VistaListaCandidatoGUI() {

        ArrayList <CandidatoModelo> listaCandidato = ModeloCrud.ImprimirCandidato();
        
        JTextArea textArea = new JTextArea();
        StringBuilder candidatosTexto = new StringBuilder();
        for(CandidatoModelo candidato: listaCandidato){
            candidatosTexto.append("Nombre: ").append(candidato.getNombre()).append("\n");
            candidatosTexto.append("Cédula: ").append(candidato.getCedula()).append("\n");
            candidatosTexto.append("Promesas: ").append(candidato.getPromesas()).append("\n");
            candidatosTexto.append("Votos: ").append(candidato.getVotos()).append("\n");
            candidatosTexto.append("Ciudad: ").append(candidato.getCiudad()).append("\n");
            candidatosTexto.append("Ideologia: ").append(candidato.getIdeologia()).append("\n");
            candidatosTexto.append("Partido: ").append(candidato.getPartido()).append("\n\n");
        }

        setTitle("Lista Candidatos");
        textArea.setText(candidatosTexto.toString());
        add(textArea);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
}
