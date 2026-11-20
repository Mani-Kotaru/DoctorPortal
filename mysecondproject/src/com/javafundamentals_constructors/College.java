package com.javafundamentals_constructors;

public class College {
	
	String collegeName;
	String location;
	double fee;
	boolean isCoed;
	College()
	{   
	     //display();
		//System.out.println("collegeName:"+collegeName);//here we get error,because we are not able to write code before this() method in a constructor
		                                                 // if you want to use this() method in your constructor then it must be the first line of the constructor
	   this("Chalapathi Institute of Technology");
		System.out.println("collegeName:"+collegeName);
        display();
	}
	College(String collegeName)
	{
		this(100000);
		this.collegeName=collegeName;
		display();
	}
	College(double fee)
	{ 
		this(true);
		this.fee=fee;
		display();
		
	}
	College(boolean isCoed)
	{   
		this("RGUKT","Nuzvid");
		this.isCoed=isCoed;
		display();
		
	}
	College(String collegeName,String location)
	{
		this("VVIT",45000);
		this.collegeName=collegeName;
		this.location=location;
		display();
	}
	College(String collegeName,double fee)
	{
		this(60000,"SRM");
		this.collegeName=collegeName;
		this.fee=fee;
		display();
	}
	College(double fee,String collegeName)
	{
		this("KITS",false);
		this.collegeName=collegeName;
		this.fee=fee;
		display();
	}
	College(String collegeName,boolean isCoed)
	{
		this(true,"KHIT");
		this.collegeName=collegeName;
		this.isCoed=isCoed;
		display();
	}
	College(boolean isCoed,String collegeName)
	{
		this(57000.500,false);
		this.collegeName=collegeName;
		this.isCoed=isCoed;
		display();
	}
	College(double fee,boolean isCoed)
	{
		this(true,80000.765);
		this.fee=fee;
		this.isCoed=isCoed;
		display();
	}
	College(boolean isCoed,double fee)
	{   
		this.fee=fee;
		this.isCoed=isCoed;
		display();
	}
	
	
	

	public static void main(String[] args) {
		
		College c1=new College();

	}
	void display()
	{
		System.out.println("College Name:"+collegeName);
		System.out.println("Location:"+location);
		System.out.println("Fee:"+fee);
		System.out.println("is co-education there in the college?:"+isCoed);
		System.out.println("-----------------------------------------------------");
	}

}
