package com.greatlearning.bracket;

public class Driver {

	public static void main(String[] args)
	{
		
		String bracketExpr="[[{}]])";
		
		Boolean result;
		
		Bracket bracket=new Bracket();
		result=bracket.checkingBracketBal(bracketExpr);
		
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		
		else 
			System.out.println("The entered String do not contain Balanced Brackets");
		
	}

}


