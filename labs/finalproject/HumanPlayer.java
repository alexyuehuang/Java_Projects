package finalproject;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import cse131.ArgsProcessor;
import cse131.NotYetImplementedException;
import sedgewick.StdDraw;

public class HumanPlayer implements Player {

	private final ArgsProcessor ap; // Don't change this!
	private final String name;
	private final int height, width;
	private Ship[] ship;
	private int[][] hited;
	/**
	 * Creates an instance of the HumanPlayer class
	 * Note that we already dealt with taking in an ArgsProcessor object
	 * 		We know you've never seen this before, which is why it's given to you
	 * 		You can treat this ArgsProcessor (ap) throughout the HumanPlayer class
	 * 			like any other ArgsProcessor you've used in 131
	 * We leave the rest of the constructor to you
	 * 
	 * @param name the name of the player
	 * @param height the height of the board
	 * @param width the width of the board
	 * @param ap the ArgsProcessor object
	 */
	public HumanPlayer(String name, int height, int width, ArgsProcessor ap) {
		this.ap = ap;
		this.name=name;
		this.height=height;
		this.width=width;
		this.ship=new Ship[0];
		this.hited=new int [width][height];
	}

	@Override
	public boolean addShip(Ship s) {
		boolean a=true;
		if (isValidShipToAdd(s)) {
			Ship[] nova=new Ship[ship.length+1];
			for(int i=0; i<ship.length; i++) {
				nova[i]=ship[i];
			}
			nova[ship.length]=s;
			ship=nova;
			a=true;
			for(int i=0; i<ship.length-1; i++) {
				if(ship[i]==s) {
					a=false;
				}
			}
		}
		else {
			a=false;
		}
		return a;
	}

	@Override
	public int[] getTargetLocation() {
		int[]a=new int[2];
		int m=ap.nextInt("x?");
		int n=ap.nextInt("y?");
		while(m<0||n<0||m>=width||n>=height){
			m=ap.nextInt("x?");
			n=ap.nextInt("y?");
		}
		a[0]=m;
		a[1]=n;
		return a;
	}

	@Override
	public void recordHitOrMiss(int x, int y, boolean isHit) {
		if(isHit) {
			hited[x][y]=2;
		}
		else {
			hited[x][y]=1;
		}
	}

	@Override
	public Ship decideShipPlacement(int length) {
		int x=ap.nextInt("x?");
		int y=ap.nextInt("y?");
		boolean isH=ap.nextBoolean("horizontal?");
		Ship p=new Ship(x, y, length, isH);
		while(!isValidShipToAdd(p)) {
			x=ap.nextInt("x?");
			y=ap.nextInt("y?");
			isH=ap.nextBoolean("horizontal?");
			p=new Ship(x, y, length, isH);
		}
		return p;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean respondToFire(int x, int y) {
		boolean a=false;
		if(x<0||y<0) {
			a=false;
		}
		if(x>width||y>height) {
			a=false;
		}
		for(Ship k:ship) {
			if(k.isHit(x,y)) {
				a=true;
			}
		}
		return a;
	}

	@Override
	public int numShipsStillAfloat() {
		int a=0;
		for(int i=0; i<ship.length; i++) {
			if(ship[i].isSunk()==false) {
				a++;
			}
		}
		return a;
	}

	@Override
	public boolean addRandomShip(int length) {
		int x=(int) (Math.random()*width);
		int y=(int) (Math.random()*height);
		boolean is=true;
		if(Math.random()>0.5) {
			is=false;
		}
		int i=0;
		boolean a=true;
		Ship s =new Ship(x, y, length, is);
		while(!isValidShipToAdd(s)&&i<10000) {
			x=(int) (Math.random()*width);
			y=(int) (Math.random()*height);
			is=true;
			if(Math.random()>0.5) {
				is=false;
			}
			s =new Ship(x, y, length, is);
			i++;
		}
		if(length>Math.max(width, this.height)){
			a=false;
		}
		if(i==10000) {
			a=false;
		}
		if(a) {
			a=addShip(s);
			a=true;
		}
		return a;
	}

	@Override
	public boolean isValidShipToAdd(Ship s) {
		boolean a=true;
		if(s.getTopLeftX()<0||s.getTopLeftY()<0) {
			a=false;
		}
		if(s.getTopLeftX()>width||s.getTopLeftY()>height) {
			a=false;
		}

		if(s.isHorizontal()) {
			for(int i=s.getTopLeftX(); i<s.getTopLeftX()+s.getLength(); i++) {
				for(Ship k:ship) {
					if(k.isOK(i, s.getTopLeftY())) {
						a=false;
					}
				}
			}
			if(s.getLength()+s.getTopLeftX()>width) {
				a=false;
			}
		}
		else {
			for(int i=s.getTopLeftY(); i<s.getTopLeftY()+s.getLength(); i++) {
				for(Ship k:ship) {
					if(k.isOK(s.getTopLeftX(),i)) {
						a=false;
					}
				}
			}
			if(s.getLength()+s.getTopLeftY()>height) {
				a=false;
			}
		}
		return a;
	}

	@Override
	public void printRadar() {
		StdDraw.clear();
		for(int i=0; i<height; i++) {
			StdDraw.line(0, (double)i/height, 1, (double)i/height);
			String a="";
			for(int j=0; j<width; j++) {
				StdDraw.line((double)j/width, 0,(double)j/width, 1);
				double nm=Math.min(1/((double)width*2), 1/((double)height*2));
				if(hited[j][i]==0) {
					a=a+".";
					StdDraw.setPenColor(Color.gray);
					StdDraw.filledCircle((1+2*(double)j)/(double)(width*2), 1-(1+2*(double)i)/(double)(height*2), nm);
				}
				if(hited[j][i]==1) {
					a=a+"o";
					StdDraw.setPenColor(Color.BLUE);
					StdDraw.filledCircle((double)(1+2*j)/(double)(width*2), (double)1-(1+2*i)/((double)height*2), nm);
				}
				if(hited[j][i]==2) {
					a=a+"X";
					StdDraw.setPenColor(Color.RED);
					StdDraw.filledCircle((double)(1+2*j)/((double)width*2), (double)1-(1+2*i)/((double)height*2), nm);
				}
			}
			System.out.println(a);
		}
	}


}
