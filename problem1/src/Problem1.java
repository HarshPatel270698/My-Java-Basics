import java.util.Scanner;
class swap
{
	int a,b;
	swap(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	void display()
	{a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	}
}
class main
{
	public Static void main(String args[]);
	{
		swap s=new swap(10,20);
		s.display();
	}
}