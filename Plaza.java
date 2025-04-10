package Examen2eva;

public class Plaza {
	
	//Atributos
    private final int id;
    private final char tipo;
    private boolean adjudicada;
    private Persona persona;

    
    //Constructor
    
    public Plaza(int id, char tipo) {
        this.id = id;
        this.tipo = tipo;
        this.adjudicada = false;
    }

    
    public void adjudicar(Persona persona) {
        this.persona = persona;
        this.adjudicada = true;
    }

    
    // Getters y setters
    public int getId() { 
    	return id; 
    	}
    
    public char getTipo() { 
    	return tipo; 
    	}
    
    public boolean isAdjudicada() { 
    	return adjudicada; 
    	}
    
    public Persona getPersona() { 
    	return persona; 
    	}
    
}