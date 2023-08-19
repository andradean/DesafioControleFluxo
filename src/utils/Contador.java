package utils;
public class Contador {
    
    public static void contar (int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 >= numero2 ) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

            
        }

        int contagem = 1 + numero2 - numero1;
        System.out.println(contagem);

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimido o numero: " + i);
        }
    }
}
