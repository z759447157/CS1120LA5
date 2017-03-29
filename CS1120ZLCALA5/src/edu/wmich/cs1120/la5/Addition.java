package edu.wmich.cs1120.la5;

public class Addition implements IOperation{

	@Override
	/**
	 * Performs integer addition
	 * @param left IExpression
	 * @param right IExpression
	 * @return left+right Integer
	*/
	public Integer perform(IExpression left, IExpression right) {
		// TODO Auto-generated method stub
		return left.getValue() + right.getValue();
	}


}
