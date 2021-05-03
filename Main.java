import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //遮蔽物
        int N = scanner.nextInt();
        //UFOの距離 x
        int D = scanner.nextInt();
        //UFOの高さy
        int H = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            list.add(num);
        }
        double[] anser = new double[N];
        int annum =0;
        for(int i=0;i<list.size();i++){
            if(i%2 ==0){
                int x = list.get(i);
                int y = list.get(i+1);
                //一次関数のbを解いている。
                double b = (double)(D*y-x*H)/(D-x);
                anser[annum] = b;
                annum++;
            }
        }
        
        double doubleMin=0.0;

        for(int j=0;j<anser.length;j++){

            if(doubleMin<anser[j]){
                doubleMin = anser[j];
            }
        }
        /*
        if(doubleMin<0){
            doubleMin=0.0;
        }
        */
        System.out.println(doubleMin);

    }
}
