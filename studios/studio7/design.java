package studio7;

public class design {
	public class Rectangle{
		private double length,width;

		/**
		 * @param length
		 * @param width
		 */
		public Rectangle(double length, double width) {
			super();
			this.length = length;
			this.width = width;
		}

		public double getLength() {
			return length;
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

	}
	public class Die{
		private double sides;

		/**
		 * @param sides
		 */
		public Die(double sides) {
			super();
			this.sides = sides;
		}
	}


}
