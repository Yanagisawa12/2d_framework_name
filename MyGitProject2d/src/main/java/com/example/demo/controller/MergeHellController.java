package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
//		kadaiA();
		kadaiB();
	}

		static void kadaiB() {
			Random rand = new Random();
		    int num = rand.nextInt(100) + 1;
		    System.out.println(num + "が出ました");
	}
}