import java.util.ArrayList;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m ;
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(in.hasNextInt()){
                m = in.nextInt();
                list.add(m);
                sum = m+sum;
            }
        }
        int mid = sum / n;
        int c1;
        int c2;
        int c = 0;
        for (int j = 0; j < n; j++) {
            if (list.get(j)==mid){
                continue;
            }else if (list.get(j)<mid){
                c1 = mid-list.get(j);
                c = c1+c;
            }else{
                c2 = list.get(j)-mid;

            }

        }
    }
}
