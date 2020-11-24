import paymentStrategy.Payment;
import paymentStrategy.PaymentByPaypal;
import paymentStrategy.PaymentCreditCard;

import java.util.*;

class Produit{
    private String designation;
    private double prix;

    public Produit(String designation, double prix){
        this.designation=designation;
        this.prix=prix;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return  this.designation +" "+this.prix+" DH";
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choix;
        List produits = new ArrayList<Produit>();
        produits.add(new Produit("Iphone X",6000));
        produits.add(new Produit("Iphone 8",5000));
        produits.add(new Produit("Iphone 7",4000));
        System.out.println("---------------BIENVENUE---------------");
        System.out.println("Les produits disponibles :");
        int order=0;
        for (Object produit : produits) {
            System.out.println(order+" : "+produit);
            order++;
        }
        System.out.println("---------------------------------------");
        System.out.print("Veuillez taper le numéro du produit choisi : ");
        int numero = sc.nextInt();
        System.out.print("Veuillez taper la quantité demandée : ");
        int qte = sc.nextInt();
        Produit produitSelectionne= (Produit) produits.get(numero);
        System.out.println("Prix total : "+produitSelectionne.getPrix()*qte+" DH");
        sc.nextLine();
        do {
            System.out.print("Veuillez choisir la méthode de payement (C: CreditCard / P: Paypal) : ");
            choix = sc.nextLine();
        } while (!choix.equals("C") && !choix.equals("P"));

        if(choix.equals("P")){
            Payment pay1=new PaymentByPaypal();
            pay1.pay();
        }
        else{
            Payment pay2=new PaymentCreditCard();
            pay2.pay();
        }
    }
}
