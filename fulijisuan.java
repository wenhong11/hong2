  
	  
import java.text.DecimalFormat;
import java.util.Scanner;

public class fulijisuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 
		/*
		 * �������㹫ʽ:
		 * F=P*(1+i)N(�η�)
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
			System.out.println("������ֵ��ѡ������1���󱾽�������2��");
		    choise=scanner.nextInt();
		}while(choise!=1&&choise!=2);
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

	}
}
