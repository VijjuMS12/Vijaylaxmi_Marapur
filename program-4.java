package com.calculator;

import java.util.*;

  public class MultipleCounter {
		    public static void main(String[] args) {
		       
		        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

		        
		        Map<Integer, Integer> countMap = new LinkedHashMap<>();

		        
		        for (int i = 1; i <= 9; i++) {
		            countMap.put(i, 0);
		        }

		        
		        for (int num : numbers) {
		            for (int i = 1; i <= 9; i++) {
		                if (num % i == 0) {
		                    countMap.put(i, countMap.get(i) + 1);
		                }
		            }
		        }

		        
		        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}
