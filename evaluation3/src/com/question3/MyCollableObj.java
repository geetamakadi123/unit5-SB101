package com.question3;

import java.util.concurrent.Callable;
public class MyCollableObj implements Callable<Integer> {

	int num;
	
	public MyCollableObj(int n) {
		this.num=n;
	}
	
	int bag=1;
	
	@Override
	public Integer call() throws Exception{
		for(int i=1;i<=num;i++) {
			bag=num*i;
			}
		return bag;
	}
}