#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

static int countWays(int S[], int n)
    {
        double ref [n+1]; //stores the mininum number of coins it will take to make sum at index i
        for(int i = 0; i < n+1; i++){ //init
          ref[i] = INT_MAX;
        }

        for(int i = 0; i < n+1; i++){ //finding all of the mininum number of coins it will take to sum up to all indicies i
          for(int j = 0; j < 5; j++){ //goes through each denomination

            if (i - S[j] == 0) { //if the index is one of the denominations,
              ref[i] = 1; //the number of coins it will take to make that number is 1.
            } else if (i - S[j] > 0){ // if the number is greater than one of the denominations then
              if(1 + ref[i-S[j]] < ref[i]){ //looks at the number of coins it took to make a the number ref[i - S[j]] (that is, the current index - one of the denominations), if that number is less than the 1-current value,
                ref[i] = 1+ref[i - S[j]]; //it replaces the number of coins it took to make the current index with the number of the coins it took the previous index + 1 (that plus 1 comes from whatever denomination we just subtracted by).
              }
            }
          }
        }


        if(ref[n] == INT_MAX){
         //printf("That sum cannot be made with the given denomations\n");
         return 0;
       }

        int coins[n+2];
        for(int i = 0; i < n+2; i++){
          coins[i] = 0;
        }

        int j = 0;
        int total = n; //so we can store the original total somewhere
        while(ref[n] != 1){ //until we reach one of the denominations
          for(int i = 0; i < 5; i++){ //goes through each denomination
            if(ref[n - S[i]] == ref[n] - 1){ //checks ref at some previous index that is the current index - a denomination, if the number of coins it took to make that previous index is 1- the number of coins it took to make the current index then,
              coins[j] = S[i]; //add that denomation that you just subtracted by to the list,
              n = n - S[i]; //go down by that denomation
              j++;
              break;
            }
          }
        }

        coins[j] = n;
        coins[++j] = INT_MAX;

        for(int i = 0; coins[i] != INT_MAX; i++){ //prints out the coins
          printf("%d ", coins[i]);
        }
        printf("\n");


        return ref[total];
    }

int main(int argc, char const *argv[]) {
  int arr[] = {2, 3, 5, 6, 19};
  int n = 134;
  countWays(arr, n);
  int v = (n-2)*(n-1)*n;
  int* d = (int*)malloc(v * sizeof(int));
  int l = 0;

  /*
  for(int i = 0; i < n-2; i++){
    arr[0] = i;
    for(int j = i+1; j < n-1; j++){
      arr[1] = j;
      for(int k = j+1; k < n; k++){
        arr[2] = k;
        d[l] = countWays(arr, n);
        l++;
      }
    }

  }
*/


  return 0;
}
