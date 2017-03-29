package edu.wmich.cs1120.la5;

public class Literal implements IExpression{

	private Integer value;
	@Override
	/**
	 * getValue getter
	 * @return value
	 */
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	/**
	 * value setter
	 * @param value Integer
	 * @return value
	 */
	public Literal(Integer value){
		this.value = value;
	}

}
