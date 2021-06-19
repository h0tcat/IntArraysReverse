import java.util.Scanner;

public class Kadai09d{
    public static void main(String[] args){
        int[] ordGenCnt = {0,0,0,0,0,0,0,0};

        int ord=0;
        Scanner stdScanner = new Scanner(System.in);


        for(int i = 0; i < 8; i++){
            System.out.print("年齢 --> ");

            ord=stdScanner.nextInt();
            if(ord<0){
                break;
            }

            ordGenCnt[ord / 10]++;
        }
        for(int i = 0; i < 8; i++){
            System.out.printf("%d才〜:%d\n",i*10,ordGenCnt[i]);
        }

        stdScanner.close();
    }
}
