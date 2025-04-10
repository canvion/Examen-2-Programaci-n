package Examen2eva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    public static void adjudicarPlazas(List<Plaza> plazas, List<Persona> candidatos) {
       
    	List<Docente> docentes = new ArrayList<>();
        List<Sanitario> sanitarios = new ArrayList<>();


        docentes.sort(Comparator.comparingDouble(Docente::getPuntos));
        sanitarios.sort(Comparator.comparingInt(Sanitario::getDiasTrabajados));

        for (Persona p : candidatos) {
            if (p instanceof Docente) docentes.add((Docente) p);
            else if (p instanceof Sanitario) sanitarios.add((Sanitario) p);
        }

        for (Plaza plaza : plazas) {
            if (plaza.getTipo() == 'D' && !docentes.isEmpty()) {
                plaza.adjudicar(docentes.remove(0));
            } else if (plaza.getTipo() == 'S' && !sanitarios.isEmpty()) {
                plaza.adjudicar(sanitarios.remove(0));
            }
        }
    }

    public static void mostrarAdjudicaciones(List<Plaza> plazas) {
        System.out.println("============================================");
        System.out.println("La última adjudicación de plazas ha producido los siguientes resultados para SANITARIOS");
        System.out.println("============================================");
        
        plazas.stream()
            .filter(p -> p.getTipo() == 'S')
            .forEach(Main::mostrarPlaza);

        System.out.println("============================================");
        System.out.println("La última adjudicación de plazas ha producido los siguientes resultados para DOCENTES");
        System.out.println("============================================");
        
        plazas.stream()
            .filter(p -> p.getTipo() == 'D')
            .forEach(Main::mostrarPlaza);
    }

    private static void mostrarPlaza(Plaza plaza) {
        System.out.println("ID Plaza " + plaza.getId());
        System.out.println("Tipo: " + plaza.getTipo());
        System.out.println("Adjudicada: " + (plaza.isAdjudicada() ? "ADJUDICADA" : "NO ADJUDICADA"));
        
        if (plaza.isAdjudicada()) {
            System.out.println(plaza.getPersona().toString());
        }
        System.out.println("____________________________________________");
    }

    public static void simularAdjudicacion() {
        List<Persona> candidatos = new ArrayList<>();
        List<Plaza> plazas = new ArrayList<>();

        
        for (int i = 0; i < 3; i++) {
            candidatos.add(new Docente("rosa" + i, "melano" + i, "suave" + i, 
                                     "titulacion" + i, 2.0 + i));
            candidatos.add(new Sanitario("aitor" + i , "" + i + "negra", 
                                       "negra" + i , "especialidad" + i, 40 + i));
        }

        
        for (int i = 0; i < 10; i++) {
            plazas.add(new Plaza(i, i % 2 == 0 ? 'D' : 'S'));
        }

        adjudicarPlazas(plazas, candidatos);
        mostrarAdjudicaciones(plazas);
    }

    public static void main(String[] args) {
        simularAdjudicacion();
    }
}