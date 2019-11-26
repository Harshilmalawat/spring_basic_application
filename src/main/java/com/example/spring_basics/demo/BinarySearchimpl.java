package com.example.spring_basics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchimpl {
@Autowired
private SortAlgorithm quicksort;  /*autowired tells that sortAlgorithm is dependency*/
	
 public int binarySearch(int[] numbers,int numberToSearch) {
	// BubbleSort bubbleSort=new BubbleSort();
//	 bubbleSort.sort(numbers);
	 int [] sortedNumbers=quicksort.sort(numbers);
	 
	 // logic for search is implemented down
	 return 5;
 }
// constructor injection
/*public BinarySearchimpl(SortAlgorithm sortAlgorithm) {
	super();
	this.sortAlgorithm = sortAlgorithm;
}*/
// setter injection
 
public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	this.quicksort=sortAlgorithm;
}


}
