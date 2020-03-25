import java.io.IOException;
import java.util.Scanner;

import com.september.FileChecker.FileChecker;
import com.september.RedQueen.RedQueen;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, IOException {
		RedQueen rq = new RedQueen();
		rq.sayHello();
		
		System.out.println("Введите директорию для удаления файлов из папки");
		String path = in.nextLine();
		
		FileChecker checker = new FileChecker(path);
		
		
		checker.getFiles();
		checker.deleteFilesFromTemp();
		checker.deleteDirFromTemp();
		

	}

}
