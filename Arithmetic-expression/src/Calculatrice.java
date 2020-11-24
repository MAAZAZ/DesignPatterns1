import Operation.Addition;
import Operation.Multiplication;
import Operation.Soustraction;
import Operation.Division;
import expression.Expression;
import expression.Nombre;
import expression.Operation;

public class Calculatrice {
    public static void main(String[] args) {
        Expression quatre=new Nombre(4);
        Expression trois=new Nombre(3);
        Expression six=new Nombre(6);
        Expression dix=new Nombre(10);
        Expression cinq=new Nombre(5);

        // 3+4
        Expression a=new Addition(trois,quatre);
       // System.out.println(a+" = "+ a.valeur());

        // 10-6
        Expression s=new Soustraction(dix,six);
        // System.out.println(s+" = "+ s.valeur());

        // 5*(10-6)
        Operation m=new Multiplication(cinq,s);
        // System.out.println(m+" = "+ m.valeur());

        // (3+4) / (5*(10-6))
        Expression d=new Division(a,m);
        System.out.println(d+" = "+ d.valeur());

    }
}
