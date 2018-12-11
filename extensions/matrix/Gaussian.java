package matrix;

public class Gaussian {

	Matrix coeff;
	Matrix constants;

	public Gaussian(Matrix matCoeff, Matrix matConst){
		this.coeff = matCoeff;
		this.constants = matConst;
	}


	/**
	 * The hard part!
	 * @return
	 */
	public Matrix getSolution(){
		int k=0;
		boolean m=true;
		int n = coeff.getNumRows();
		for(int i=0; i<n-1; i++) {
			k=i;
			if(coeff.getValue(i, i)==0) {
				for (int z=i+1; z<n; z++) {
					if(coeff.getValue(z,i)!=0&&m==true) {
						coeff.exchangeRows(i, z);
						constants.exchangeRows(i, z);
						m=false;
					}
				}
			}
			if(coeff.getValue(i, i)!=0) {
				coeff.scaleRow(i, (1/coeff.getValue(i, k)));
				constants.scaleRow(i, (1/coeff.getValue(i, i)));
				for (int j=i+1; j<n; j++) {
					coeff.scaleRow(j, (1/coeff.getValue(j, i)));
					constants.scaleRow(j, (1/coeff.getValue(j, i)));
					coeff.minRows(i, j);
					constants.minRows(i, j);
				}
			}
		}
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<=i-1; j++) {
				coeff.scaleRow(i, (coeff.getValue(j, i)));
				constants.scaleRow(i, (coeff.getValue(j, i)));
				coeff.minRows(i, j);
				constants.minRows(i, j);
				coeff.scaleRow(i, (1/coeff.getValue(j, i)));
				constants.scaleRow(i, (1/coeff.getValue(j, i)));
			}
		}
		return constants;
	}

	public String toString(){
		String string ="";
		for(int i=0; i<this.coeff.getNumRows(); i++){
			string+="\n";
			for(int j=0; j<this.coeff.getNumCols()+1; j++){
				if(j==this.coeff.getNumCols()){
					string+= this.constants.getValue(i,0)+ "  ";
				}else{
					string+= this.coeff.getValue(i,j) + "  ";
				}
			}
		}
		System.out.println(string);

		return string;
	}

}
