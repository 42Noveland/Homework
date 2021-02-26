package 游戏;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class create {
    int lpr;
    int apr;
    int dpr;
    String name;

    public String name(){
        Scanner sn =new Scanner(System.in);
        AtomicReference<String> n = new AtomicReference<>(sn.nextLine());
        return n.get();
    }

    public int setNumber(){
        Scanner sc =new Scanner(System.in);
        AtomicInteger number= new AtomicInteger(sc.nextInt());
        return number.get();
    }

    void inter(String d){
        System.out.println("请为您创建的"+d+"命名");
        name = name();
        System.out.println("接下来，请为您创建的"+d+"设定三维属性（限定范围1·999）");
        System.out.println("请为您创建的人物设定   生命力：");
        lpr = setNumber();
        System.out.println("请为您创建的人物设定   攻击力：");
        apr = setNumber();
        System.out.println("请为您创建的人物设定   防御力：");
        dpr = setNumber();
    }

}
class Person extends create{
   void inter(){
       super.inter("人物");
   }
}
class Monster extends create{
     void inter(){
         super.inter("怪物");
     }
}