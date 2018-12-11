package chords.music;

public class Triad {
	private int root;
	private DiatonicScale ds;
	
	/**
	 * Diatonic triad starting at the specified note
	 * @param ds  Scale for the triad
	 * @param root  Starting note of the triad
	 */
	public Triad(DiatonicScale ds, int root) {
		this.ds=ds;
		this.root=root;
	}
	
	/**
	 * Returns the root, middle, and top note of the triad as an array
	 * @return an array with the root, middle, top notes of this triad
	 */
	public SingleTone[] getTones() {
		SingleTone [] a=new SingleTone [3];
		a[0]=new SingleTone(ds.getPitch(root).getHertz());
		a[1]=new SingleTone(ds.getPitch(root+2).getHertz());
		a[2]=new SingleTone(ds.getPitch(root+4).getHertz());
		return a;
	}
	
	public String toString() {
		return "A triad";  // FIXME with more detail if you like
	}
	
	/**
	 * Return samples of this triad that have the specified amplitude and duration.
	 * @param amplitude the amplitude of the combined samples.  This means the individual tones must be scaled to fit
	 *    within the specified amplitude.
	 * @param duration the length in seconds of the returned samples
	 * @return samples of this triad at the specified amplitude and duration
	 */
	public Samples getSamples(double amplitude, double duration) {
		return getTones()[0].getSamples(amplitude/3.0, duration).combine(getTones()[1].getSamples(amplitude/3.0, duration)).combine(getTones()[2].getSamples(amplitude/3.0, duration));
	}

}
