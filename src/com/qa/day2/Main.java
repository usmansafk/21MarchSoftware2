package com.qa.day2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Practice task 1: Switch Statement");
		Switch.SwitchFun();
		
		System.out.println();
		
		System.out.println("Practice task 2: Iterations");
		
		Iteration.forLoop(5);
		Iteration.whileLoop("Cust");
		
		System.out.println();
		
		//  ---------------------------------------------------------------------
		
		System.out.println("Iterations Task: FlowCharts");
		
		FlowCharts.flowchart1();
		FlowCharts.flowcharts2();
		FlowCharts.printNum1();
		FlowCharts.printNum2();
		FlowCharts.multiplicationTable();
		
		//  ---------------------------------------------------------------------

		System.out.println("Task: Enhanced For Loops");
		
		ForEach.task1();
		ForEach.task2();
		System.out.println(ForEach.task3(5));
		ForEach.task4();

		
		

	}

}
