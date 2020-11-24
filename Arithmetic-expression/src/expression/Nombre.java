package expression;

public class Nombre extends Expression {
    private double valeur;

    public Nombre(double valeur){
        super();
        this.valeur=valeur;
    }

    public Expression getOp1(){
        return null;
    }

    public Expression getOp2(){
        return null;
    }

    public double valeur(){
        return this.valeur;
    }

    public String toString(){
        return Double.toString(this.valeur);
    }
}
