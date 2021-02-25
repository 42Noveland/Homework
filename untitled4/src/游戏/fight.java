package 游戏;

public class fight {
    private int c,d=0,e;
    public void battlefield(){
        Person a = new Person();
        a.inter();
        Monster b = new Monster();
        b.inter();

        System.out.println("勇者"+a.name+"遭遇了怪物"+b.name);
            System.out.println("看来这将是一场苦战");
            for(e=0;;e++){
                if(a.apr - (b.dpr/2)>0){
                    c = a.apr - (b.dpr/2);
                }
                else{
                    c=1;
                    System.out.println(b.name+"：你是在给我刮痧吗？");
                }
                System.out.println(a.name+"对"+ b.name+"造成了"+c+"点伤害");
                if(c>20){
                    System.out.println("效果拔群！！！");
                }
                d=b.lpr-c;
                b.lpr=d;
                if(b.lpr<=0){
                    System.out.println(a.name+"击败了"+b.name);
                    break;
                }

                if(b.apr - (a.dpr/2)>0){
                    c = b.apr - (a.dpr/2);
                }
                else{
                   c =1;
                    System.out.println(a.name+"：多谢手下留情！");
                }
                System.out.println(b.name+"对"+ a.name+"造成了"+c+"点伤害");
                if(c>20){
                    System.out.println("效果拔群！！！");
                }
                d=a.lpr-c;
                a.lpr=d;
                if(a.lpr<=0){
                    System.out.println(a.name+"击败了"+b.name);
                    break;
                }
            }
            System.out.println("一共进行了"+e+"个回合");
        }
}
