import java.util.Scanner;


public class Arreglos {

    public static int t = 25; //tamaño máximo del grupo (variable global)

    public static double[] leerCalificaciones(double[] calificaciones){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe la calificación [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        return calificaciones;
    }

    public static void imprimirCalificaciones(double[] calificaciones){

        System.out.println("Contendido del arreglo calificaciones: ");
        for ( double calificacion : calificaciones )
            System.out.println(calificacion);
    }

    public static void evaluarCalificaciones(){
        
    }

    public static void main(String[] args) {
        double[] parcial1, parcial2, parcial3, parcial4; //Sólo delcaro los arreglos
        double[] promInd;
        boolean[] aprobados; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que calcula el promedio final de un grupo");
        System.out.println("Escriba el tamaño del grupo: ");
        t = sc.nextInt();

        //construir los arreglos
        parcial1 = new double[t];
        parcial2 = new double[t];
        parcial3 = new double[t];
        parcial4 = new double[t];
        promInd = new double[t];
        aprobados = new boolean[t];

        //leer las calificaciones de los parciales de cada alumno
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 1");
            parcial1 = leerCalificaciones(parcial1);
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 2");
            parcial2 = leerCalificaciones(parcial2);
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 3");
            parcial3 = leerCalificaciones(parcial3);
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 5");
            parcial4 = leerCalificaciones(parcial4);

            //mostrar calificaciones de los parciales
            System.out.println("-----------------------------------");
            System.out.println("Calificaciones del parcial 1");
            imprimirCalificaciones(parcial1);
            System.out.println("-----------------------------------");
            System.out.println("Calificaciones del parcial 2");
            imprimirCalificaciones(parcial2);
            System.out.println("-----------------------------------");
            System.out.println("Calificaciones del parcial 3");
            imprimirCalificaciones(parcial3);
            System.out.println("-----------------------------------");
            System.out.println("Calificaciones del parcial 4");
            imprimirCalificaciones(parcial4);


        sc.close();    
    }
}