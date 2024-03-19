import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int num,i=0,cuadrado,suma=0, opcion;
        System.out.println("=======================================================================");
        System.out.println("POR FAVOR SEÑOR USUARIO DIGITE UN NUMERO");
        num=entrada.nextInt();
        System.out.println("POR FAVOR ESCOJA UNA DE LAS SIGUIENTES OPCIONES DEPENDIENDO EL CICLO QUE DESEE");
        System.out.println("1: While");
        System.out.println("2: For");
        System.out.println("3: Dowhile");
        opcion=entrada.nextInt();
        System.out.println("=======================================================================");
        switch (opcion){

            case 1:

                while (i<=num){
                    cuadrado=i*i;
                    suma = suma+cuadrado;
                    i++;

                    System.out.println("el resultado de la suma de los cuadrados del numero "+num+" es:  "+suma);
                }

                break;

            case 2: for (i=0;i<=num;i++) {
                cuadrado = i * i;
                suma = suma + cuadrado;

                System.out.println("el resultado de la suma de los cuadrados del numero "+num+" es :  "+suma);
            }

            break;
            case 3: do {
                cuadrado = i*i;
                suma = suma*cuadrado;
                i++;

                System.out.println("el resultado de la suma de los cuadrados del numero "+num+" es:  "+suma);


            }while (i<=num);

                break;


        }


    }
}