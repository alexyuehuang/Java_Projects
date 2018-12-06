package matrix;

 
public class Matrix {

	private double[][] values;

	/**
	 * The Matrix is based on the supplied two-dimensional array of values.
	 * Be sure to make your own copy of the values, so that changes to the
	 *    array outside of this class do not affect your work.
	 * @param values
	 */
	public Matrix(double[][] in) {
		values=new double[in.length][in[0].length];	//FIXME -- make a copy of in
          //  this is not the same thing as writing:
		//  values = in
		for(int i=0; i<values[0].length; ++i) {
			for(int j=0; j<values.length; ++j) {
				values[j][i] = in[j][i];
			}
		}
	}

	public double getValue(int row, int col) {
		return this.values[row][col];  // Do not change this!
	}

	public int getNumRows() {
		return values.length;  // Do not change!
	}

	public int getNumCols() {
		return values[0].length; // Do not change!
	}

	/**
	 * You must complete this method, or the equals(Object) test will always
	 *   return false. 
	 * Arrays one and two are considered
	 * equal if and only if:
	 *   1) They have the same shape (number of rows and columns agree)
	 *   2) The contents of the two arrays are the same, element by element
	 * @param one
	 * @param two
	 * @return true iff the arrays have the same shape and contents
	 */
	private static boolean arraysAreEqual(double[][] one, double[][] two) {
		boolean k=true;
		if(one.length==two.length&&one[0].length==two[0].length) {
			for (int i=0; i<one.length; i++) {
				for (int j=0; j<one[0].length; j++) {
					if(one[i][j]!=two[i][j]) {
						k=false;
					}
				}
			}
		}
		else {
			k=false;
		}
		return k;
	}

	/**
	 * This was generated initially by eclipse, but
	 *   eclipse does not know how to compare two-dimensional arrays.
	 *   We therefore call arraysAreEequal to do that job.
	 */
	public boolean equals(Object obj) {
		// If this and obj are the same object, they must be equal
		if (this == obj)
			return true;
		// If obj is null ("this" cannot be null), then they are not equal
		if (obj == null)
			return false;
		// If the two objects are not the same type, they are not equal
		if (getClass() != obj.getClass())
			return false;
		//
		// If we get here, we have two objects of the same type.
		// Calling your helper method to determine the arrays' equality.
		Matrix other = (Matrix) obj;
		return arraysAreEqual(this.values, other.values);
	}

	public Matrix plus(Matrix other) {
		double[][]k=new double[values.length][values[0].length];
		if(values.length!=other.getNumRows()||values[0].length!=other.getNumCols()) {
			throw new IllegalArgumentException("not allowed") ;
		}
		else {
			for(int i=0; i<values.length; i++) {
				for(int j=0; j<values[0].length;j++) {
					k[i][j]=values[i][j]+other.getValue(i, j);
				}
			}
			return new Matrix(k);
		}


	}

	/**
	 * Returns a **new Matrix** that is the product of this and the other one.
	 * Does not change this Matrix at all.
	 * @param other
	 * @return
	 */
	public Matrix times(Matrix other) {
		if(other.getNumCols()==values.length) {
			double[][]k=new double[other.getNumCols()][values.length];
			for(int i=0; i<k.length; i++) {
				for(int j=0; j<k[0].length;j++) {
					int b=0;
					for (int m=0; m<values[0].length; m++) {
						b+=values[i][m]*other.getValue(m, j);
					}
					k[i][j]=b;
				}
			}
			return new Matrix(k);
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Returns a **new Matrix** that is the transpose of this one.
	 * Does not change this Matrix at all.
	 * @return
	 */
	public Matrix transpose() {
		double[][]k=new double[values[0].length][values.length];
		for(int i=0; i<values.length; i++) {
			for(int j=0; j<values[0].length;j++) {
				k[j][i]=values[i][j];
			}
		}
		return new Matrix(k);
	}

	/**
	 * Modifies this Matrix by scaling row i by the supplied factor.
	 * @param i the row to scale, where 0 is the top row
	 * @param factor the amount by which to scale each element of row i
	 */
	public void scaleRow(int i, double factor) {
		if(i<values.length) {
		for (int j=0; j<values[0].length; j++) {
			values[i][j]=values[i][j]*factor;
		}
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Modifies this matrix by adding row i to row j.  Row 0 is the top row.
	 * @param i
	 * @param j
	 */
	public void addRows(int i, int j) {
		for (int k=0; k<values[0].length; k++) {
			values[j][k]=values[j][k]+values[i][k];
		}		
	}
	public void minRows(int i, int j) {
		for (int k=0; k<values[0].length; k++) {
			values[j][k]=-values[j][k]+values[i][k];
		}		
	}
	
	/**
	 * Modifies the Matrix by exchanging row i with row j
	 * @param i
	 * @param j
	 */
	public void exchangeRows(int i, int j){
		double[]a=new double[values[0].length];
		for (int k=0; k<values[0].length; k++) {
			a[k]=values[i][k];
			values[i][k]=values[j][k];
			values[j][k]=a[k];
		}
	}

	/**
	 * My gift to you.  This returns a String representation of
	 * the Matrix.  The contents of each row is separated by a tab (\t)
	 * so that columns (kind of) line up.  Each row is separated by a
	 * newline (\n) so that the output looks like a matrix.  The output
	 * of this method should <i>not</i> be used to compare matrices for
	 * equality:  use the .equals(Object) method instead!
	 */
	public String toString() {
		String ans = "";
		for (int i=0; i < values.length; ++i) {
			ans = ans + "\n";
			// Loop below assumes all rows have the same number of columns
			for (int j=0; j < values[0].length; ++j) {
				ans = ans + values[i][j] + "\t";
			}
		}
		return ans;
	}

}
