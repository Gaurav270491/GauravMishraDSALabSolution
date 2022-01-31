package com.greatlearning.bracket;

import java.util.Stack;

public class Bracket {
	
	static boolean checkingBracketBal(String bracketExpr)
	{
		
		Stack<Character> stack= new Stack<Character>();
		
		for(int i =0; i<bracketExpr.length(); i++)
		{
			char character= bracketExpr.charAt(i);
			
			if (character=='(' || character=='[' || character=='{')
				
			{
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char c;
			
			switch (character)
			
			{
			case'}':
				c=stack.pop();
				if (c=='(' || c=='[')
					return false;
				break;
				
			case')':
				c=stack.pop();
				if (c=='{' || c=='[')
					return false;
				break;
				
			case']':
				c=stack.pop();
				if (c=='(' || c=='{')
					return false;
				break;
				
				}
			}
		return (stack.isEmpty());
		
	}
}






