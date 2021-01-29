package 排序;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        System.out.println("请输入一串数字：");
        Scanner sc;
        sc = new Scanner(System.in);
        String s = sc.nextLine();//读入一行string
        String[] c = s.split("\\s+");//根据空格进行分割
        int[] arr = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            arr[i] = Integer.parseInt(c[i]);//将string转为int型
        }
        for (int i = 0; i < c.length; i++) {
            for (int n = 0; n < c.length - 1 - i; n++) {
                if (arr[n] > arr[n + 1]) {
                    int pn = arr[n];
                    arr[n] = arr[n + 1];
                    arr[n + 1] = pn;
                }
            }
        }//冒泡排序对数组进行排序
        System.out.println("排序后的结果：");
        for (int i = 0; i < c.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("请输入另一串数字：");
        Scanner sn;
        sn = new Scanner(System.in);
        String n = sn.nextLine();
        String[] m = n.split("\\s+");
        int[] arr1 = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            arr1[i] = Integer.parseInt(m[i]);
        }//输入另一个数组
        int[] result = new int[m.length + c.length];
        for (int i = 0; i < result.length; i++) {
            if (i < c.length) {
                result[i] = arr[i];
            } else {
                result[i] = arr1[i - c.length];
            }
        }//合并两个数组
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int pn = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = pn;
                }
            }


        }
        System.out.println("排序后的结果：");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
