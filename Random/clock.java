public class clock{

public static void main(String[] args) {
  int h = 0, m = 0 , s = 0 , f= 0 ;

  while(h < 24){
    while (m < 60){
      while(s < 60){
        while (f < 9){
          f++;
          System.out.println(h + ":" + m + ":" + s + ":" + f);
        }
        f = 0;
        s++;
      }
      s = 0;
      m++;
    }
    m = 0;
    h++;
  }

}
}
