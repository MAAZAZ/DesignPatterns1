package Operation;

import expression.Expression;
import expression.Operation;

public class Soustraction extends Operation {
    public Soustraction(Expression op1, Expression op2) {
        super(op1, op2);
    }

    public double valeur(){
        return this.getOp1().valeur()-this.getOp2().valeur();
    }

    public String toString(){
        return "("+this.getOp1()+" - "+this.getOp2()+")";
    }

}
