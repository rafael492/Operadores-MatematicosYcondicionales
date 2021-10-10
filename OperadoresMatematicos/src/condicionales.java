
/**
 *
 * @author Rafael ING
 */
import java.util.Scanner;

public class condicionales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        int ages = leer.nextInt();

        if (ages >= 18) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
