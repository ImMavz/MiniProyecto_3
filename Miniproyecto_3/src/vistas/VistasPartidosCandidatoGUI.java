package vistas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelos.CandidatoModelo;
import modelos.ModeloCrud;
import modelos.Partidos;

public class VistasPartidosCandidatoGUI extends JFrame{

    ArrayList <CandidatoModelo> listaCandidato = ModeloCrud.listaCandidatos;
    JTextArea paritodosArea = new JTextArea();
    StringBuilder texto = new StringBuilder();

    public VistasPartidosCandidatoGUI(){
            Map<Partidos, Integer> conteoPartidos = new HashMap<>();

        for (CandidatoModelo candidato : listaCandidato) {

            conteoPartidos.put(candidato.getPartido(), conteoPartidos.getOrDefault(candidato.getPartido(), 0) + 1); //Recorre el mapa y verifica si existe alguna entrada o valor en partido. 
        }

        Partidos partidoMasCandidatos = null;
        int maxCandidatos = 0;

        for (Map.Entry<Partidos, Integer> entry : conteoPartidos.entrySet()) {
            if (entry.getValue() > maxCandidatos) {
                maxCandidatos = entry.getValue();
                partidoMasCandidatos = entry.getKey();
            }
        }
        
        texto.append("Partido con más candidatos: ").append(partidoMasCandidatos).append("\n");

        setTitle("Partido con más candidatos");
        paritodosArea.setText(texto.toString());
        add(paritodosArea);
        setSize(400, 180);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    } 
    
}
