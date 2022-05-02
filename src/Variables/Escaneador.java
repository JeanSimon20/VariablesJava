package Variables;
import java.util.Scanner;

public class Escaneador {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        
        String usuario = consola.nextLine();//El metodo nextLinea detiene el programa para que podamos digitar un dato
        System.out.println("Usuario = " + usuario);
        
        System.out.println("Ingresa el tiutlo:");
        String titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " +usuario);
    }
}
