package com.javafundamentals_constructors;

public class Movie1 {
	
	String movieName;
	String producer;
	String director;
	String hero;
	String heroine;
	double budget;
	public Movie1()
	{
		System.out.println("no arg constructor called!");
	}
	
    public Movie1(String movieName) {
		this.movieName = movieName;
	}
    public Movie1(Movie1 m2, String producer) {
		this.movieName = m2.movieName;
		this.producer = producer;
	}
    public Movie1(Movie1 m3, String director,String hero) {
		this.movieName = m3.movieName;
		this.producer = m3.producer;
		this.director = director;
		this.hero = hero;
	}
    public Movie1(Movie1 m4,String heroine,double budget) {
		this.movieName =m4. movieName;
		this.producer = m4.producer;
		this.director = m4.director;
		this.hero = m4.hero;
		this.heroine=heroine;
		this.budget=budget;
		
	}
    
	
	public static void main(String[] args) {
		Movie1 m1=new Movie1();
		m1.display();
		Movie1 m2=new Movie1("Bahubali");
		m2.display();
		Movie1 m3=new Movie1(m2,"mythri movies");
		m3.display();
		Movie1 m4=new Movie1(m3,"Rajamouli","prabhas");
		m4.display();
		Movie1 m5=new Movie1(m4,"Anushka setti",45000000);
		m5.display();
	
	}
	
	void display()
	{
		System.out.println("name of the movie:"+movieName);
		System.out.println("name of the producer:"+producer);
		System.out.println("name of the director:"+director);
		System.out.println("name of the hero:"+hero);
		System.out.println("name of the heroine:"+heroine);
		System.out.println("budget of the movie:"+budget);
		System.out.println("***********************************");
	}

}
