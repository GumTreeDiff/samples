import java.util.Random;

public class Example {

	public void hello() {
		System.out.println("Hello everybody!");
		System.out.println("This code is a magnificent example");
		System.out.println("For the ASE 2014 conference");
		System.out.println("It draws a number at random");
		System.out.println("Adds 10");
		System.out.println("Multiplies by 10");
		System.out.println("And displays it");
<<<<<<< HEAD
		int i = random();
		System.out.println(i);
	}
	
	public int random() {
=======
>>>>>>> 450f97f58b5d67956d06bd9848b426a40fbdb90e
		Random r = new Random();
		int i = r.nextInt();
		i += 10;
		i *= 10;
<<<<<<< HEAD
		return i;
	}

}
=======
		System.out.println(i);
	}

}
>>>>>>> 450f97f58b5d67956d06bd9848b426a40fbdb90e
