package com;

public class Benchmark {
	public void test1(int a, int b, int c){
		if(a == b){
			if(a < identity(c)){
				return;
			}
			else if(Math.abs(a) < c+5){
				return;
			}
		}
		else if(Math.sqrt(a) + Math.exp(b) < Math.asin(c)){
			if(b%5==3){
				return;
			}
			else if(a/b>3){
				return;
			}
		}
		
		return;
	}

	private int identity(int c) {
		if(c<=0){
			return 0;			
		}
		else{
			return 1 + identity(c-1);
		}
	}
	
	
}
