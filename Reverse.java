
public class Reverse{
  public static void main(String[] args){
    int[] data = {10,20,30,40,50,60,70,80};
    int tmp;
    
    System.out.println("dataの初期値");

    for(int i = 0; i < data.length; i++){
      System.out.printf("data[%d] = %d \n",i,data[i]);
    }


    for(int i = data.length / 2; i >= 0; i--){
      tmp = data[(data.length-1) - i];
      data[(data.length-1) - i] = data[i];
      data[i] = tmp;
    }
    System.out.println("逆順に入れ替え後");
    for(int i = 0; i < data.length; i++){
      System.out.printf("data[%d] = %d \n",i,data[i]);
    }
  }
}
