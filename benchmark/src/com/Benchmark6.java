package com;

public class Benchmark6 {
	int[] a;
	double b;
	
	public int test(){
		if(a.length > 5){
			if(a[3] == 20 && b == 20){
				return 0;
			}
		}
		
		return 1;
	}
}
