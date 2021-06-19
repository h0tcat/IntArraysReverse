import java.util.Arrays;

public class Reverse{
  public static void main(String[] args){
    int[] src = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int tmp;

    for(int i = src.length / 2; i >= 0; i--){
      tmp = src[(src.length-1) - i];
      src[(src.length-1) - i] = src[i];
      src[i] = tmp;
    }
    System.out.println(Arrays.toString(src));
  }
}
