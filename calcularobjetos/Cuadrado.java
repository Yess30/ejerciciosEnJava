package calcularobjetos;



public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    public double calcularArea(){
        double area = lado * lado;
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro = lado+lado+lado+lado;
        return perimetro;
    }
}
