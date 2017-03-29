package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation{

	@Override
	/**
	 * perform integer subtraction
	 * @param left IExpression
	 * @param right IExpression
	 * 
	 */
	public Integer perform(IExpression left, IExpression right) {
		// TODO Auto-generated method stub
		System.out.println(left.getValue() - right.getValue());
		return left.getValue() - right.getValue();
	}

}
