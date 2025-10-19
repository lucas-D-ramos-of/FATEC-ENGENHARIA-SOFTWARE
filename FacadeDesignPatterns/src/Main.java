
import java.util.Scanner;
import facade.ComboFacade;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║   LANCHONETE FAST-FOOD        ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("\n=== MENU DE COMBOS ===");
        System.out.println("1 – Combo Master    (R$ 35,90)");
        System.out.println("2 – Super Combo     (R$ 32,50)");
        System.out.println("3 – Combo Kids      (R$ 22,90)");
        System.out.println("0 – Sair");

        boolean continuar = true;
        ComboFacade facade = new ComboFacade();
        int escolha;

        while (continuar) {
            System.out.print("\nSua escolha: ");
             escolha= scanner.nextInt();

             switch (escolha){
                 case 0 -> {
                     System.out.println("Obrigado pela preferência!");
                     continuar = false;
                 }
                 case 1,2,3 -> {
                     facade.criarCombo(escolha);
                     facade.exibirItens();
                     System.out.printf("\n💰 Total a pagar: R$ %.2f\n",
                             facade.getPrecoTotal());
                 }
                 default -> {
                     System.out.println("❌ Opção inválida!");
                 }
             }
        }

        scanner.close();
    }
}