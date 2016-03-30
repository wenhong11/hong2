package fuli;
import static org.junit.Assert.*;

import org.junit.Test;



public class fuliTest {
	@Test
	public  void Test1(){
		fulijisuan m = new fulijisuan();
		double test= m.F(100000,0.03,30);
		boolean flag=(double) test==242726.247;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test2(){
		fulijisuan m = new fulijisuan();
		double test= m.money(242726.247,0.03,30);
		boolean flag=(double) test==100000;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test3(){
		fulijisuan m = new fulijisuan();
		double test= m.rare(242726.247,100000,30);
		boolean flag=(double) test==0.03;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test4(){
		fulijisuan m = new fulijisuan();
		double test= m.year(242726.247,100000,0.03);
		boolean flag=(double) test==30;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test5(){
		fulijisuan m = new fulijisuan();
		double test= m.value1(100000,0.03,30);
		boolean flag=(double) test==4757541.571;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test6(){
		fulijisuan m = new fulijisuan();
		double test= m.value2(100000,0.03,30);
		boolean flag=(double) test==58273688.460;
		assertEquals(true,flag);
		
	}
	@Test
	public  void Test7(){
		fulijisuan m = new fulijisuan();
		double test= m.huankuan(100000,0.03,30);
		boolean flag=(double) test==42.160;
		assertEquals(true,flag);
		
	}
	
	

}
