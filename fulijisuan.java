  
	  
import java.text.DecimalFormat;
import java.util.Scanner;

public class fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		/*
		 * 复利计算公式:
		 * F=P*(1+i)N(次方)
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
			System.out.println("求复利终值请选择输入1，求本金请输入2：");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2);
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

	}
}
