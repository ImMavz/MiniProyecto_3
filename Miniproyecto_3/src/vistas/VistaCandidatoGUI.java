package vistas;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;

import modelos.Ciudades;
import modelos.Ideologia;
import modelos.Partidos;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaCandidatoGUI extends JFrame implements VistaCandidato, ActionListener {

    static {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   


    Container contenedor;
    FlowLayout layout;
    JLabel etiqueta1, infoCandidato, etiquetaNombre, etiquetaCedula, etiquetaPromesas, etiquetaVotos, eliminarJLabel;
    JMenuBar barraMenuBar;
    JMenu crud, datosCandidato;
    JTextField nombreText, cedulaText, promesasText, votosText, eliminarText;
    JMenuItem crearCandidato, actualizarCandidato, eliminarCandidato, listarCandidatos, votosCandidatos, candidatoGanador, ciudadCandidato, partidosCandidato;
    JButton guardar, eliminar;
    JComboBox ideologia, ciudad, partidos;
    JFrame frame;
    
    String nombre;
    String cedula;
    String promesas;
    int votos;
    Ideologia ideologiaSeleccionada;
    Ciudades ciudadSeleccionada;
    Partidos partidoSeleccionado;


    public VistaCandidatoGUI(){
        
        setTitle("Pagina principal");
        contenedor = getContentPane();
        layout = new FlowLayout();
        contenedor.setLayout(layout);


        etiqueta1 = new JLabel("SISTEMA DE REGISTRO DE CANDIDATOS");
        contenedor.add(etiqueta1);

        barraMenuBar = new JMenuBar();
        crud = new JMenu("Datos del candidato");
        datosCandidato = new JMenu("Informacion del candidato");
        barraMenuBar.add(crud);
        barraMenuBar.add(datosCandidato);
        

        crearCandidato = new JMenuItem("Registrar Candidato");
        actualizarCandidato = new JMenuItem("Actualizar Candidato");
        eliminarCandidato = new JMenuItem("Eliminar Candidato");

        listarCandidatos = new JMenuItem("Lista de candidatos");
        votosCandidatos = new JMenuItem("Votos de los candidatos");
        candidatoGanador = new JMenuItem("Candidato ganador");
        ciudadCandidato = new JMenuItem("Ciudades con menos candidatos");
        partidosCandidato = new JMenuItem("Partidos con mas candidatos");
        
        datosCandidato.add(listarCandidatos);
        datosCandidato.add(votosCandidatos);
        datosCandidato.add(candidatoGanador);
        datosCandidato.add(ciudadCandidato);
        datosCandidato.add(partidosCandidato);

        crud.add(crearCandidato);
        crud.add(actualizarCandidato);
        crud.add(eliminarCandidato);
        contenedor.add(barraMenuBar);

        infoCandidato = new JLabel("Información del candidato:");
        contenedor.add(infoCandidato);

        listarCandidatos.addActionListener(this);
        votosCandidatos.addActionListener(this);
        candidatoGanador.addActionListener(this);
        ciudadCandidato.addActionListener(this);
        partidosCandidato.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        crearCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaCrearCandidatoGUI ventanaSecundaria = new VistaCrearCandidatoGUI();
                ventanaSecundaria.setVisible(true);
                }
            });
        
        actualizarCandidato.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            VistaActualizarCandidatoGUI ventanaActualizar = new VistaActualizarCandidatoGUI();
            ventanaActualizar.setVisible(true);
            }
        });
        
        eliminarCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                VistaEliminarCandidatoGUI ventanaEliminar = new VistaEliminarCandidatoGUI();
                ventanaEliminar.setVisible(true);       
                }
            });        

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listarCandidatos) {
            VistaListaCandidatoGUI ventanaLista = new VistaListaCandidatoGUI();
            ventanaLista.setVisible(true);
        } else if (e.getSource() == votosCandidatos) {
            VistaVotosCandidatosGUI ventanaVotos = new VistaVotosCandidatosGUI();
            ventanaVotos.setVisible(true);
        } else if (e.getSource() == candidatoGanador) {
            VistaCandidatoGanadorGUI ventanaCandidatoGanador = new VistaCandidatoGanadorGUI();
            ventanaCandidatoGanador.setVisible(true);
        } else if (e.getSource() == ciudadCandidato) {
            VistaCiudadesCandidatoGUI ventanaCiudadesCandidato = new VistaCiudadesCandidatoGUI();
            ventanaCiudadesCandidato.setVisible(true);
        } else if (e.getSource() == partidosCandidato) {
            VistasPartidosCandidatoGUI ventanaPartidosCandidato = new VistasPartidosCandidatoGUI();
            ventanaPartidosCandidato.setVisible(true);
        }
    }

    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String getPromesas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPromesas'");
    }

    @Override
    public String getCedula() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCedula'");
    }

    @Override
    public int getVotos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVotos'");
    }

    @Override
    public Ideologia getIdeologia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdeologia'");
    }

    @Override
    public Ciudades getCiudad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCiudad'");
    }

    @Override
    public Partidos getPartido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPartido'");
    }

    @Override
    public void RegistrarCandidado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RegistrarCandidado'");
    }

    @Override
    public void ImprimirCandidato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ImprimirCandidato'");
    }

    @Override
    public void ActualizarCandidato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ActualizarCandidato'");
    }

    @Override
    public void EliminarCandidato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarCandidato'");
    }

    @Override
    public void MenuPrincipal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MenuPrincipal'");
    }

}
