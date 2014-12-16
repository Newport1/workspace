// Copyright Wintriss Technical Schools 2013 
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.TurtlePanel;

public class FeedTheTortoise2Player implements KeyEventDispatcher {

	// 1. Decide where to put the food by setting these variables
	int foodLocationX = 50;
	int foodLocationY = 50;

	// 2. Choose a character for your food or leave it as *
	Component food = new Label("≈");

	private void goUp() {
		// 3. Make the Tortoise move up the screen
		Tortoise.move(10);

	}

	private void goDown() {
		// 4. Make the Tortoise move down the screen
		Tortoise.move(-10);
	}

	private void goLeft() {
		// 5. make the tortoise move left. Hint: Make sure to end with the
		// Tortoise facing UP.
		Tortoise.turn(-90);
		Tortoise.move(10);
		Tortoise.turn(90);

	}

	private void goRight() {
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(-90);
		// 6. make the tortoise move right
	}

	private void checkIfFoodFound() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		int Y = Tortoise.getY();
		int X = Tortoise.getX();
		// 7. if tortoise is near the food
		System.out.println(X + "," + Y);
		if (Y == foodLocationY) {
			if (X == foodLocationX) {
				Runtime.getRuntime().exec(" say yum!");
			}

		}

	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			if (e.getKeyCode() == KeyEvent.VK_W)
				
			{
				moveFoodUp();
			}

			if (e.getKeyCode() == KeyEvent.VK_D)
				
			{
				moveFoodRight();
			}

if (e.getKeyCode() == KeyEvent.VK_A)
				
			{
				moveFoodLeft();
			}

if (e.getKeyCode() == KeyEvent.VK_S)
	
{
	moveFoodDown();
}
			// Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			// 8. if the W key is pressed,
			// call the method moveFoodUp();

			// 11. Do the same for left, right, and down. You can choose your
			// own keys if you like. You will need to make new methods for
			// moving the food.

			// 12. If the secret key is pressed
			// Call the method moveFoodToARandomLocation
if (e.getKeyCode() == KeyEvent.VK_Q)
	
{
	Tortoise.setAnimal(Animals.Spider);
	moveFoodToARandomLocation();
}

		}
		return processEvent();
	}

	private void moveFoodUp() {
		System.out.println("Move food up!");
		// 9. decrement foodLocationY
		foodLocationY = foodLocationY - 10;
		// 10. call the moveFood() method
		moveFood();
	}

	private void moveFoodRight() {
		System.out.println("Move food RIGHT!");
		// 9. decrement foodLocationY
		foodLocationX = foodLocationX + 10;
		// 10. call the moveFood() method
		moveFood();
	}
	
	private void moveFoodLeft() {
		System.out.println("Move food Left!");
		// 9. decrement foodLocationY
		foodLocationX = foodLocationX - 10;
		// 10. call the moveFood() method
		moveFood();
	}
	
	private void moveFoodDown() {
		System.out.println("Move food Down!");
		// 9. decrement foodLocationY
		foodLocationY = foodLocationY + 10;
		// 10. call the moveFood() method
		moveFood();
	}

	private void moveFoodToARandomLocation() {
		foodLocationX = new Random().nextInt(window.getSize().width);
		foodLocationY = new Random().nextInt(window.getSize().height);
		moveFood();
	}

	private void moveFood() {
		food.setLocation(foodLocationX, foodLocationY);
		window.add(food);
	}

	TurtlePanel window = Tortoise.getBackgroundWindow();

	public static void main(String[] args) {
		FeedTheTortoise2Player feeder = new FeedTheTortoise2Player();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

	}

	private void feedTheTortoise() {
		moveFood();
	}

	private boolean processEvent() {
		try {
			checkIfFoodFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
