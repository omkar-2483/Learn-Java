//write a program to create an ArrayList and perform following operations
//1. add 2. remove 3. display 4. sort 5. reverse


import java.util.ArrayList;  
import java.util.Collections;  
//Collections class include the sort() method for sorting lists alphabetically or numerically

//methods available in ArrayList Class:
//add(element) //get(index) //set(index,element) //remove(index) //clear() //size() 

public class Arraylist {
	public static void main(String[] args) {
		//create object of class Arraylist
		ArrayList<Integer> list=new ArrayList<Integer>();
		//add elements to ArrayList
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(8);
		System.out.println("\nOriginal List: ");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");	
		}
		System.out.println("\nElement at index 2: "+list.get(2));
		//change element at index 1
		list.set(1,10);
		//remove 1 at index 2 from list
		list.remove(2);
		//display list
		System.out.println("List after removal of 1 and changing 5 with 10: ");
		for(int i: list) {
			System.out.print(i+" ");	
		}
		//sort list
		Collections.sort(list);
		System.out.println("\nSorted List: ");
		for(int i: list) {
			System.out.print(i+" ");	
		}
		//reverse ArrayList
		Collections.reverse(list);
		System.out.println("\nReversed List: ");
		for(int i: list) {
			System.out.print(i+" ");	
		}
		//delete all element of list
		list.clear();
		System.out.println("\ncleared list: ");
		for(int i: list) {
			System.out.print(i+" ");
		}
	}

}
