package complementariostres;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class EjercicioCinco {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Otto", "Smith", LocalDate.parse("1960-07-21")),
                new Alumno("Pedro", "Feijo", LocalDate.parse("1986-07-24")),
                new Alumno("Alejandro", "Rolhaiser", LocalDate.parse("2000-01-01")),
                new Alumno("Walter", "Reina", LocalDate.parse("1989-05-17")),
                new Alumno("Susana", "Benitez", LocalDate.parse("1978-12-22"))
        );
        Map<String,Integer>alumnosMap=alumnos.stream()
                .collect(Collectors.toMap(alumno -> constructorClave(alumno),alumn -> calculoEdad(alumn)));
        System.out.println(alumnosMap);
    }
    private static String constructorClave(Alumno alumno){
        return alumno.getApellido().concat(" ").concat(alumno.getNombre());
    }
    private static Integer calculoEdad(Alumno alumno){
        return Period.between(alumno.getFechaNacimiento(),LocalDate.now()).getYears();
    }
}
