package com.dsl.devexp;

public class AddOps implements Operation {
	public int op(int a, int b) {
		return a+b;
	}
	public String getDesc() {
		return "plus";
	}
}
