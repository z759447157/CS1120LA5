package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	public static IExpression getExpression(char operator, int val1, int val2){
		Literal literal1 = new Literal(val1);
		Literal literal2 = new Literal(val2);
		switch(operator){
		case '+':
			IOperation add = new Addition();
			BinaryExpression anything = new BinaryExpression(literal1, literal2,add);
			
			return anything;
		case '-':
			IOperation subtraction = new Subtraction();
			BinaryExpression anything2 = new BinaryExpression(literal1, literal2,subtraction);

			return anything2;
		default:
			return null;
		}
	}
}
