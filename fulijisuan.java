  
	  
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
			System.out.println("������ֵ������1,�󱾽�������2,������������3��������������4,��������������5��");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2&&choise!=3&&choise!=4&&choise!=5);
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
		double S =(1+r*y)*m;
		System.out.println("������ֵ��"+df2.format(S));
		


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
		
		for (int j = 0; j < y*n; j++) {
			m = m * (1 + r);
		}
		double F = m;
	
	System.out.println("������:"+df2.format(F));
	}
	

	}
}
