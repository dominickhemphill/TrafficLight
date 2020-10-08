package edu.cscc;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		TrafficLightColor color = null;
		while(color == null) {
			try {
			color = inputColor(); 
			} catch(IllegalArgumentException ex) {
				listColors();
			}
		}
		
		System.out.println("Traffic Light Color: "+color);
		switch(color) {
		case RED:
			System.out.println("Stop");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		case YELLOW:
			System.out.println("Caution");
			break;
		}
	}
	
	public static TrafficLightColor inputColor() throws IllegalArgumentException {
		System.out.print("Enter traffic light color: ");
		String colorstr = input.nextLine();
		TrafficLightColor color = TrafficLightColor.valueOf(colorstr.strip().toUpperCase());
		return color;
	}
	
	public static void listColors() {
		System.out.print("Valid color values:");
		for (TrafficLightColor c : TrafficLightColor.values()) {
			System.out.print(" "+c);
		}
		System.out.print("\n");
	}
}

