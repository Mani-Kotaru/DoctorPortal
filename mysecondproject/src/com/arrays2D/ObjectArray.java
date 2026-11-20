package com.arrays2D;

public class ObjectArray {
	int id;
	String name;

	public static void main(String[] args) {
		ObjectArray[][] ob = new ObjectArray[2][3];
		ob[0][0] = new ObjectArray();
		ob[0][0].id = 1;
		ob[0][0].name = "mani";

		ob[0][1] = new ObjectArray();
		ob[0][1].id = 2;
		ob[0][1].name = "raghu";

		ob[0][2] = new ObjectArray();
		ob[0][2].id = 3;
		ob[0][2].name = "madhavi";

		ob[1][0] = new ObjectArray();
		ob[1][0].id = 4;
		ob[1][0].name = "srinu";
		
		ob[1][1] = new ObjectArray();
		ob[1][1].id = 5;
		ob[1][1].name = "kotaru";
        
		ob[1][2] = new ObjectArray();
		ob[1][2].id = 6;
		ob[1][2].name = "Rao";

		for (int i = 0; i < ob.length; i++) {
			for (int j = 0; j < ob[0].length; j++) {
				System.out.print(ob[i][j].id + " " + ob[i][j].name);
				if(j<ob[0].length-1)
				{
					System.out.print(" | ");
				}
			}
			
			System.out.println();
		}

	}

}
