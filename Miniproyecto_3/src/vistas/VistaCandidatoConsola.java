package vistas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import modelos.CandidatoModelo;
import modelos.Ciudades;
import modelos.Ideologia;
import modelos.Partidos;

public class VistaCandidatoConsola implements VistaCandidato {


    Ideologia ideologia;
    Partidos partido;
    int votos;
    String promesas, nombre, cedula;
    Ciudades ciudad;

    @Override
    public void iniciar() {
        
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getPromesas() {
        return promesas;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public int getVotos() {
        return votos;
    }

    @Override
    public Ideologia getIdeologia() {
        return ideologia;
    }

    @Override
    public Ciudades getCiudad() {
        return ciudad;
    }

    @Override
    public Partidos getPartido() {
        return partido;
    }

    @Override
    public void ActualizarCandidato() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void EliminarCandidato() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ImprimirCandidato() {
        /* 
        System.out.println("---CANDIDATOS ACTIVOS---\n");
        listaCandidatos.forEach((i)->{
            System.out.println("Nombre del candidato: " + i.getNombre());
            System.out.println("Numero de cedula del candidato: " + i.getCedula());
            System.out.println("Ciudad de procedencia del candidato: " + i.getCiudades());
            System.out.println("La ideologia del candidato: " + i.getIdeologia());
            System.out.println("Partido politico del candidato: " + i.getPartido());
            System.out.println("Las promesas del candidato: " + i.getPromesas());
            System.out.println("Numero de votos del candidato: " + i.getVotos());
            System.out.println("------------------------------\n");
        });  
        */
    }

    @Override
    public void RegistrarCandidado() {

        System.out.println("---CREAR CANDIDATO---");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el nombre del candidato: ");
        String nombre = scanner.nextLine();
        System.out.println();

        System.out.print("Digite la cedula del candidato: ");
        String cedula = scanner.nextLine();
        System.out.println();
        

        System.out.println("Ciudad de procedencia");
        System.out.println();
        System.out.println("1. Cali           2. Palmira         3. Yumbo\n" +
                        "4. Tuluá          5. Buenaventura    6. Cartago\n" +
                        "7. Jamundi        8. Buga            9. Andalucia\n" +
                        "10. Bugalagrande");
        System.out.println("0. Salir");
        
        System.out.print("Digite una opcion: ");
        byte opcionCiudad = scanner.nextByte();
        scanner.nextLine();
        System.out.println();
        Ciudades ciudadElegida = null;
        switch(opcionCiudad){
            case 1: ciudadElegida = Ciudades.Cali; break;
            case 2: ciudadElegida = Ciudades.Palmira; break;
            case 3: ciudadElegida = Ciudades.Yumbo; break;
            case 4: ciudadElegida = Ciudades.Tulua; break;
            case 5: ciudadElegida = Ciudades.Buenaventura; break;
            case 6: ciudadElegida = Ciudades.Cartago; break;
            case 7: ciudadElegida = Ciudades.Jamundi; break;
            case 8: ciudadElegida = Ciudades.Buga; break;
            case 9: ciudadElegida = Ciudades.Andalucia; break;
            case 10: ciudadElegida = Ciudades.Bugalagrande; break;
            case 0: break;
            default: System.out.println("Opcion incorrecta");
        }

        
        System.out.println("---Ideologia---");
        System.out.println();
        System.out.println("1. Derecha");
        System.out.println("2. Izquierda");
        System.out.print("Digite una Opcion: ");
        byte opcionIdeologia = scanner.nextByte();
        scanner.nextLine();
        Ideologia ideologiaElegida = null;
        switch(opcionIdeologia){
            case 1:  ideologiaElegida = Ideologia.Derecha; break;
            case 2: ideologiaElegida = Ideologia.Izquierda; break;
            default: System.out.println("Opcion incorrecta");
            }
            
  
        Partidos partidoElejido = null;      
        if(ideologiaElegida == Ideologia.Derecha){
            System.out.println();                                            
            System.out.println("---Partidos politicos de derecha---");
            System.out.println();
            System.out.println("1. Centro Democratico");
            System.out.println("2. Partido Conservador");
            System.out.println("3. Cambio Radical");
            System.out.println("4. Partido de la U");
            System.out.println("0. Salir");
            System.out.print("Digite una opcion: ");
            byte opcionPartido = scanner.nextByte();
            scanner.nextLine();
            System.out.println();
            switch(opcionPartido){
                case 1: partidoElejido = Partidos.Centro_Democratico; break;
                case 2: partidoElejido = Partidos.Partido_Conservador; break;
                case 3: partidoElejido = Partidos.Cambio_Radical; break;
                case 4: partidoElejido = Partidos.Partido_De_la_U; break;
                case 0: break;
                default: System.out.println("Opcion incorrecta");}
            }
        else{
            System.out.println();
            System.out.println("---Partidos politicos de izquierda---");
            System.out.println();
            System.out.println("1. Pacto Historico");
            System.out.println("2. Partido Liberal");
            System.out.println("3. Alianza Verde");
            System.out.println("4. Polo Democratico");
            System.out.println("5. Union Patriotica");
            System.out.println("6. Fuerza de la Paz");
            System.out.println("0. Salir");
            System.out.print("Digite una opcion: ");
            byte opcionPartido = scanner.nextByte();
            scanner.nextLine();
            System.out.println();
            switch(opcionPartido){
                case 1: partidoElejido = Partidos.Pacto_Historico; break;
                case 2: partidoElejido = Partidos.Partido_Liberal; break;
                case 3: partidoElejido = Partidos.Alianza_Verde; break;
                case 4: partidoElejido = Partidos.Polo_Democratico; break;
                case 5: partidoElejido = Partidos.Union_Patriotica; break;
                case 6: partidoElejido = Partidos.Fuerza_De_La_Paz; break;
                case 0: break;
                default: System.out.println("Opcion incorrecta"); 
            }
        }
        System.out.print("Digite las promesas del candidato: ");
        String promesas = scanner.nextLine();
        System.out.println();

        System.out.print("Digite el numero de votos del candidato: ");
        int votos = scanner.nextInt();

        System.out.println();
        
    }

    @Override
    public void getListaDeCandidatos(ArrayList <CandidatoModelo> listaCandidatos) {
        listaCandidatos = new ArrayList<>();
    }
    
}
