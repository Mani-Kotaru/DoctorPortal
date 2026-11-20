package com.javafundamentals_constructors;

public class Movie {
     String title;
     String director;
     String hero;
     String heroine;
     double rating;
     Movie()
     {
    	 title="Bahubali-1";
    	 director="Rajamouli";
    	 hero="Prabhas";
    	 heroine="Tamanna";
    	 rating=5.0;
     }
     Movie(String title)
     {
    	 this.title=title;
     }
     Movie(String director,double rating)
     {
    	 this.director=director;
    	 this.rating=rating;
     }
     Movie(String hero,String heroine)
     {
    	 this.hero=hero;
    	 this.heroine=heroine;
     }
     Movie(String title,String director,String hero,String heroine,double rating)
     {   
    	 this.title=title;
    	 this.hero=hero;
    	 this.heroine=heroine;
    	 this.director=director;
    	 this.rating=rating;
     }
    
	 public static void main(String[] args) {
	     Movie m1=new Movie();
	       m1.display();
		 Movie m2=new Movie("Pushpa");
		 m2.display();
		 Movie m3=new Movie("Sukumar",4.5);
		 m3.display();
		 Movie m4=new Movie("Ramcharan","kajal");
		 m4.display();
		 Movie m5=new Movie("Magadheera","Rajamouli","Ramcharan","kajal",5.000);
		 m5.display();


	}
   void display() 
   {   System.out.println("****************************************");
	   System.out.println("Title of the movie:"+title);
	   System.out.println("Director  of the movie:"+director);
	   System.out.println("Hero of the movie:"+hero);
	   System.out.println("Heroine of the movie:"+heroine);
	   System.out.println("Rating of the movie:"+rating);
   }
}
