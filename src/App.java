
import java.util.Locale;
import java.util.Scanner;

import utils.Contador;
import utils.ParametrosInvalidosException;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int numero2 = sc.nextInt();

        try {
        	Contador.contar(numero1, numero2);

        } catch (ParametrosInvalidosException exception) {

        }


		sc.close();		
		
		
	}

}
