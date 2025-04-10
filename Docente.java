package Examen2eva;

public class Docente extends Persona {
    
	//Atributos	
	private String titulacion;
    private double puntos;
    
    
    // Constructores
    
    public Docente(String nombre, String apellido1, String apellido2, String titulacion, double puntos) {
        super(nombre, apellido1, apellido2);
        this.titulacion = titulacion;
        this.puntos = puntos;
    }
    
    
    @Override
    public String toString() {
        return String.format("ID: %d\nNombre: %s\nApellido1: %s\nApellido2: %s\nTitulación: %s\nPuntos: %.1f",
                getId(), getNombre(), getApellido1(), getApellido2(), titulacion, puntos);
    }

    
    // Getters y setters
    
    public double getPuntos() { 
    	return puntos; 
    	}
    
    public String getTitulacion() { 
    	return titulacion; 
    	}

}