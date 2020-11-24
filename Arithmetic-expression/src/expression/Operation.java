package expression;

public abstract class Operation extends Expression {
    private Expression op1;
    private Expression op2;

    public Operation(Expression op1, Expression op2){
        this.op1=op1;
        this.op2=op2;
    }

    public Expression getOp1(){
        return this.op1;
    }

    public Expression getOp2(){
        return this.op2;
    }
}