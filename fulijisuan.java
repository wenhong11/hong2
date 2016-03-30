package fuli;


import java.text.*;
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
			System.out.println("求复利终值请输入1,求本金请输入2,求利率请输入3，求年限请输入4,求定额定投请输入5，求每月还款求输入6：");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2&&choise!=3&&choise!=4&&choise!=5&&choise!=6);
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
		//double S =(1+r*y)*m;
		//System.out.println("单利终值："+df2.format(S));
		


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
		System.out.println("按年定额定投请按1，按月定额定投请按2：  ");
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1){
		
		System.out.println("请输入存入本金:");
		double m = input.nextDouble();
	    System.out.println("请输入年利率:");
	    double r = input.nextDouble();
		System.out.println("请输入存入年限:");
		int y = input.nextInt();
		System.out.println("请输入年复利次数：");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		
		  double F = m*(Math.pow(1+r, y)-1)/r;
	System.out.println("按年定额定投:"+df2.format(F));
	}
		if(num==2){
			System.out.println("请输入存入本金:");
			double m = input.nextDouble();
		    System.out.println("请输入年利率:");
		    double r = input.nextDouble();
			System.out.println("请输入存入年限:");
			int y = input.nextInt();
			System.out.println("请输入年复利次数：");
			int n = input.nextInt();
			DecimalFormat df2 = new DecimalFormat("#.000");
			double F = m*(Math.pow(1+r/12.0, y*12)-1)/(r/12);
			System.out.println("按月定额定投:"+df2.format(F));
			
		}
	}
	if(choise==6){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入贷款本金:");
	double m = input.nextDouble();
    System.out.println("请输入贷款利率:");
    double r = input.nextDouble();
	System.out.println("请输入贷款年限:");
	int y = input.nextInt();
	DecimalFormat df2 = new DecimalFormat("#.000");
	double H = m*(((r/12)*(Math.pow(1+r/12, y*12)))/(Math.pow(1+r/12, y*12)-1));
	System.out.println("需每月还款："+df2.format(H));

	}
	}

	public double F(int m, double r, int y) {
		double F = (Math.pow((1+r), y))*m;
		return F;
	}

	public double money(double F, double r, int y) {
		double m= F/(Math.pow((1+r), y));
		return m;
	}

	public double rare(double F, int y, int m) {
		double r =( Math.pow(F/m, 1.0 / y))-1;
		return r;
	}

	public double year(double F, int m, double r) {
		double y=Math.log((double)(F/m))/(Math.log((double)(1+r)));
		return y;
	}

	public double value1(int m, double r, int y) {
		double F = m*(Math.pow(1+r, y)-1)/r;
		return F;
	}

	public double value2(int m, double r, int y) {
		double F = m*(Math.pow(1+r/12.0, y*12)-1)/(r/12);
		return F;
	}

	public double huankuan(int m, double r, int y) {
		double H = m*(((r/12)*(Math.pow(1+r/12, y*12)))/(Math.pow(1+r/12, y*12)-1));
		return H;
	}
	
}
