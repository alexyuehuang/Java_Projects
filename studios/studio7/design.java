package studio7;

public class design {
	public class Rectangle{
		private double length,width, x, y;

		/**
		 * @param x
		 * @param y	
		 * @param length
		 * @param width
		 */
		public Rectangle(double length, double width, double x , double y) {
			super();
			this.length = length;
			this.width = width;
			this.x =x;
			this.y =y;
		}

		public double getLength() {
			return length;
		}
		public double getY() {
			return y;
		}

		public double getX() {
			return x;
		}

		public double getWidth() {
			return width;
		}

		public double getArea() {
			return this.length*this.width;
		}

		public double getPeri() {
			return 2*(this.length+this.width);
		}
		
		public boolean isSquare() {
			return this.length==this.width;
		}
		
		public boolean isSmaller(Rectangle a) {
			return this.getArea()<a.getArea();
		}
		public String toString() {
			return "This rectangle has a length of: "+this.getLength()+" This rectangle has a width of: "+this.getWidth();
		}
		public Rectangle rotate() {
			return new Rectangle(this.width, this.length, this.x, this.y) ;
		}
		public boolean isPointIn(double a, double b) {
			return a>=(this.x)&&a<=(this.x+this.length)&&b>=(this.y-this.width)&&a<=(this.y);
		}
		public boolean isMeet(Rectangle c) {
			return Math.max(c.width, this.width)<Math.abs(this.y-c.y)&&Math.max(c.length, this.length)<Math.abs(this.x-c.x);
		}
	}
	public class Die{
		private int sides;

		/**
		 * @param sides
		 */
		public Die(int sides) {
			super();
			this.sides = sides;
		}
		public int rollDie() {
			return (int)(Math.random()*this.sides)+1;
		}
		public int getSides() {
			return this.sides;
		}
		public String toString() {
			return "This die has "+this.getSides()+" sides ";
		}
	}
	public class Fraction{
		private int numerator, denominator;

		/**
		 * @param numerator
		 * @param denominator
		 */
		public Fraction(int numerator, int denominator) {
			super();
			this.numerator = numerator;
			this.denominator = denominator;
		}

		public int getNumerator() {
			return this.numerator;
		}

		public int getDenominator() {
			return this.denominator;
		}
		public Fraction add(Fraction a) {
			return new Fraction((a.numerator*this.denominator+this.numerator*a.denominator),(this.denominator*a.denominator));
		}
		public Fraction mult(Fraction a) {
			return new Fraction((a.numerator*this.numerator),(this.denominator*a.denominator));
		}
		public Fraction reciprocal() {
			return new Fraction((this.denominator),(this.numerator));
		}
		public Fraction simplify() {
			int k =1;
			for (int i=2; i<=Math.min(this.getNumerator(), this.getDenominator()); i++) {
				if (this.numerator%i ==0 &&this.denominator%i ==0) {
					k = i;
				}
			}
			return new Fraction((this.numerator)/k,(this.denominator)/k);
		}
		public String toString() {
			return "This fraction is "+this.getNumerator() + "/"+this.getDenominator();
			
		}
	}
	public class Complex{
		private double real, imaginary;

		/**
		 * @param real
		 * @param imaginary
		 */
		public Complex(double real, double imaginary) {
			super();
			this.real = real;
			this.imaginary = imaginary;
		}
		
		public double getReal() {
			return this.real;
		}

		public double getImaginary() {
			return this.imaginary;
		}

		public String toString() {
			return "This complex number is "+this.getReal() + "+ i* "+this.getImaginary();
		}
		public Complex add(Complex a) {
			return new Complex((a.real*this.real),(this.imaginary*a.imaginary));
		}
		public Complex mul(Complex a) {
			return new Complex((a.real*this.real)-(this.imaginary*a.imaginary), (a.real*this.imaginary)+(a.imaginary*this.real));
		}
	}
	public class HockeyPlayer{
		private int jersey;
		private String name;
		private boolean isLeft;
		/**
		 * @param jersey
		 * @param name
		 * @param isLeft
		 */
		public HockeyPlayer(int jersey, String name, boolean isLeft) {
			super();
			this.jersey = jersey;
			this.name = name;
			this.isLeft = isLeft;
		}
		public int getJersey() {
			return this.jersey;
		}
		public String getName() {
			return this.name;
		}
		public boolean isLeft() {
			return this.isLeft;
		}
		public String toString() {
			return "This play "+this.getName() + " has a jersey num of "+this.getJersey();
		}
		
	}
}
