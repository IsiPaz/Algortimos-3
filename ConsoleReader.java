import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    public List<List<Integer>> arrays;
    
    public ConsoleReader(){
        arrays = new ArrayList<List<Integer>>();
    }

    public void Read(){
        Scanner lector = new Scanner(System.in);
        while(true) {
            String input = lector.nextLine();
            if (input.isEmpty()){
                lector.close();
                break;
            }
            else{
                String [] parseInput = input.split(" ");
                List<Integer> numbers = new ArrayList<Integer>();
                for (int i = 1; i <= Integer.parseInt(parseInput[0]); i++){
                    numbers.add(Integer.parseInt(parseInput[i]));
                }
                arrays.add(numbers);
            }
        }
    }
    public List<List<Integer>> getArrays() {
        return arrays;
    }
}
