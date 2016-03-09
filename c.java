


import java.util.Scanner;

public class fulijisuan {
 public static void main(String[] args){ 
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("请输入本金："); 
	  int money=scanner.nextInt();
	  System.out.println("请输入存款年数："); 
	  int years=scanner.nextInt();
	  System.out.println("请输入利率："); 
	  double r=scanner.nextInt();
	  double sum=0;
	  
	                              
    for(int i = 1 ; i<=years; i++){ 
     sum = (1+ r) * i *money;  
     System.out.println("存入第"+i+"年后的存款总额为："+sum); 
    } 
   }

}