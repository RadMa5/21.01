import java.util.ArrayList;

public class Calculator{
    protected static ArrayList<Operation> log = new ArrayList<>();

    public static void Log(Double firstVar, Double secondVar, String op, Double result){
        Operation operation = new Operation(firstVar, secondVar, op, result);
        log.add(operation);
    }

    public static void PrintLog(){
        for(int i = 0; i < log.size(); i++){
            System.out.println(log.get(i).toString());
        }
    }

    public static void Add(Double firstVar, double secondVar){
        Double result = firstVar + secondVar;
        Operation operation = new Operation(firstVar, secondVar, "+", result);
        log.add(operation);
        System.out.println(operation.toString());
    }

    public static void Subtract(Double firstVar, double secondVar){
        Double result = firstVar - secondVar;
        Operation operation = new Operation(firstVar, secondVar, "-", result);
        log.add(operation);
        System.out.println(operation.toString());
    }
}