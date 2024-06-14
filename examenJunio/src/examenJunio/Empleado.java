package examenJunio;

import java.util.List;
import java.util.stream.Collectors;
public class Empleado {
   private String nombre;
   private String apellidos;
   private String DNI;
   private List<Evaluacion> evaluacionesMensuales;
   public Empleado(String nombre, String apellidos, String DNI, List<Evaluacion> evaluacionesMensuales) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.DNI = DNI;
       this.evaluacionesMensuales = evaluacionesMensuales;
   }
   public String getNombre() {
       return nombre;
   }
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public String getApellidos() {
       return apellidos;
   }
   public void setApellidos(String apellidos) {
       this.apellidos = apellidos;
   }
   public String getDNI() {
       return DNI;
   }
   public void setDNI(String DNI) {
       this.DNI = DNI;
   }
   public List<Evaluacion> getEvaluacionesMensuales() {
       return evaluacionesMensuales;
   }
   public void setEvaluacionesMensuales(List<Evaluacion> evaluacionesMensuales) {
       this.evaluacionesMensuales = evaluacionesMensuales;
   }
   public double calcularPromedioCalificaciones() {
       return evaluacionesMensuales.stream()
               .mapToDouble(Evaluacion::getCalificacion)
               .average()
               .orElse(0.0);
   }
   public List<Evaluacion> filtrarEvaluacionesPorMes(int mes) {
       return evaluacionesMensuales.stream()
               .filter(e -> e.getMes() == mes)
               .collect(Collectors.toList());
   }
}