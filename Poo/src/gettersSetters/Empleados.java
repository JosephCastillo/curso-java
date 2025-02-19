
package gettersSetters;


public class Empleados {
    
    private int idEmpleado;
    private String nombreEmpleado;
    private double salarioEmpleado;
    
    public Empleados(){
    
        idEmpleado = 4646;
        nombreEmpleado = "Brayam";
}
    
//    Setter
    public void modificaSalario(){
        salarioEmpleado = 5000;
    }
    
//    Getter
    
    public double  muestraSalario(){
        return salarioEmpleado;
    }
    public int muestraIdEmpleado(){
        return idEmpleado;
    }
    public String muestraNombreEmpleado(){
        return nombreEmpleado;
    }
 
    
    public String  mostrarInfo(){
        return "El nombre del empleado es: " + nombreEmpleado + " Su id es: " + idEmpleado + " El sarlario del empleado es: " + salarioEmpleado;
    }
}
