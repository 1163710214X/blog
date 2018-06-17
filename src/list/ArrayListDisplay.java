package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDisplay {
      public static void main(String[] args)
      {
        List<String> list = new ArrayList<>();
         list.add("name1");    //像数组一样list可以加入，只有一个参数的时候在数组的最开始加入
         list.add(1, "name2");  //在list的index为1处加入,最多只能在这个数组大小的后一个，否则会报错
         list.add("name3");
          list.add(0,"namenew");  //在已有的地方加入会将这个地方原来的元素和后边的元素都向后推
          System.out.println("第一次");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //遍历数组
           
         }
         System.out.println();
         list.remove(0);   //可以通过位置来删除元素
         System.out.println("第二次");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //遍历数组
         }
         System.out.println();
         list.remove("name1");   //可以通过元素和数组中的元素进行对比，找到后删除
         System.out.println("第三次");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //遍历数组
         }
         System.out.println(list.isEmpty()); //如果是空的返回true，否则返回false
         list.set(0, "namechange");
         System.out.println("第四次");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //遍历数组
         }
         System.out.println();
         String[] a = new String[list.size()];  //建立一个和list大小相同的同类型数组
         String[] array =  list.toArray(a);    //用a来承接这个数组，并返回a
         for(int i = 0;i<array.length;i++)
         {
           System.out.print(array[i]+" ");
         }
      }
}
