

package traductormorse;
import java.util.Scanner;

public class TraductorMorse {
    
static Scanner  leer  =  new Scanner(System.in);  //Variable para leer entradas del teclado
static String frase ="";                          //Variable que almacena la frase de origen
static String resultado ="";                      //Variable que almacena el resultado
static String letraM = "";                        //Variable que almacena la letra en clave morse
static int largo;                                 //Variable que almacena el largo de la palabra
        
//Arreglo de clave morse******************************************************************************
static String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                           "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                           "..-","...-",".--","-..-","-.--","--..",
                           ".----","..---","...--","....-",".....","-....","--...","---..",
                           "----.","-----"};
//Arreglo de abecedario*******************************************************************************
static  char [] abc  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                           'q','r','s','t','u','v','w','x','y','z',
                           '1','2','3','4','5','6','7','8','9','0'};
        
    public static void main(String[] args) {
         int opcion = 0;  
        
        //Opciones del menu
        do {
             System.out.println("Que accion desea hacer \n 1.- Traducir de morse a texto \n 2.- Traducir texto a morse \n 3.- Salir");
        opcion = leer.nextInt();
        leer.nextLine();
        switch (opcion){
            case 1:
                morseaTexto();
                break;
            case 2:
                textoaMorse();
             
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion invalida");
                
        }
        } while (opcion < 3);
        
       
    }
    
    
    
    
    //metodo convertir clave morse a texto---------------------------------------------------------------------------------------
    public static void morseaTexto(){
        resultado = "";
        boolean ch = false;
        
        while(ch == false){
            System.out.println("Ingresa tu frase en clave MORSE (separa cada palabra con 3 espacios y cada letra con 1 espacio)");
            //leer frase
            frase = leer.nextLine()+" ";
            largo = frase.length();
            ch = verificarMorse(frase, largo);
        }
       
        
             
        //Metodo
        for(int i=0; i<largo; i++){
            if(frase.charAt(i) != ' '){
                letraM +=frase.charAt(i);
            }else{
                for(int j = 0; j<morse.length; j++){
                    if(letraM.equals(morse[j])){
                        resultado += abc[j];
                        j=morse.length;
                    }
                   /* if (i<largo-1) {
                        if(frase.charAt(i) == ' '  && frase.charAt(i+2) == ' '){
                        resultado += " ";
                    }
                    }*/
                    
                }
                  if (i<largo-1) {
                        if(frase.charAt(i) == ' ' && frase.charAt(i+1) == ' '  && frase.charAt(i+2) == ' '){
                        resultado += " ";
                    }
                    }
                letraM = "";
            }
                    
        }
        System.out.println("Resultado:\n"+resultado+"\n \n");
                
    }
    //Metodo convertir texto a  clave morse
    public static void textoaMorse (){
        boolean ch = false;
        resultado = "";
        
        while(ch == false){
            System.out.println("Ingresa tu frase en texto normal");
            frase = leer.nextLine()+" ";
        
            largo = frase.length();
            ch = verificarTexto(frase, largo);
        }
        
        
        //metodo
        for(int i=0; i<largo; i++){
            if(frase.charAt(i) != ' '){
                for (int j = 0; j < abc.length; j++) {
                    if(frase.charAt(i) == abc[j]){
                        resultado += morse[j]+" ";
                    }/*else{
                        System.out.println(resultado);
                        System.out.println("Favor de ingresar tu oracion en texto normal");
                        j=abc.length;
                        i=largo;
                        resultado = "";
                    }*/
                    }
            }else{
                resultado += "  ";
                }
        }
        System.out.println("Resultado:\n"+resultado+"\n \n");
    }
    
    public static boolean verificarMorse(String oracion, int largo){
        
        boolean check = false;
        for (int i = 0; i < largo; i++) {
            if (oracion.charAt(i) != '.' && oracion.charAt(i) != '-' &&  oracion.charAt(i) != ' ') {
                i = largo;
                check = false;
            }else{
                check = true;
            }
        }
        return check;
    }
    
    public static boolean verificarTexto(String oracion, int largo){
         boolean check = false;
        for (int i = 0; i < largo; i++) {
            if (oracion.charAt(i) == '.' || oracion.charAt(i) == '-') {
                i = largo;
                check = false;
            }else{
                check = true;
            }
        }
        return check;
    }

}