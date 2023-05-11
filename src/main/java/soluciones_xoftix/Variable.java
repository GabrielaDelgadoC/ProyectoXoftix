package soluciones_xoftix;
public class Variable {
    /*------------------------------------------------------
     * ATRIBUTOS
    *-------------------------------------------*/
    private String name;
    private double value;

    /*-----------------------------------------------
     * METODOS 
     *--------------------------------------------*/
    // Constructor
    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }
    //getters y setters
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
    
}
