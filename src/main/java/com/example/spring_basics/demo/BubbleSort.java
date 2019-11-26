package com.example.spring_basics.demo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {
 public int[] sort(int [] numbers) {
	 System.out.println("Bubble sort is used");
	 return numbers;
 }
 
}
