  
	  
import java.text.DecimalFormat;
import java.util.Scanner;

public class fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		/*
		 
　　 F：复利终值
　　 m：本金
　　 r：利率
　　 y：年限
		 */
		/*单利计算公式：
		 * S:单利终值
		 * m：本金
		 * r:利率
		 * y:年限
		 */
		int choise;
		Scanner scanner =new Scanner(System.in);
		do{
			System.out.println("求复利终值请输入1,求本金请输入2,求利率请输入3，求年限请输入4,求利滚利请输入5：");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2&&choise!=3&&choise!=4&&choise!=5);
		if(choise==1){
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入本金:");
		double m = input.nextDouble();
	    System.out.println("请输入年利率:");
	    double r = input.nextDouble();
		System.out.println("请输入存入年限:");
		int y = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		double F = (Math.pow((1+r/n), y*n))*m;
		System.out.println("复利终值:"+df2.format(F));
		double S =(1+r*y)*m;
		System.out.println("单利终值："+df2.format(S));
		


	}
	
	if(choise==2){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入复利终值:");
		double F= input.nextDouble();
	    System.out.println("请输入年利率:");
	    double r = input.nextDouble();
		System.out.println("请输入存入年限:");
		int y = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		double m= F/(Math.pow((1+r/n), y*n));
		System.out.println("本金:"+df2.format(m));
	}
	
	if(choise==3){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入复利终值:");
		double F= input.nextDouble();
	    System.out.println("请输入本金:");
	    double  m= input.nextDouble();
		System.out.println("请输入存入年限:");
		int y = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		
		double r =( Math.pow(F/m, 1.0 / y))-1;
		System.out.println("利率:"+r);
	}
	
	
	if(choise==4){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入复利终值:");
		double F= input.nextDouble();
	    System.out.println("请输入年利率:");
	    double r = input.nextDouble();
		System.out.println("请输入存入本金:");
		int m = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		
		double y=Math.log((double)(F/m))/(Math.log((double)(1+r)));
		System.out.println("年限:"+y);
	}
	
	
	if(choise==5){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存入本金:");
		double m = input.nextDouble();
	    System.out.println("请输入年利率:");
	    double r = input.nextDouble();
		System.out.println("请输入存入年限:");
		int y = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		
		for (int j = 0; j < y*n; j++) {
			m = m * (1 + r);
		}
		double F = m;
	
	System.out.println("利滚利:"+df2.format(F));
	}
	

	}
}
