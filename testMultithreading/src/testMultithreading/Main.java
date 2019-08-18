package testMultithreading;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author vitalii September22
 * Т.к. Idea платная, и пока раздобыть её не выходит
 * то  пишу в Эклипсе.
 */
public class Main {
	public static void main(String [] args){
		ConsoleHate hater = new ConsoleHate();
		Love lover = new Love();
		
		ExecutorService ex = Executors.newFixedThreadPool(2); //Экзекутор многопоточности позволяет запустить 2 потока сразу
		ex.submit(hater);
		ex.submit(lover);
		
}
}

class ConsoleHate implements Runnable{
	@Override
	public void run() {
		try 
		{
			for (int i = 0; i < 100; i++)
 			{
 				System.out.println("\nHate YOU!");
				Thread.sleep(1000);
			}
		}
		
		catch (InterruptedException e) 
		{
				e.printStackTrace();
		}
	}
}

class Love implements Runnable{
	
	Scanner in = new Scanner(System.in);
	String interput = in.nextLine();
	
	@Override
	public void run() {
		try
		{
			
			while(true)
			{
				System.out.println("Введите команду -'hate' или 'love' ");
				
				
				if(interput.equalsIgnoreCase("hate"))
					System.exit(0);
				else
				{
					System.out.println("Давай по новой, Миша");
				}
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}