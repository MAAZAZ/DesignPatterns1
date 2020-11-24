package paymentStrategy;

import java.util.Scanner;

public class PaymentCreditCard implements Payment{
    @Override
    public void pay() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir le code de la carte bancaire :");
        String cardNumber= scanner.nextLine();
        System.out.println("Veuillez saisir la date d'expiration :");
        String dateExp= scanner.nextLine();
        System.out.println("Veuillez saisir le code VSS :");
        String codeCard= scanner.nextLine();
        System.out.println("La commande à été payée ! merci.");
    }
}
