public class Multiplication extends Calculator{
    public static void Calculate(Double firstVar, double secondVar){
        Double result = firstVar * secondVar;
        Operation operation = new Operation(firstVar, secondVar, "*", result);
        log.add(operation);
        System.out.println(operation.toString());
    }
}
