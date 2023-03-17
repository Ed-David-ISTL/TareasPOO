package Herencias;
/**
 *
 * @author David_Acaro
 */
public class Casa {
    //Atributos
    protected double area; //protected permite el acceso de los datos a los hijos
    private double precio; //si usas el private debes usar el get y set
    
    //Constructor
    public Casa(double area, double precio){
        this.area = area;
        this.precio = precio;
    }
    
    //Getters
    public double getArea() {
        return area;
    }
    public double getPrecio(){
        return precio;
    }
    
    //Setters
    public void setArea(double area){
        this.area = area;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
}
