package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDisplay {
      public static void main(String[] args)
      {
        List<String> list = new ArrayList<>();
         list.add("name1");    //������һ��list���Լ��룬ֻ��һ��������ʱ����������ʼ����
         list.add(1, "name2");  //��list��indexΪ1������,���ֻ������������С�ĺ�һ��������ᱨ��
         list.add("name3");
          list.add(0,"namenew");  //�����еĵط�����Ὣ����ط�ԭ����Ԫ�غͺ�ߵ�Ԫ�ض������
          System.out.println("��һ��");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //��������
           
         }
         System.out.println();
         list.remove(0);   //����ͨ��λ����ɾ��Ԫ��
         System.out.println("�ڶ���");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //��������
         }
         System.out.println();
         list.remove("name1");   //����ͨ��Ԫ�غ������е�Ԫ�ؽ��жԱȣ��ҵ���ɾ��
         System.out.println("������");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //��������
         }
         System.out.println(list.isEmpty()); //����ǿյķ���true�����򷵻�false
         list.set(0, "namechange");
         System.out.println("���Ĵ�");
         for(int i =0;i<list.size();i++)
         {
           System.out.print(list.get(i)+" ");  //��������
         }
         System.out.println();
         String[] a = new String[list.size()];  //����һ����list��С��ͬ��ͬ��������
         String[] array =  list.toArray(a);    //��a���н�������飬������a
         for(int i = 0;i<array.length;i++)
         {
           System.out.print(array[i]+" ");
         }
      }
}
