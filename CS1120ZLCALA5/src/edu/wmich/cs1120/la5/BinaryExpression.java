package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{

	private IOperation op;
	private IExpression left;
	private IExpression right;
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return op.perform(left, right);;
	}
	public BinaryExpression(IExpression left, IExpression right, IOperation op) {
		// TODO Auto-generated method stub
		op.perform(left, right);
	}

}
