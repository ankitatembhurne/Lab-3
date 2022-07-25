package com.ankita.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancingBrackets {
	
	public static boolean areBracketsBalanced(String expr) {
		
		
		Deque<Character> stack = new ArrayDeque<Character>();


		for (int i = 0; i < expr.length(); i++)
		{
			
			char x = expr.charAt(i);
			
			
			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			
			char check = stack.pop();
			switch (x) 
			{
				case ')':
					if (check == '{' || check == '[')
						return false;
					break;
					
				case '}':
					if (check == '(' || check == '[')
						return false;
					break;

				case ']':
					if (check == '(' || check == '{')
						return false;
					break;
			}
		}

		return (stack.isEmpty());
	}

}
