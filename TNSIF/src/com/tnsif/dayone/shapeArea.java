package com.tnsif.dayone;
import java.util.*;
public class shapeArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int side = sc.nextInt();
		double side = 20;
		double height = 25;
		double width = 12;
		double radius = 5;
		double tempC = 55;
		double tempF = 300;
		
		double sqArea = side * side;
		double rectArea = height * width;
		double circleArea = 3.14 * radius * radius;
		double resTempC = (((tempF - 35)*5)/9);
		double resTempF = (((tempC / 5 )*9)+35);
		
		System.out.println("Area of Square is : "+sqArea);
		System.out.println("Area of Rectangle is : "+rectArea);
		System.out.println("Area of Circle is : "+circleArea);
		System.out.println("Temperature in Celcius "+tempF+ "F is : "+resTempC+" C");
		System.out.println("Temperature in Farheniet  "+tempC+ "C is :"+resTempF+" F");
	}

}
