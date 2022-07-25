package com.ankita.driver;
import com.ankita.service.*;
public class Driver {
	
		public static void main(String[] args) {

			String expr = "([[{}]])";

			if (BalancingBrackets.areBracketsBalanced(expr))
				System.out.println("The entered string is Balanced");
			else
				System.out.println("The entered string is Not Balanced");
		}
}