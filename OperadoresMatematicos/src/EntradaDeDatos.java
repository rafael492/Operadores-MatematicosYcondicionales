
/**
 *
 * @author Rafael ING
 */
import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el operador");

        var operador = leer.next();

        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        if (null != operador) {//resultado

            switch (operador) {
                case "+":
                    System.out.println("el resultado de la suma es " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("el resultado de la resta  es " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("el resultado de la multiplicacion es " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("el resultado de la division es " + (num1 / num2));
                default:
                    System.out.println("operacion incorrecta");
                    break;

            }
        }

    }

}
