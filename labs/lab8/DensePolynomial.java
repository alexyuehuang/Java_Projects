package lab8;

import java.util.Arrays;

public class DensePolynomial implements Polynomial{
	private final double[] a;
		/**
	 * @param a
	 */
	public DensePolynomial() {
		a=new double[1];
	}
	private DensePolynomial(double[] b) {
		a=b;
	}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(a);
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
			DensePolynomial other = (DensePolynomial) obj;
			if (!Arrays.equals(a, other.a))
				return false;
			return true;
		}
		
		@Override
		public Polynomial addTerm(double coefficient, int degree) {
			if(coefficient ==0) {
				Polynomial c= new DensePolynomial(a);
				return c;
			}
			else {
				return new DensePolynomial(CoefficientArrayUtils.createNextCoefficients(coefficient, degree, a));
			}
		}

		@Override
		public int degree() {
			boolean m = true;
			int i=a.length-1;
			while(m==true&&i>=0) {
				if (a[i]!=0) {
					m=false;
				}
				i--;
			}
			return 1+i;
		}

		@Override
		public double getCoefficientAtDegree(int degree) {
			if(degree>=a.length) {
				return 0.0;
			}
			else {
			return a[degree];
			}
		}

		@Override
		public double evaluate(double x) {
			double m = 0;
			for (int i=0; i<a.length; i++) {
				m=m+a[i]*Math.pow(x, i);
			}
			return m;
		}

		@Override
		public Polynomial derivative() {
			double[] m= new double [a.length-1];
			for (int i=0; i<m.length; i++) {
				m[i] = a[1+i]*(i+1);
			}
			return new DensePolynomial(m);
		}

		@Override
		public Polynomial sum(Polynomial other) {
			double[] m= new double [Math.max(a.length, other.degree()+1)];
			for (int i=0; i<a.length; i++) {
				m[i] = a[i];
			}
			for(int i=0; i<other.degree()+1; i++) {
				m[i]+=other.getCoefficientAtDegree(i);
			}
			return new DensePolynomial(m);
		}
		@Override
		public String toString() {
			String s="";
			for (int i=0; i<this.degree()+1; i++) {
				s=s+a[i]+"x^"+i+"+";
			}
			return s;
		}
		
		
		
}
