/**
 * Created by yarik on 24.10.2016.
 */
public class arr {
    public static void main(String[] args) {
    char[] arr ={'a','b','c','d'};
    //int[] rez = new int{arr.length};
    char ff =  'w';
    for(int i = 0; i < arr.length ; i++){
        char elem = arr[i];
        if(elem == ff){
            System.out.println(i);
            break;
        }
        System.out.println("обработал элемент");
    }
  }
}
