package test1;

import java.util.Scanner;

/**
 * Create with IntelliJ IDEA
 * User: huoyajing
 * Date: 2016/12/16
 * Time: 16:55
 * To change this template use File | Settings | File Templates.
 */
public class ListFrame {

  static int chicken,rabbit;
    public static int qiongju(int head,int foot){
        int re,i,j;
        re=0;
        for (i=0;i<=head;i++){
            j=head-i;
            if (i*2+j*4==foot){
                re=1;
                chicken=i;
                rabbit=j;
            }
        }
        return re;
    }

    public static void main(String[] args) {
        int re,head,foot;
        System.out.println("穷举法求解鸡兔同笼问题");
        System.out.print("请输入头数：");
        Scanner input=new Scanner(System.in);
        head=input.nextInt();
        System.out.print("请输入脚数 ");
        foot= input.nextInt();
        re=qiongju(head,foot);
        if (1==re){
            System.out.println("鸡有"+chicken+";有"+rabbit);
        }else {
            System.out.println("无法求解，输入错误");
        }
    }
	
	//添加内容
}
