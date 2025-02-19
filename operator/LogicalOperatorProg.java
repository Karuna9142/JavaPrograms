package com.operator;

public class LogicalOperatorProg {

	public static void main(String[] args) {
		
		int var1 = 10;
		int var2 = 20;
		
		int var3 = 30;
		int var4 = 40;
		
		//logical Operator symbol = (&&, ||, !=)
		//Logical Or -> ||
		if(var1<var2 || var3<var4) {
			System.out.println("Java");
		}
		if(var1>var2 || var3<var4) {
			System.out.println("Backend");
		}
		if(var1 >var2 || var3 >var4) {
			System.out.println("Full Stack");
		}
		
//		Logical AND -> &&
		if(var1<var2 && var3<var4) {
			System.out.println("Java");
		}
		if(var1>var2 && var3 <var4) {
			System.out.println("Backend");
		}
		if(var1>var2 && var3 >var4) {
			System.out.println("Full Stack");
		}

		//Logical Not -> !=
		if(var1 != var2)
			System.out.println("Java Full Stack Development");
	}

}
