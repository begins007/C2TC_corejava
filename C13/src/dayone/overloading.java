package dayone;
import java.lang.Math;

public class overloading {
	
	public int sub(int a,int b) {
		return a-b;
	}
	public float add(float a,float b) {
		return a-b;
	}
	public double add(double a,double b) {
		return a-b;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	public float sub(float a,float b) {
		return a+b;
	}
	public double sub(double a,double b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public float mul(float a,float b) {
		return a*b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public float div(float a,float b) {
		return a/b;
	}
	public double div(double a,double b) {
		return a/b;
	}
	public int mod(int a,int b) {
		return a%b;
	}
	public float mod(float a,float b) {
		return a%b;
	}
	public double mod(double a,double b) {
		return a%b;
	}
	public static void main(String [] args) {
		
		overloading a=new overloading();
		
		System.out.println(a.add(8, 5)); 
		System.out.println(Math.ceil(a.mod(8.6, 2)*10)/10); 
	}
}
