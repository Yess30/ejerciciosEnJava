package calcularobjetos;
import java.util.Scanner;

public class CalcularObjetos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double dato;
        double area,perimetro,volumen;
        int opc;
        int opc2 = 1;
        
        do {
            //Ingresar el valor del lado
            System.out.println("Ingresar la medida del lado");
            dato = leer.nextDouble();
            //Opciones menu
            
            do {
                System.out.println("Dato actual: "+dato);
                System.out.println("1.- Calcular Area \n2.- Calcular perimetro \n3.- Calcular volumen \n4.- Calcular perimetro(cubo)"
                                      + "\n5.- Cancelar \n6.- Salir");
            
                opc = leer.nextInt();
                Cuadrado cuadro = new Cuadrado(dato);
                Cubo cubos = new Cubo(dato);
        
                
                switch(opc){
                    case 1:
                        area = cuadro.calcularArea();
                        System.out.println("Area del cuadrado: "+area);
                        break;
                    case 2:
                        perimetro = cuadro.calcularPerimetro();
                        System.out.println("Perimetro del cuadrado: "+perimetro);
                        break;
                    case 3:
                        volumen = cubos.calcularVolumen();
                        System.out.println("Volumen del cubo: "+volumen);
                        break;
                    case 4:
                        perimetro = cubos.calcularPerimetro()*3;
                        System.out.println("perimetro del cubo: "+perimetro);
                        break;
                    case 5:
                        System.out.println("Cancelando");
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opcion invalida");
                    }
                if (opc < 5) {
                    
                    System.out.println("\n \n \nDato actual: "+dato+"\n Elige una opcion: \n1.-Ingresar nuevo dato \n2.-Seleccionar otra operacion");
                    opc2 = leer.nextInt();
                }
                 if (opc == 5) {
                    opc2 = 1;
                }

                
                } while (opc2 == 2);
                opc = 5;
                           
           
           
            
        
            
        } while (opc == 5);
        
        
    }
    
}