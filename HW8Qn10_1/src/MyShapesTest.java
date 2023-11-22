import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;


import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyShapesTest {
	private static Scanner input = new Scanner(System.in);
	
	//boolean for testing while the condition
	
	
	private static SecureRandom randomNum = new SecureRandom();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//boolean for testing while the condition
		 boolean validEnter = false;
		 while(!validEnter) {
		 try {
		String[] clazzNames = {"MyLine", "MyRectangle", "MyOval"};
		int[] contadores = {0, 0, 0};
		
		System.out.print("Type your your total: ");
		
		int myShapes = input.nextInt();
		
		Myshape[] shapes = new Myshape[myShapes];
		
		for(int i = 0; i < myShapes; i++) {
			int random = randomNum.nextInt(clazzNames.length);
			String clazz = clazzNames[random];
			
			int x1 = 100 + randomNum.nextInt(300);
			int y1 = 50 + randomNum.nextInt(300);
			int x2 = 100 + randomNum.nextInt(300);
			int y2 = 50 + randomNum.nextInt(300);
			
			Color color = new Color(1 + randomNum.nextInt(255), 1 +randomNum.nextInt(255),1 + randomNum.nextInt(255));
			
			// switch case 
			switch(clazz) {
			case "MyLine":
				shapes[i] = new MyLine(x1, y1, x2, y2, color);
				contadores[0]++;
				break;
				
			case "MyRectangle":
				shapes[i] = new MyRectangle(x1, y1, Math.abs(x1 - x2), Math.abs(y1- y2), color, false);
				contadores[1]++;
				break;
				
			case "MyOval":
				shapes[i] = new MyOval(x1, y1, Math.abs(x1 - x2), Math.abs(y1 - y2), color, true);
				contadores[2]++;
				break;
			default:
					break;
					
					
			
					
				
			}		
		}
		
		
		//create Jpanel
		JPanel panelLabel = new JPanel();
		for(int i = 0; i < contadores.length; i++) {
			String text = String.format("%s tem %d %s", clazzNames[i],contadores[i],(contadores[i] > 1)? "formas": "forma");
			
			panelLabel.add(new Label(text), BorderLayout.SOUTH);
		}
		
		
		PanelShape panel = new PanelShape(shapes);
		
		JFrame app = new JFrame();
		//add the panel to frame and set size
		app.setSize(800, 600);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel,BorderLayout.CENTER);
		app.add(panelLabel, BorderLayout.SOUTH);
		app.setVisible(true);
		
		 validEnter = true;
		 break;
		 
			 //catching the mistmach error
		 }catch(InputMismatchException e){
			 System.out.println("Please enter a valid input");
			 input .nextLine();
			 
		 }catch(IllegalArgumentException e){
			 System.out.println("Exception" +e.getMessage());
			
		 }
		 
		 }

	}

}
