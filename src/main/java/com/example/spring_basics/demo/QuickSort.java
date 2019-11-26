package com.example.spring_basics.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class QuickSort implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		System.out.println("Quick Sort is used");
		return numbers;
	}

}
