import java.util.*;

public class TOH{
  public static void main(String[] args) {
    int x = 3;

    ArrayList<LinkedList<Integer>> t = new ArrayList<LinkedList<Integer>>();

    //adding each tower
    for(int i = 0; i < 3; i++){
      t.add(new LinkedList<Integer>());
    }

    for(int i = x; i > 0; i--){
      t.get(0).push(i);
    }

    int i = 0;

    while(!finished(t, x)){
       i = move(t, i);
    }


  }

  // i is the value which we we are taking the top value from,
  // one after the last tower that we changed

  public static int move(ArrayList<LinkedList<Integer>> t, int i){

    if(t.get(i%3).size() == 0){
      return i + 1;
    }

    int temp = t.get(i%3).pop();

    for(int j = 0; j < 3; j++){
      if(t.get(i % 3).peek() > temp || t.get(i % 3).size() == 0){
        t.get(i % 3).push(temp);
        return i + 1;
      }
      i++;
    }

    return i + 1;
  }

  public static boolean finished(ArrayList<LinkedList<Integer>> t, int x){
    if(t.get(2).size() == x)
      return true;
    return false;
  }
}
