#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

static int countWays(int S[], int total, int n)
    {
        double ref [total+1]; //stores the mininum number of coins it will take to make sum at index i
        for(int i = 0; i < total+1; i++){ //init
          ref[i] = INT_MAX;
        }

        for(int i = 0; i < total+1; i++){ //finding all of the mininum number of coins it will take to sum up to all indicies i
          for(int j = 0; j < n; j++){ //goes through each denomination

            if (i - S[j] == 0) { //if the index is one of the denominations,
              ref[i] = 1; //the number of coins it will take to make that number is 1.
            } else if (i - S[j] > 0){ // if the number is greater than one of the denominations then
              if(1 + ref[i-S[j]] < ref[i]){ //looks at the number of coins it took to make a the number ref[i - S[j]] (that is, the current index - one of the denominations), if that number is less than the 1-current value,
                ref[i] = 1+ref[i - S[j]]; //it replaces the number of coins it took to make the current index with the number of the coins it took the previous index + 1 (that plus 1 comes from whatever denomination we just subtracted by).
              }
            }
          }
        }


        if(ref[total] == INT_MAX){
          return INT_MAX;
       }

        int coins[total+2];
        for(int i = 0; i < total+2; i++){
          coins[i] = 0;
        }

        int j = 0;
        int t = total; //so we can store the original total somewhere
        while(ref[total] != 1){ //until we reach one of the denominations
          for(int i = 0; i < n; i++){ //goes through each denomination
            if(ref[total - S[i]] == ref[total] - 1){ //checks ref at some previous index that is the current index - a denomination, if the number of coins it took to make that previous index is 1- the number of coins it took to make the current index then,
              coins[j] = S[i]; //add that denomation that you just subtracted by to the list,
              total = total - S[i]; //go down by that denomation
              j++;
              break;
            }
          }
        }

        coins[j] = total;
        coins[++j] = INT_MAX;


        for(int i = 0; coins[i] != INT_MAX; i++){ //prints out the coins
          printf("%d ", coins[i]);
        }
        printf("\n");


        return ref[t];
    }

int main(int argc, char const *argv[]) {
  int arr[] = {2, 3, 5, 6, 19};
  int arrL = 5;
  int total = 134;
  countWays(arr, total, arrL);

  //for any given price, what arrangement of coins should the person give so that the exchange number (the amount of coins changing hands total) is minimized
  //then, output the arrangement that gives the least average exchange number

  return 0;
}
