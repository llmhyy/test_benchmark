package com;

public class Benchmark {
	public void test1(int a, int b, int c){
		if(Math.sqrt(a)<=25){
			if(Math.sqrt(b)<=25){
				if(log(2, a-b)>=3){
					System.currentTimeMillis();
				}
			}
		}
		
		return;
	}
	
	static int log(int x, int base)
	{
	    return (int) (Math.log(x) / Math.log(base));
	}
}
