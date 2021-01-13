package com.huangshi;

class Recatangle
{
    public double Length;
    public double Width;
    public Recatangle() { }                       
    public Recatangle(double l, double w)          
    {
        Length = l;
        Width = w;
    }
    public void setLW(double l, double w)           
    {
        Length = l;
        Width = w;
    }
    public double Area()                           
    {
        return Length * Width;
    }
}

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		Recatangle r1 = new Recatangle();
        r1.setLW(4, 2);                          
        System.out.println("r1的面积是:" + r1.Area());  
        Recatangle r2 = new Recatangle(3, 6);       
        System.out.println("r2的面积是:" + r2.Area());
		
	}

}
