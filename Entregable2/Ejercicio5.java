package Entregable2;
import java.util.ArrayList;
import java.util.List;
//EJERCICIO INSTANCIADO EN LA CLASE MAIN
public class Ejercicio5 {
    List<Double> horasTrabajadas=new ArrayList<>();
    List<Double>valorPorHora=new ArrayList<>();
    List<Double>totales=new ArrayList<>();
    public List<Double> getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public List<Double> getValorPorHora() {
        return valorPorHora;
    }
    public List<Double> getTotales() {
        return totales;
    }
    public void agregarHorasTrabajadas(List<Double> horas){
        horas.add(6.);
        horas.add(7.);
        horas.add(8.);
        horas.add(4.);
        horas.add(5.);
    }
    public void agregarValorHoras(List<Double> valor){
        valor.add(350.);
        valor.add(345.);
        valor.add(550.);
        valor.add(600.);
        valor.add(320.);
    }
    public void arrayIguales(List<Double> horas, List<Double> valor){
        if (horas.size()== valor.size()){
            System.out.println("Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.\n");
        }
    }
    public void acumulandoTotales(){
        for (int i = 0; i <horasTrabajadas.size() ; i++) {
            totales.add(horasTrabajadas.get(i)*valorPorHora.get(i));
        }
        System.out.println(totales);
    }
    public void mostrarListaTotales(){
        System.out.print("["+ totales.get(0) +", "+ totales.get(1) +", "+ totales.get(2) +","+ totales.get(2) +","+ totales.get(4)+"]");
        System.out.println("");
    }
    public void sumaTotales(){
        double sum=0;
        for (Double elemento: totales)
            sum+=elemento;
        System.out.println("Total final: $"+sum);
    }


}
