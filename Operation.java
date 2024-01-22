public class Operation {
    protected Double firstVar;
    protected Double secondVar;
    protected String op;
    protected Double result;

    public Operation(Double firstVar, Double secondVar, String op, Double result){
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.op = op;
        this.result = result;
    }
    
    @Override
    public String toString(){
        return firstVar + " " + op + " " + secondVar + " = " + result;
    }
}
