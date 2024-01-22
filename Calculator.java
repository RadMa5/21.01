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

    public static void Calculate(){

    }
}