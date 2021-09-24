import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    //Libreria para que el usuario ingrese valores
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        //varible que contiene el nuemro
        String numero= sc.nextLine();
        System.out.println("Ingrese un la base del numero");
        //Base del numero que se ingreso
        int base=sc.nextInt();
        System.out.println();
       // salida del metodo que se encarga de hacer la conversion
        System.out.println(conversion(numero,base));
        
  } 

	 public static int conversion(String numero, int base){
     //convertimos el numero ingresado en un String (Cadena de caracteres)
     numero = numero.toUpperCase();
    //tomamos los numeros del 0 al 9 y las letras de la A a la F para considerar todas la conversiones desde la base 2 hasta la 16
    String caracteresHexadecimales = "0123456789ABCDEF";   
    
    int decimal = 0;
    //Se hace un ciclo for que recorra todo el numero que ingrsamos
    for (int i = 0; i < numero.length(); i++) {
        //la funcion CharAt nos indica que posicion ocupa cada numero es decir si tenemos 1101 empezando de izquierda a derecha el 1 ocupala posicion 0
        //0 la posicion 1, el 1 la posicion 2 y finalmente el ultimo 1 ocupa la posicion 3
        char caracter = numero.charAt(i);
        //la funcion indexOf se encarga de saber en que posicion se encunetra un caracter en este caso compararemos en que posicion se encuentra cada uno de
        //los digitos que ingresamos con respecto a la variable caracteresHexadecimales
        int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
        //hacemos la opracion de multiplicar la base del numero por la variable decimal que por defecto simpre empezara en 0
        decimal = base * decimal + posicionEnCaracteres;
    }
    return decimal;
    }
}