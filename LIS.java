import java.util.ArrayList;
import java.util.List;

public class LIS {

    private List<Integer> array = new ArrayList<Integer>();
    private Integer len;

    public LIS(List <Integer>array, Integer len){
        this.array = array;
        this.len = len;
    }
    public int Solver() {

        List<Integer> LIS = new ArrayList<Integer>(); // Lis[i] guarda la subsecuencia creciente mas larga    
        for (int i = 0; i < this.len; i++){ //Inicializa la lista con 0;
            LIS.add(0);
        }

        LIS.set(0, array.get(0));
        Integer len = 1; //Largo actual de la subsecuencia mas larga
        for (int i = 1; i < this.len; i++){
            if (array.get(i) < LIS.get(0)){
                LIS.set(0, array.get(i));
            } //Si el elemento i del array es menor que el primer elemento de LIS, lo reemplaza

            else if (array.get(i) >= LIS.get(len - 1)) { //Si el elemento i del array es mayor que el ultimo elemento de LIS lo inserta al final.
                LIS.set(len, array.get(i));
                len += 1;
            }
            else{ //Mediante busqueda binaria, busca donde insertar el elemento i en LIS (priorizando por mayor)
                Integer left = -1;
                Integer right = len - 1;
                Integer mid;
                while (right - left > 1){
                    mid = left + (right - left)/2;
                    if (LIS.get(mid) > array.get(i)) right = mid;
                    else if (LIS.get(mid) == array.get(i)){
                        for (int j = mid; j <= len-1; j++){ //busca el primer elemento que sea distinto a array.get(i) (elemento que estamos buscando), para reemplazarlo
                            if(LIS.get(j) != array.get(i)){
                                right = left = j;
                                break;
                            }
                        }
                        if (right != left){
                            right = mid + 1;
                            break;
                        }
                    }
                    else left = mid;
                }
                LIS.set(right, array.get(i));
            }
        }
        return len;
    }
}