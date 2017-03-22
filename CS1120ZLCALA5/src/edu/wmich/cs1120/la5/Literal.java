package edu.wmich.cs1120.la5;

public class Literal implements IExpression{

	private Integer value;
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public Literal(Integer value){
		this.value = value;
	}

}
