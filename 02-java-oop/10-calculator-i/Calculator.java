public class Calculator implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;

	public Calculator() {
		
	}
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operation = "+";
		this.results = 0;
	}

	public double getOperandOne() {
		return operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}

	public String getOperation() {
		return operation;
	}
	
	public double getResults() {
		return results;
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setResults(double results) {
		this.results = results;
	}
	
	public double performOperation() {
		if(getOperation() == "+") {
			setResults(getOperandOne() + getOperandTwo());
		} else if(getOperation() == "-") {
			setResults(getOperandOne() - getOperandTwo());
		}
		return results;
	}
}