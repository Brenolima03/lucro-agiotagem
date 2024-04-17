import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, List<Float>> devedores = new HashMap<>();
        char armazenarDevedores = 's';

        while(armazenarDevedores == 's') {
            System.out.println("Digite o nome do devedor:");
            String nome = scanner.nextLine();

            List<Float> emprestimos = new ArrayList<>();
            char armazenarDividas = 's';

            while(armazenarDividas == 's') {
                System.out.println("Digite o valor da dívida:");
                float valor = scanner.nextFloat();
                emprestimos.add(valor);

                System.out.println("Deseja continuar? (s/n)");
                scanner.nextLine(); // Consumir a quebra de linha pendente no buffer
                armazenarDividas = scanner.nextLine().charAt(0);
            }

            devedores.put(nome, emprestimos);

            System.out.println("Deseja continuar adicionando devedores? (s/n)");
            armazenarDevedores = scanner.nextLine().charAt(0);
        }
        
        scanner.close();
        System.out.println(devedores);
    }

}
