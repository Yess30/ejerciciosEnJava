
package transfnumromanos;
import java.util.Scanner;

public class TransfNumRomanos {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        int num=1001;
        int continuar = 1;
        
        do {
            while(num > 1000 ){
                System.out.println("Ingresa el numero que deseas tranformar menor a 1000");
                num = leer.nextInt();  
                
                
            }
            transformarRomano(num);
            num = 1001;
            System.out.println("¿Desea transformar otro numero? \n 1.- Si \n 2.- No");
            continuar = leer.nextInt();
        } while (continuar == 1);
        
    }
    
    public static void transformarRomano(int valor){
        String romano = "";
        int m, c, d, u;
        
        m = valor /1000;
        c = valor /100 % 10;
        d = valor /10 %10;
        u = valor % 10;
        
        //Miles---------------------------------------------------------------
        if (m == 1) {
            romano += "M";
        }
        
        //Centenas------------------------------------------------------------
        if (c == 9) {
            romano += "CM";
        }else if (c >= 5) {
            romano += "D";
            for (int i = 6; i <= c; i++) {
                romano += "C";
            }
        }else if(c == 4){
         romano += "CD";
            
        }else{
            for (int i = 1; i <= c; i++) {
                romano += "C";
            }
        }
        
        //Decenas-----------------------------------------------
        if (d == 9) {
            romano += "XC";
            
        }else if (d >= 5) {
            romano += "L";
            for (int i = 6; i <= d; i++) {
                romano += "X";
            }
            
        }else if (d == 4) {
            romano += "XL";
        }else{
            for (int i = 1; i <= d; i++) {
                romano += "X";
            }
        }
        
        
        //Unidades
        if (u == 9) {
            romano += "IX";
        }else if (u >= 5) {
            romano += "V";
            for (int i = 6; i <= u; i++) {
                romano += "I";
            }
        }else if (u == 4) {
            romano += "IV";
        }else{
            for (int i = 1; i <= u; i++) {
                romano += "I";
            }
        }
        
        System.out.println("Resultado: "+romano);
        
        
        
    }
    
}
