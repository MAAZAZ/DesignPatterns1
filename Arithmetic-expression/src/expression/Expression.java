package expression;

public abstract class Expression {
    abstract public Expression getOp1();
    abstract public Expression getOp2();
    abstract public double valeur();
    abstract public String toString();
}
