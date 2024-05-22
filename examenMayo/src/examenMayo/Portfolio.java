package examenMayo;

public class Portfolio {
    private double complejidad;
    private double calidad;
    private double proactividad;
    private double companerismo;

    public Portfolio(double complejidad, double calidad, double proactividad, double companerismo) {
        this.complejidad = complejidad;
        this.calidad = calidad;
        this.proactividad = proactividad;
        this.companerismo = companerismo;
    }

    public double getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(double complejidad) {
        this.complejidad = complejidad;
    }

    public double getCalidad() {
        return calidad;
    }

    public void setCalidad(double calidad) {
        this.calidad = calidad;
    }

    public double getProactividad() {
        return proactividad;
    }

    public void setProactividad(double proactividad) {
        this.proactividad = proactividad;
    }

    public double getCompanerismo() {
        return companerismo;
    }

    public void setCompanerismo(double companerismo) {
        this.companerismo = companerismo;
    }

    public double media() {
        return (complejidad + calidad + proactividad + companerismo) / 4;
    }
}
