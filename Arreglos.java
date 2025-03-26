import java.util.Scanner;


public class Arreglos {

    final int T = 25; //tamaño máximo del grupo (variable global)

    public static void leerCalificaciones(){

    }

    public static void evaluarCalificaciones(){
        
    }

    public static void main(String[] args) {
        double[] parcial1, parcial2, parcial3, parcial4; //Sólo delcaro los arreglos
        double[] promInd;
        boolean[] aprobados; 

        double[] calificaciones = new double[5]; //declarando y construyendo el arreglo
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe la calificación [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        //No se imprime el contenido de todas las casillas del arreglo
        //sólo se imprime la direccón de memoria en donde empieza el arreglo
        //System.out.println("calificaciones: " + calificaciones);

        //impresión usando el for extendido
        System.out.println("Contendido del arreglo calificaciones: ");
        for ( double calificacion : calificaciones )
            System.out.println(calificacion);

        System.out.println("Contenido de calificaciones: ");
        //impresión con el for tradicional
        for ( int i=0; i<calificaciones.length; i++)
            System.out.println(calificaciones[i]);
        sc.close();    
    }
}