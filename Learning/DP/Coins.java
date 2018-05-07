import java.util.Arrays;

public class Coins{

  static double countWays(int S[], int m, int n)
      {
          double[] ref = new double[n+1];

          Arrays.fill(ref, Double.POSITIVE_INFINITY);

          for(int i = 0; i < n+1; i++){
            for(int j = 0; j < 3; j++){
              System.out.println(i + " " + S[j] + " " + ref[i]);
              if (i - S[j] == 0) {
                ref[i] = 1;
              } else if (i - S[j] > 0){
                if(1 + ref[i-S[j]] < ref[i]){
                  ref[i] = 1+ref[i - S[j]];
                }
              }
            }
          }

          return ref[n];
      }

  public static void main(String args[])
  {
      int arr[] = {7, 8, 10};
      int m = arr.length;
      int n = 100;
      System.out.println(countWays(arr, m, n));


      int d [(n-2)*(n-1)*n];
      int l = 0;
      for(int i = 0; i < n-1; i++){
        arr[0] = i;
        for(int j = i+1; j < n; j++){
          arr[1] = j;
          for(int k = j+1; k < n+1; k++){
            arr[2] = k;

            System.out.println(d[l]);
            d[l] = countWays(arr, n);

          }
        }
      }
  }




}
