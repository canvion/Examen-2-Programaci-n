package Examen2eva;

public class Sanitario extends Persona {
	
	//Atributos	
    private String especialidad;
    private int diasTrabajados;
    
    
    //Constructores
    
    public Sanitario(String nombre, String apellido1, String apellido2, String especialidad, int diasTrabajados) {
        super(nombre, apellido1, apellido2);
        this.especialidad = especialidad;
        this.diasTrabajados = diasTrabajados;
    }

    
    @Override
    public String toString() {
        return String.format("ID: %d\nNombre: %s\nApellido1: %s\nApellido2: %s\nEspecialidad: %s\nDias experiencia: %d",
                getId(), getNombre(), getApellido1(), getApellido2(), especialidad, diasTrabajados);
    
    }
    
    // Getters y setters
    
    public int getDiasTrabajados() { 
    	return diasTrabajados; 
    	}
    
    public String getEspecialidad() { 
    	return especialidad; 
    	}


}