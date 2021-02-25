package 游戏;

import java.security.PublicKey;
import java.util.Scanner;

public class create {
    public String name(){
        Scanner sn =new Scanner(System.in);
        String n =sn.nextLine();
        return n;
    }
    public int setNumber(){
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        return number;
    }

}
class Person extends create{
    int lpr;
    int apr;
    int dpr;
    String name;
      void inter(){
        System.out.println("请为您创建的人物命名");
        name = super.name();
        System.out.println("接下来，请为您创建的人物设定三维属性（限定范围1·999）");
        System.out.println("请为您创建的人物设定   生命力：");
        lpr = super.setNumber();
        System.out.println("请为您创建的人物设定   攻击力：");
        apr = super.setNumber();
        System.out.println("请为您创建的人物设定   防御力：");
        dpr = super.setNumber();
    }
}
class Monster extends create{
    int lpr;
    int apr;
    int dpr;
    String name;
    void inter(){
        System.out.println("请为您创建的怪物命名");
        name = super.name();
        System.out.println("接下来，请为您创建的怪物设定三维属性（限定范围1·999）");
        System.out.println("请为您创建的怪物设定   生命力：");
        lpr = super.setNumber();
        System.out.println("请为您创建的怪物设定   攻击力：");
        apr = super.setNumber();
        System.out.println("请为您创建的怪物设定   防御力：");
        dpr = super.setNumber();
    }
}