import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;

public class zhongxin {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
//        Scanner in2 = new Scanner(System.in);
        int n = in1.nextInt();
        int h = in1.nextInt();
        int u = in1.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(in1.hasNextInt()){
                int m = in1.nextInt();
                list.add(m);
            }

        }
        Collections.sort(list);

        if(h>=u){
            System.out.println(0);
        }
        int s = list.size();
        for(int j = 0;j<s;j++){
            if(h+list.get(s-1-j)>=u){
                System.out.println(j+1);
                break;
            }

            h=h+list.get(s-1-j);

        }
    }
}
