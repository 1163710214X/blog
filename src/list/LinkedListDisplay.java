package list;

import java.util.LinkedList;

public class LinkedListDisplay {
  public static void main(String[] args) {
    LinkedList<Integer> list= new LinkedList<>();  //��LinkedList���н��½���LinkedList�����ʹ���������еķ���
        list.add(1);
        list.add(2);
        list.add(3);
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        list.addFirst(0);   //�����������������ʼ������Ԫ��
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        list.addLast(4);//������������������ĩ�˴�����Ԫ��
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println();
        System.out.println(list.getFirst()); //�õ�����ĵ�һ��Ԫ��
        System.out.println(list.getLast());   //�õ��������һ��Ԫ��
        System.out.println(list.contains(1));   //��������Ƿ����Ԫ��1������ǣ�����true�����򷵻�false
        list.push(5); //��������pushһ��Ԫ�أ�push����ǰ����λ��
        for(Integer i :list)
        {
          System.out.print(i+"  ");
        }
        System.out.println(); 
        
       int a =  list.pop();  //pop(����)�������ĵ�һ��Ԫ��
       System.out.println("������Ԫ�أ�"+a); 
       for(Integer i :list)
       {
         System.out.print(i+"  ");
       }
  }
}
