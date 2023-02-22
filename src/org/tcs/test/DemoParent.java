package org.tcs.test;

import org.cts.test.DemoParentTwo;

public class DemoParent {

	public void studentName() {
		System.out.println("Student name is Deepika");
	}
	
	public static void main(String[] args) {
		DemoParent d = new DemoParent();
		d.studentName();
		
		DemoParentTwo dp= new DemoParentTwo();
		dp.trainerName();
	}
	
}
