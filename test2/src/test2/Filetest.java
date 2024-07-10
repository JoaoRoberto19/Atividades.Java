package test2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filetest {
	File file = new File ("link do arquivo");
	Scanner sc = null;

	try {
		sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());}
		}
	catch (IOException e) {
		System.out.println("Error" + e.getMessage());
	}

	finally {
		if (sc != null) {
			sc.close();
			}
		}
	}

}
