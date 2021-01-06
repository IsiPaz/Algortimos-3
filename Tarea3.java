import java.util.List;

public class Tarea3 {
    public static void main(String[] args) {
        ConsoleReader Reader = new ConsoleReader();
        Reader.Read();

        List<List<Integer>> arrays = Reader.getArrays();
        for (int i = 0; i < arrays.size(); i++) {
            LIS Test = new LIS(arrays.get(i), arrays.get(i).size());
            Integer len = Test.Solver();
            System.out.println(arrays.get(i).size()-len);
        }
    }
}