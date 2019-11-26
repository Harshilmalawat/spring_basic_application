package com.example.spring_basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/* To make best use, we need to tell 3 things -
		 1. What are beans
		 2. What are dependencies of bean
		 3. Where to search for beans. => No need in our case
		  */
		 
		//BinarySearchimpl binarySearch=new BinarySearchimpl(new BubbleSort()); //spring will manage
		//BinarySearchimpl binarySearch=new BinarySearchimpl(new QuickSort());  //spring will manage
		ApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
		BinarySearchimpl binarySearch=applicationContext.getBean(BinarySearchimpl.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		
	}

}
