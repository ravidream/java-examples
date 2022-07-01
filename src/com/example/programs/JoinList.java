package com.example.programs;

import java.util.ArrayList;
import java.util.List;

public class JoinList {
	public static void main(String args[])
	  {
	      List<String> listOne = new ArrayList<String>();
	      listOne.add("a");
	      List<String> listTwo = new ArrayList<String>();
	      listTwo.add("b");
	      List<String> joined = new ArrayList<String>();
	      
	      joined.addAll(listOne);
	      joined.addAll(listTwo);
	      
	      System.out.println("List1 : "+listOne);
	      System.out.println("List2 : "+listTwo);
	      System.out.println("Joined : "+joined); 
	  }

}
