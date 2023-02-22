package Class;
import Class.*;

import java.util.ArrayList;

public class BPlayer {
    public static ArrayList<Integer> arrayList1= new ArrayList<>();

    public static void setValue(int value){
        arrayList1.add(value);
        System.out.println(arrayList1);
    }
    public static int BPayerScore;
    public static int scoreCalculate(){
        for (int a:arrayList1
        ) {
            BPayerScore+=a;
        }
        return BPayerScore;
    }
}
