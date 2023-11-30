package vistas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelos.CandidatoModelo;
import modelos.Ciudades;
import modelos.ModeloCrud;

public class VistaCiudadesCandidatoGUI extends JFrame{
    ArrayList <CandidatoModelo> listaCandidato = ModeloCrud.listaCandidatos;
    JTextArea ciudadesaArea = new JTextArea();
    StringBuilder texto = new StringBuilder();

    public VistaCiudadesCandidatoGUI(){
        if (listaCandidato.isEmpty()) {
            texto.append("No hay nada mi rey").append("\n");
        }
        Map<Ciudades, Integer> contadorCiudades = new HashMap<>(); //Permite representar una estructura de datos para almacenar pares “clave/valor".

        texto.append("---CIUDADES CON MENOS CANDIDATOS DE ORIGEN---").append("\n").append("\n");
        for (CandidatoModelo candidato : listaCandidato){
            Ciudades ciudad = candidato.getCiudades();
            contadorCiudades.put(ciudad, contadorCiudades.getOrDefault(ciudad, 0) + 1); //Recorre el mapa y verifica si existe alguna entrada o valor. 
        }

        List<Map.Entry<Ciudades, Integer>> listaOrdenada = contadorCiudades.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        int top = Math.min(3, listaOrdenada.size()); //Aca se determina tres ciudades con menos candidatos.


        for (int i = 0; i < top; i++) {
            Map.Entry<Ciudades, Integer> entry = listaOrdenada.get(i);
            texto.append(entry.getKey()).append(": ").append(entry.getValue()).append(" candidatos").append("\n");
        }

        setTitle("Ciudades con menos candidatos");
        ciudadesaArea.setText(texto.toString());
        add(ciudadesaArea);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
}
