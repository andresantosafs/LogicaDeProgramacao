import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri1002 {
 
    public static void main(String[] args) throws IOException {
 		Scanner sc = new Scanner(System.in);
		double I = 3.14159;
		double R = sc.nextDouble();
		double A = R * R * I;
		System.out.printf("A=%.4f\n",A);
		sc.close();
	}
}
