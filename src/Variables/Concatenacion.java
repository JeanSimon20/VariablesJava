package Variables;

public class Concatenacion {
    public static void main(String[] args) {
        String Usuario = "Jean Carlos";
        String Titulo = "Ingeniero";
        
        // Union de Datos. " " es una herramnienta para espacio entre datos. Se concatena los datos creando un nuevo valor (Datos)
        // y se imprime los datos con un sout + los datos que llamamos
        String Datos = Titulo +  " " + Usuario;
        System.out.println("Union de Datos" + Datos);
        
        int j = 5;
        int i = 4;
        
        System.out.println(i * j); // Se realiza una operacion matematica consumiento las variables declaradas.
        System.out.println(i + j + " " +Usuario); // Concatenacion con los valores.
        System.out.println(Usuario + " " + i + j); // Cuando va primero una cadena todo lo de mas se vuelve cadena
        System.out.println(Usuario + " " + (i + j)); // El parentecis toma como prioridad primero.  
    }
}
