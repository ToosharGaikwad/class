package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Reverselist {
	
	
	public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
		LinkedList<Integer> list2 = new LinkedList();
		
		for(int i= list.size()-1;i>=0;i--) {
			list2.add(list.get(i));
			
			
		}
		return list2;
	}
	
	public static void reversedWithoutList(LinkedList<Integer> list) {
	int left =0;
	int right = list.size()-1;
	
	while(left<right) {
		int temp = list.get(left);
		list.set(left, list.get(right));
		list.set(right,temp);
		
		
		left++;
		right--;
	}
		
		
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList(List.of(32,33,63,2,5,44,23));
		
		System.out.println("original list is " + list);
		LinkedList<Integer> reversedlist = reverse(list);
		System.out.println("reversed list is " + reversedlist);
		
		
		 reversedWithoutList(list);
		
		System.out.println("Revers without second list " + list);
		
	}
}
