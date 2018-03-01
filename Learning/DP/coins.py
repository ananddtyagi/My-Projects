#!/usr/bin/env python
#
# recursion
#
# prints out the best coins

import copy
def findbest(origarray, denom, N):
    current = copy.deepcopy(origarray)
    i =1
    while(i < size):
        if(i in denom):
            current[i] = 1
        else:
            x = []
            for d in denom:
                if (i-d) >= 1:
                    x.append(current[i-d])
                    current[i] = 1 + min(x)
                    print i, current[i], coinlist[i]
      i+=1
 # Note that we must compute totcost outside of loop of best coinage
 # Otherwise we'll think the cost is the number of coins required
    i =1
    totcost = 0
    while(i < size):
        if 0 == i % 5:
            totcost+= current[i]* N
        else:
            totcost+= current[i]
            i+= 1
            return totcost

            size= 240
            origarray= [0] # costs nothing for price of 0
            i = 1
            while(i < size):
                origarray.append(10000)
                i+= 1
                print origarray

                N = 3 # likelihood that the price is a multiple of 5
                bestval = 10000
                bestdenom = []
                i = 2
                while(i < 60):
                    j= i+1
                    while(j < 80):
                        k= j+1
                        while (k < 110):
                            denom = [1, i, j, k]
                            x = findbest(origarray, denom, N)
                            if(x < bestval):
                                bestval = x
                                bestdenom = copy.deepcopy(denom)
      k+= 1
    j+=1
  i+=1
print("best denomination is: "+ str(bestdenom))
print("best value is: " + str( bestval))


# print findbest(origarray, bestdenom, N)
