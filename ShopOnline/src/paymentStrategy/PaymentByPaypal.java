package paymentStrategy;

import java.util.Scanner;

public class PaymentByPaypal implements Payment{
    @Override
    public void pay() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez saisir votre email de PAYPAL :");
        String email= scanner.nextLine();
        System.out.println("Veuillez saisir le mot de passe :");
        String password= scanner.nextLine();
        System.out.println("La commande à été payée ! merci.");
    }
}
