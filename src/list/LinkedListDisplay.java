package list;

import java.util.LinkedList;

public class LinkedListDisplay {
  public static void main(String[] args) {
    LinkedList<Integer> list= new LinkedList<>();  //用LinkedList来承接新建的LinkedList类可以使用这个类独有的方法
        list.add(1);
        list.add(2);
        list.add(3);
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        list.addFirst(0);   //这个方法会在链表的最开始处插入元素
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        list.addLast(4);//这个方法会在链表的最末端处插入元素
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println(list.getFirst()); //得到链表的第一个元素
        System.out.println(list.getLast());   //得到链表最后一个元素
        System.out.println(list.contains(1));   //这个链表是否包含元素1，如果是，返回true，否则返回false
        list.push(5); //向链表中push一个元素，push到最前的我位置
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println(); 
        
       int a =  list.pop();  //pop(弹出)这个链表的第一个元素
       System.out.println("弹出的元素："+a); 
       for(Integer i :list)
       {
         System.out.print(i+"  ");
       }
  }
}
