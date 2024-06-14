package examenJunio;

public class Evaluacion {
	   private int mes;
	   private double calificacion;
	   public Evaluacion(int mes, double calificacion) {
	       this.mes = mes;
	       this.calificacion = calificacion;
	   }
	   public int getMes() {
	       return mes;
	   }
	   public void setMes(int mes) {
	       this.mes = mes;
	   }
	   public double getCalificacion() {
	       return calificacion;
	   }
	   public void setCalificacion(double calificacion) {
	       this.calificacion = calificacion;
	   }
	}