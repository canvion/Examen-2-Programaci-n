package Examen2eva;

public class Persona {
	
	//Atributos
    private final int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    private static int contador = 0;


    //Constructores
    
    public Persona(String nombre, String apellido1, String apellido2) {
        this.id = contador++;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    // Getters y setters
    
    public static int getContador() { 
    	return contador; 
    	}
    
    public int getId() { 
    	return id; 
    	}
    
    public String getNombre() { 
    	return nombre; 
    	}
    
    public String getApellido1() { 
    	return apellido1; 
    	}
    
    public String getApellido2() {
    	return apellido2; 
    	}
    
}