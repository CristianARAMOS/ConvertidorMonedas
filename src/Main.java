import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("    CONVERTIDOR DE MONEDAS ALURA LATAM");
        System.out.println("                                           ");

        int funcion = 1;
        while (funcion != 0){
            System.out.println
                    ("Elija una opcion: \n" +
                            "1) Convertir de dolares [USD] a  Pesos Mexicanos [MXN] : \n" +
                            "2) Convertir de dolares [USD] a Pesos Colombianos [COP] : \n" +
                            "3) Convertir de dolares [USD] a Pesos Chilenos [CLP] : \n" +
                            "4) Convertir de Pesos Mexicanos [MXN] a Pesos Colombianos [COP] : \n" +
                            "5) Convertir de Pesos Colombianos [COP] a Pesos Mexicanos [MXN] : \n" +
                            "6) Convertir de Pesos Colombianos [COP] a Pesos Chilenos [CLP] : \n" +
                            "7) Convertir de Pesos Chilenos [CLP] a esos Colombianos [COP] : \n" +
                            "0) Salir");
            int opcion = teclado.nextInt();
            funcion = opcion;
            switch (funcion) {
                case 1:
                    System.out.println("Ingrese monto a convertir: ");
                    double monto = teclado.nextInt();
                    Coversor coversor = new Coversor();
                    Conversion conversion = coversor.conversion("USD", "MXN", monto);
                    System.out.println(conversion);
                    break;
                case 2:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("USD", "COP", monto);
                    System.out.println(conversion);
                    break;
                case 3:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("USD", "CLP", monto);
                    System.out.println(conversion);
                    break;
                case 4:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("MXN", "COP", monto);
                    System.out.println(conversion);
                    break;

                case 5:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("COP", "MXN", monto);
                    System.out.println(conversion);
                    break;
                case 6:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("COP", "CLP", monto);
                    System.out.println(conversion);
                    break;
                case 7:
                    System.out.println("Ingrese monto a convertir: ");
                    monto = teclado.nextInt();
                    coversor = new Coversor();
                    conversion = coversor.conversion("CLP", "COP", monto);
                    System.out.println(conversion);
                    break;
            }

        }


    }
}