package Class;
import Class.*;

import java.util.ArrayList;

public class APlayer {
     public static ArrayList<Integer> arrayList= new ArrayList<>();

        public static void setValue(int value){
            arrayList.add(value);
            System.out.println(arrayList);
        }
        public static int APayerScore;
        public static int scoreCalculate(){
            for (int a:arrayList
                 ) {
                APayerScore+=a;
            }
            return APayerScore;
        }
}
