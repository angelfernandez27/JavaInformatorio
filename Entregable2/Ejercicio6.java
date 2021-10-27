package Entregable2;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//PARTE DEL EJERCICIO EMPLEADOEJ6
public class Ejercicio6 {
    private String nombreYApellido;
    private Integer DNI;
    private Double horasTrabajadas;
    private Double valorPorHora;
    public Ejercicio6(String nombreYApellido, Integer DNI, Double horasTrabajadas, Double valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    public Double sueldoEmpleado(){
        return horasTrabajadas*valorPorHora;
    }
    public String getNombreYApellido() {
        return nombreYApellido;
    }
    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }
    public Integer getDNI() {
        return DNI;
    }
    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }
    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public Double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
