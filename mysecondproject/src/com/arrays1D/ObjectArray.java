package com.arrays1D;

public class ObjectArray {
     int id;
     String name;
	public static void main(String[] args) {
     ObjectArray[] ob=new ObjectArray[5];
     ob[0]=new ObjectArray();
     ob[0].id=1;
     ob[0].name="mani";
     
     ob[1]=new ObjectArray();
     ob[1].id=2;
     ob[1].name="raghu";
     
     ob[2]=new ObjectArray();
     ob[2].id=3;
     ob[2].name="madhavi";
     
     ob[3]=new ObjectArray();
     ob[3].id=4;
     ob[3].name="srinu";
     ob[4]=new ObjectArray();
     ob[4].id=5;
     ob[4].name="kotaru";
     
     for(int i=0;i<4;i++)
     {
    	 System.out.println(ob[i].id+" "+ob[i].name);
     }
     System.out.println("*********************");
     for(ObjectArray o1:ob)
     {
    	 System.out.println(o1.id+" "+o1.name);
     }
     
	}

}
