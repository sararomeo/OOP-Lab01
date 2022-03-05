
public class Calculator2 {
	private int nOpDone;
	private double lastRes;
	
	public void build() {
		nOpDone=0;
		lastRes=0;
	}
	
	double add(double a, double b) {
		return updateFields(a+b);
	}
	double sub(double a, double b) {
		return updateFields(a-b);
	}
	double mul(double a, double b) {
		return updateFields(a*b);
	}
	double div(double a, double b) {
		return updateFields(a/b);
	}
	
	public double updateFields(double res){
		nOpDone++;
		lastRes=res;
		return lastRes=res;
	}

	public int getnOpDone() {
		return nOpDone;
	}

	public double getLastRes() {
		return lastRes;
	}
	
	
}
