package finalproject;

import java.util.Arrays;

import cse131.NotYetImplementedException;

/**
 * @author Mariah Yelenick and Adam Kern
 * @version 11/18/18
 */
public class Ship {
	private final int topLeftX, topLeftY, length;
	private final boolean isHorizontal;
	public boolean[] hit;
	/**
	 * Create an instance of the ship class, recording all necessary information into
	 * any instance variables you choose to create
	 * 
	 * @param topLeftX the x coordinate of the ship's uppermost, leftmost space
	 * @param topLeftY the y coordinate of the ship's uppermost, leftmost space
	 * @param length the number of spaces the ship occupies
	 * @param isHorizontal if true, the ship is placed horizontally, else the ship is placed vertically
	 */
	public Ship(int topLeftX, int topLeftY, int length, boolean isHorizontal) {
		this.topLeftX=topLeftX;
		this.topLeftY=topLeftY;
		this.length=length;
		this.isHorizontal=isHorizontal;
		this.hit=new boolean[length];
		for(int i=0; i<length; i++) {
			hit[i]=false;
		}
	}
	
	/**
	 * Check if the ship has been sunk
	 * This should only be true if the ship was hit in all the spaces it occupies
	 * 
	 * @return true if the ship has been sunk
	 */
	public boolean isSunk() {
		boolean a=true;
		for(int i=0; i<length; i++) {
			if(hit[i]==false) {
				a=false;
			}
		}
		return a;
	}
	
	/**
	 * Check if the ship occupies a space at (x, y)
	 * Note: Be sure to update the hits array so that you can check if the ship is sunk!
	 * 
	 * @param x the x coordinate to shoot at
	 * @param y the y coordinate to shoot at
	 * @return true if this ship occupies that spot (hit), false otherwise (miss)
	 */
	public boolean isHit(int x, int y) {
		if(this.topLeftX==x||this.topLeftY==y) {
			if(this.isHorizontal) {
				if(this.topLeftY==y) {
					if(x-this.topLeftX>=0&&x-this.topLeftX<length) {
						hit[x-this.topLeftX]=true;
						return true;
						
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				if(this.topLeftX==x) {
					if(y-this.topLeftY>=0&&y-this.topLeftY<length) {
						hit[y-this.topLeftY]=true;
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
	public boolean isOK(int x, int y) {
		if(this.topLeftX==x||this.topLeftY==y) {
			if(this.isHorizontal) {
				if(this.topLeftY==y) {
					if(x-this.topLeftX>=0&&x-this.topLeftX<length) {
						return true;
						
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			else {
				if(this.topLeftX==x) {
					if(y-this.topLeftY>=0&&y-this.topLeftY<length) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
	}
	public boolean isHorizontal() {
		return this.isHorizontal;
	}

	public boolean[] getHit() {
		return hit;
	}

	public void setHit(boolean[] hit) {
		this.hit = hit;
	}

	public int getTopLeftX() {
		return topLeftX;
	}

	public int getTopLeftY() {
		return topLeftY;
	}

	public int getLength() {
		return length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(hit);
		result = prime * result + (isHorizontal ? 1231 : 1237);
		result = prime * result + length;
		result = prime * result + topLeftX;
		result = prime * result + topLeftY;
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
		Ship other = (Ship) obj;
		if (!Arrays.equals(hit, other.hit))
			return false;
		if (isHorizontal != other.isHorizontal)
			return false;
		if (length != other.length)
			return false;
		if (topLeftX != other.topLeftX)
			return false;
		if (topLeftY != other.topLeftY)
			return false;
		return true;
	}

	public String toString() {
		String a="";
		a=a+this.topLeftX+this.topLeftY+this.isHorizontal+this.length+this.isSunk();
		return a;
	}
	
}
