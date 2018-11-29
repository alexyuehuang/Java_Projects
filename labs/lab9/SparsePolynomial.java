package lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lab8.Polynomial;

public class SparsePolynomial implements Polynomial {
	private final Map<Integer, Double> b;
	
	/**
	 * @param b
	 */
	public SparsePolynomial(Map<Integer, Double> d) {
		super();
		this.b = d;
	}
	 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparsePolynomial other = (SparsePolynomial) obj;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}


	/**
	 * 
	 */
	public SparsePolynomial() {
		super();
		double[]a =new double[0];
		this. b=new HashMap<Integer, Double> ();
	}

	@Override
	public Polynomial addTerm(double coefficient, int degree) {
		if (coefficient ==0) {
			return new SparsePolynomial(b);
		}
		else {
			SparsePolynomial a=new SparsePolynomial(MapDegreeToCoefficientUtils.createNextMap(coefficient, degree, b));
			return a;
		}
	}

	@Override
	public int degree() {
		int i =0;
		for (Integer key:b.keySet()) {
			if(key>i&&b.get(key)!=0) {
				i=key;
			}
		}
		return i;
	}

	@Override
	public double getCoefficientAtDegree(int degree) {
		if(b.containsKey(degree)) {
		return b.get(degree);
		}
		else {
			return 0.0;
		}
	}

	@Override
	public double evaluate(double x) {
		double i =0;
		for(Integer key:b.keySet()) {
			i+=Math.pow(x, key)*b.get(key);
		}
		return i;
	}

	@Override
	public Polynomial derivative() {
		Polynomial i=new SparsePolynomial();
		for(Integer key:b.keySet()) {
			if(key!=0) {
			double coefficient=b.get(key)*key;
			i=i.addTerm(coefficient, key-1);
			}
		}
		return i;
	}

	@Override
	public Polynomial sum(Polynomial other) {
		Polynomial i=new SparsePolynomial();
		for(Integer key:b.keySet()) {
			i=i.addTerm(b.get(key), key);
		}
		for(int key=0; key<=other.degree(); key++) {
			i=i.addTerm(other.getCoefficientAtDegree(key), key);
		}
		return i;
	}
	public String toString() {
		String i="";
		for (Integer key: b.keySet()) {
			i+="x^"+key+"and coefficient"+b.get(key);
		}
		return i;
	}

}
