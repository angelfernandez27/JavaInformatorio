package Entregable2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//EJERCICIO INSTANCIADO EN LA CLASE MAIN
public class EmpleadoEJ6 {

    Set<Ejercicio6> empleados=new HashSet<>();
    Map<Integer,Double> emple2=new HashMap<>();


    public void agregarEmpleados(Set<Ejercicio6> empleados){
        Ejercicio6 empleado1=new Ejercicio6("Angel fernandez",39666555,8.,900.);
        Ejercicio6 empleado2=new Ejercicio6("Franco Albarracim",1000343,4.,150.);
        Ejercicio6 empleado3=new Ejercicio6("Angel fernandez",39222222,6.,120.);
        Ejercicio6 empleado4=new Ejercicio6("Angel fernandez",3911111,12.,1000.);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);


    }
    public void agregarEmpleadosAlMap(Set<Ejercicio6> empleados,Map<Integer,Double> emple2){

        for (Ejercicio6 empleado: empleados ) {
            emple2.put(empleado.getDNI(),empleado.sueldoEmpleado());
        }
    }
    public void imprimirEmpleados(Map<Integer,Double> emple2){
        for (Map.Entry<Integer,Double>registro:emple2.entrySet()){
            System.out.println("DNI: "+registro.getKey()+": Sueldo "+registro.getValue());
        }
    }
}

