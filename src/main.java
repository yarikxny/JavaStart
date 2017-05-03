import java.util.Random;

/**
 *
 * Created by yarik on 24.10.2016.
 */

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2)+1;
        if(i == 1){
            System.out.println("Heads");
        }else if(i == 2){
            System.out.println("Tails");
        }



        /**
         * разное
         * **/
        /*System.out.print("Привет сегодня: ");
        System.out.println(new Date());

        Random rand= new Random();
        int i = rand.nextInt(100);

        System.out.println("Randome number: "+i);
        System.out.println("/*//*try to use equals");
        String a = "privet";
        String b = "hello";

        boolean equ = a.equals(b);
        System.out.println(equ);

        System.out.println(" ");
        System.out.println("/---------------- ");
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));*/



        /****
         * задачка с собаками
         */

        /*
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says= "gav-gav";
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "rrrrr-gav";
        System.out.println("Dog1: "+ d1.name +" "+  d1.says +" "+"Dog2: "+d2.name+" "+d2.says );

        Dog d3 = new Dog();
        d3 = d1;
        System.out.println("By == : "+(d1 == d3));
        System.out.println("By equals: "+d1.equals(d3));*/

    }
}
