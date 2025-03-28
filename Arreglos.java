import java.util.Scanner;


public class Arreglos {

    public static int t = 25; //tamaño máximo del grupo (variable global)

    public static double[] leerCalificaciones(){
        double[] calificaciones = new double[t];
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

    public static double[] obtenerPromInd(double[] p1, double[] p2, double[] p3, double[] p4){
        double[] resultado = new double[t];
        for (int i=0; i<resultado.length; i++)
            resultado[i] = (p1[i] + p2[i] + p3[i] + p4[i]) / 4;
        return resultado;
        

    }
    public static boolean [] evaluarCalificaciones(double[] proms){
        boolean [] resultado = new boolean [t];
        for ( int i=0; i<proms.length; i++ ){
            if ( proms[i] >=7 )
                resultado[i] = true;
            else 
                resultado[i] = false;
        }
        return resultado;
    }

    public static void imprimirResultados(boolean[] resultados){
        for ( boolean resultado : resultados )
            System.out.println(resultado);
    }

    public static double calcularPromedioGrupo(double[] proms){
        double suma = 0;
        for ( int i = 0; i < proms.length; i++ )
            suma += proms[i];  //sumando promedios
        return suma / proms.length;     
    }

    public static void main(String[] args) {
        double[] parcial1, parcial2, parcial3, parcial4; //Sólo declaro los arreglos
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
            parcial1 = leerCalificaciones();
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 2");
            parcial2 = leerCalificaciones();
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 3");
            parcial3 = leerCalificaciones();
            System.out.println("-----------------------------------");
            System.out.println("Lectura de calificaciones del parcial 5");
            parcial4 = leerCalificaciones();

            //calcular promedio individual
            promInd = obtenerPromInd(parcial1, parcial2, parcial3, parcial4);
            //evaluar si cada estudiante está aprobado o no
            aprobados = evaluarCalificaciones(promInd);

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
            System.out.println("-----------------------------------");
            System.out.println("Promedios individuales");
            imprimirCalificaciones(promInd);
            System.out.println("-----------------------------------");
            System.out.println("Estudiantes aprobados");
            imprimirResultados(aprobados);
            System.out.println("-----------------------------------");
            System.out.println("El promedio del grupo es: " + calcularPromedioGrupo(promInd));
            
            sc.close();   
    }
}