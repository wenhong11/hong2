package fuli;


import java.text.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		/*
		 
���� F��������ֵ
���� m������
���� r������
���� y������
		 */
		/*�������㹫ʽ��
		 * S:������ֵ
		 * m������
		 * r:����
		 * y:����
		 */
		int choise;
		Scanner scanner =new Scanner(System.in);
		do{
			System.out.println("������ֵ������1,�󱾽�������2,������������3��������������4,�󶨶Ͷ������5����ÿ�»���������6��");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2&&choise!=3&&choise!=4&&choise!=5&&choise!=6);
		if(choise==1){
		
		Scanner input = new Scanner(System.in);
		System.out.println("��������뱾��:");
		double m = input.nextDouble();
	    System.out.println("������������:");
	    double r = input.nextDouble();
		System.out.println("�������������:");
		int y = input.nextInt();
		System.out.println("�������긴��������");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		double F = (Math.pow((1+r/n), y*n))*m;
		System.out.println("������ֵ:"+df2.format(F));
		//double S =(1+r*y)*m;
		//System.out.println("������ֵ��"+df2.format(S));
		


	}
	
	if(choise==2){
		Scanner input = new Scanner(System.in);
		System.out.println("��������븴����ֵ:");
		double F= input.nextDouble();
	    System.out.println("������������:");
	    double r = input.nextDouble();
		System.out.println("�������������:");
		int y = input.nextInt();
		System.out.println("�������긴��������");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		double m= F/(Math.pow((1+r/n), y*n));
		System.out.println("����:"+df2.format(m));
	}
	
	if(choise==3){
		Scanner input = new Scanner(System.in);
		System.out.println("��������븴����ֵ:");
		double F= input.nextDouble();
	    System.out.println("�����뱾��:");
	    double  m= input.nextDouble();
		System.out.println("�������������:");
		int y = input.nextInt();
		System.out.println("�������긴��������");
		int n = input.nextInt();
		
		double r =( Math.pow(F/m, 1.0 / y))-1;
		System.out.println("����:"+r);
	}
	
	
	if(choise==4){
		Scanner input = new Scanner(System.in);
		System.out.println("��������븴����ֵ:");
		double F= input.nextDouble();
	    System.out.println("������������:");
	    double r = input.nextDouble();
		System.out.println("��������뱾��:");
		int m = input.nextInt();
		System.out.println("�������긴��������");
		int n = input.nextInt();
		
		double y=Math.log((double)(F/m))/(Math.log((double)(1+r)));
		System.out.println("����:"+y);
	}
	
	
	if(choise==5){
		System.out.println("���궨�Ͷ�밴1�����¶��Ͷ�밴2��  ");
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num==1){
		
		System.out.println("��������뱾��:");
		double m = input.nextDouble();
	    System.out.println("������������:");
	    double r = input.nextDouble();
		System.out.println("�������������:");
		int y = input.nextInt();
		System.out.println("�������긴��������");
		int n = input.nextInt();
		DecimalFormat df2 = new DecimalFormat("#.000");
		
		  double F = m*(Math.pow(1+r, y)-1)/r;
	System.out.println("���궨�Ͷ:"+df2.format(F));
	}
		if(num==2){
			System.out.println("��������뱾��:");
			double m = input.nextDouble();
		    System.out.println("������������:");
		    double r = input.nextDouble();
			System.out.println("�������������:");
			int y = input.nextInt();
			System.out.println("�������긴��������");
			int n = input.nextInt();
			DecimalFormat df2 = new DecimalFormat("#.000");
			double F = m*(Math.pow(1+r/12.0, y*12)-1)/(r/12);
			System.out.println("���¶��Ͷ:"+df2.format(F));
			
		}
	}
	if(choise==6){
	Scanner input = new Scanner(System.in);
	System.out.println("����������:");
	double m = input.nextDouble();
    System.out.println("�������������:");
    double r = input.nextDouble();
	System.out.println("�������������:");
	int y = input.nextInt();
	DecimalFormat df2 = new DecimalFormat("#.000");
	double H = m*(((r/12)*(Math.pow(1+r/12, y*12)))/(Math.pow(1+r/12, y*12)-1));
	System.out.println("��ÿ�»��"+df2.format(H));

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
