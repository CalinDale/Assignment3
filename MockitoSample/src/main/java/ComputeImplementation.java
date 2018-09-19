
public class ComputeImplementation implements ICompute {
	
	ICompute obj;
	
	public int squareVar(int var) {
		return obj.squareVar(var);
	}
	
	public int multiply(int x, int y) {
		return obj.multiply(x, y);
	}

	public void setObj(ICompute obj) {
		this.obj = obj;
	}
}
