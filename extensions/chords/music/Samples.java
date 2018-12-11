package chords.music;

import sedgewick.StdAudio;
import sun.security.util.Length;

/**
 * Represent a double[] samples array.
 * A Samples object has-a double[] array of samples, which it hides and does not expose except through
 *    the methods defined below.
 * @author roncytron
 *
 */

public class Samples {
	private final double[]a;
	/**
	 * Capture the specified samples in our local array, so that they are safe from modification
	 * @param samples
	 */
	public Samples(double[] samples) {
		a= new double[samples.length];
		for(int i =0;i<samples.length; i++) {
			a[i] = samples[i];
		}
	}

	/**
	 * Construct samples of the specified length, all zero.
	 * @param length
	 */
	public Samples(int length) {
		a=new double[length];
	}

	/**
	 * Concatenate this and the other sample, returning a NEW samples object, and leaving the two inputs unchanged
	 * @param other
	 * @return the concatenation of these samples with the other samples
	 */
	public Samples concat(Samples other) {
		double [] b=new double [this.a.length+other.a.length];
		for (int i =0; i<this.a.length; i++) {
			b[i] = this.a[i];
		}
		for (int i =this.a.length; i<this.a.length+other.a.length; i++) {
			b[i] = other.a[i-this.a.length];
		}
		return new Samples(b);
	}

	/**
	 * Combine this and the other samples, padding by 0 if necessary, returning a NEW samples object, and leaving the two inputs unchanged
	 * @param other
	 * @return the numerical addition of these and the other samples, padded by 0 where necessary
	 */
	public Samples combine(Samples other) {
		double [] b=new double [Math.max(this.a.length,other.a.length)];
		for (int i =0; i<b.length; i++) {
			if(this.a.length>i&&other.a.length>i) {
				b[i] = this.a[i]+other.a[i];
			}
			else if(this.a.length>i) {
				b[i] = this.a[i];
			}
			else {
				b[i] = other.a[i];
			}
		}
		return new Samples(b);
	}

	/**
	 * 
	 * @return the number of samples
	 */

	public int getNumSamples() {
		return a.length;
	}

	/**
	 * Play these samples, by calling StdAudio.play(..) passing in the double array of samples
	 */
	public void play() {
		StdAudio.play(a);
	}

	public String toString() {
		return "Samples with " + this.getNumSamples() + " values";
	}

	/**
	 * Accessor to return a particular sample
	 * @param i the sample to be returned, with 0 as the first sample
	 * @return the specified sample value
	 */
	public double getSample(int i) {
		return a[i];
	}

	/**
	 * Valid only for a positive number of samples, this method returns the maximum value of all samples
	 * @return the maximum value
	 */
	public double getMax() {
		double j=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]>j) {
				j=a[i];
			}
		}
		return j;
	}

	/**
	 * Valid only for a positive number of samples, this method returns the minimum value of all samples
	 * @return the minimum value
	 */
	public double getMin() {
		double j=a[0];
		for (int i=0; i<a.length; i++) {
			if(a[i]<j) {
				j=a[i];
			}
		}
		return j;
	}

}
