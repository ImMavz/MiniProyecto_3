package vistas;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.*;

public class VistaCandidatoConsola implements VistaCandidato {
    ModeloCrud modeloCrud;


    public void setModeloCrud(ModeloCrud modeloCrud){
        this.modeloCrud = modeloCrud;
    }

    public void MenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        byte opciones;
        do{
            System.out.println("--------Bienvenido Ciudadano/Ciudadana-----------\n");
            System.out.println("--------Digite la opcion a la cual desee acceder---------\n");
            System.out.println("1) Registar candidato");
            System.out.println("2) Lista de candidatos");
            System.out.println("3) Actualizar candidato");
            System.out.println("4) Elminar candidato");
            System.out.println("0) Salir de la aplicacion");
            System.out.print("Digite una opcion: ");
            String input = scanner.nextLine();
            try {
                opciones = Byte.parseByte(input);
            } catch (NumberFormatException e) {
                // Si no se puede convertir a byte, asignamos un valor que no afectará el bucle
                opciones = -1;
            }
            System.out.println();
            switch(opciones) {
                case 1: 
                    this.RegistrarCandidado(); 
                    break;
                case 2: this.ImprimirCandidato();
                    break;
                case 3: this.ActualizarCandidato();
                    break;
                case 4: this.EliminarCandidato();
                    break;
                case 0: break;
                default: System.out.println("Opcion Invalida");
            }

        }while(opciones != 0);
    }   
    
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cedula del candidato que desea actualizar: ");
        String cedulaCandidatoActualizar = scanner.nextLine();

        System.out.println("Ingrese el nuevo nombre del candidato: ");
        String nuevoNombre = scanner.nextLine();

        System.out.println("Ingrese las nuevas promesas del canidato: ");
        String nuevaPromesas = scanner.nextLine();

        System.out.println("Ingrese los nuevos votos del candidato: ");
        int nuevosVotos = scanner.nextInt();

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
        
        CandidatoModelo candidatoNew = new CandidatoModelo(ideologiaElegida, partidoElejido, nuevosVotos, nuevaPromesas, nuevoNombre, cedula, ciudadElegida);

        ModeloCrud.ActualizarCandidatoConsola(cedulaCandidatoActualizar, candidatoNew);

    }

    @Override
    public void EliminarCandidato() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cedula del candidato que desea eliminar: ");
        String cedulaEliminar = scanner.nextLine();

        ModeloCrud.EliminarCandidatoConsola(cedulaEliminar);

        System.out.println();
        System.out.println("Candidato eliminado exitosamente");
        
    }

    @Override
    public void ImprimirCandidato() {
        
        ArrayList <CandidatoModelo> listaCandidatos = ModeloCrud.listaCandidatos;

        System.out.println("---CANDIDATOS ACTIVOS---\n");
        for(CandidatoModelo candidato: listaCandidatos){
            System.out.println("Nombre del candidato: " + candidato.getNombre());
            System.out.println("Numero de cedula del candidato: " + candidato.getCedula());
            System.out.println("Ciudad de procedencia del candidato: " + candidato.getCiudades());
            System.out.println("La ideologia del candidato: " + candidato.getIdeologia());
            System.out.println("Partido politico del candidato: " + candidato.getPartido());
            System.out.println("Las promesas del candidato: " + candidato.getPromesas());
            System.out.println("Numero de votos del candidato: " + candidato.getVotos());
            System.out.println("------------------------------\n");
        }
        
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

        CandidatoModelo candidato = new CandidatoModelo(ideologiaElegida, partidoElejido, votos, promesas, nombre, cedula, ciudadElegida);
        ModeloCrud.RegistrarCandidado(candidato);
        
    }    
}