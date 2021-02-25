package Collections;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
		cowal.add("Shan");
		cowal.add("Shan1");
		cowal.add("Shan2");
		System.out.println(cowal.get(2));
		//added few comments
		

	}

}
