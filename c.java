


import java.util.Scanner;

public class fulijisuan {
 public static void main(String[] args){ 
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("�����뱾��"); 
	  int money=scanner.nextInt();
	  System.out.println("��������������"); 
	  int years=scanner.nextInt();
	  System.out.println("���������ʣ�"); 
	  double r=scanner.nextInt();
	  double sum=0;
	  
	                              
    for(int i = 1 ; i<=years; i++){ 
     sum = (1+ r) * i *money;  
     System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum); 
    } 
   }

}