package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Shape;
import entities.enums.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int nOfShapes = sc.nextInt();
		sc.nextLine();
		
		List<Shape> listOfShapes = new ArrayList<>();
		
		for(int i = 0; i<nOfShapes; i++) {
			System.out.printf("Shape #%d data: %n", i+1);
			System.out.print("Rectangle or Circle (r/c)?");
			char letterOfShape = sc.next().charAt(0);
			sc.nextLine();
			
			switch (letterOfShape) {
			case 'r': {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = sc.nextLine();
				System.out.print("Width:");
				double width = sc.nextDouble();
				System.out.print("Height:");
				double height = sc.nextDouble();
				
				listOfShapes.add(new Rectangle(Color.valueOf(color), height, width));				
				break;
			}
			
			case 'c': {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = sc.nextLine();
				System.out.print("Radius:");
				double radius = sc.nextDouble();

				listOfShapes.add(new Circle(Color.valueOf(color),radius));				
				break;
			}
			default:
				break;
			}
		}
		
		System.out.println("SHAPE AREAS: ");
		for(Shape currentShape : listOfShapes) {
			System.out.println(String.format("%.2f", currentShape.area()));
		}
	}
}
