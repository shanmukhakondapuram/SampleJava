package sampleTest.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class MyComparator implements Comparator<Map.Entry<String, Integer>>
{

	@Override
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue() > o2.getValue()  ? -1 : o1.getValue()  < o2.getValue()  ? 1 : 0;
	}
	
}

public class SortingHashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Shan", 100);
		hm.put("kalyan", 1000);
		hm.put("shashi", 10);
		hm.put("sai", 50);
		hm.put("shan1", 500);
		hm.put("shan2", 700);
		System.out.println(hm);
		
		ArrayList<Map.Entry<String, Integer>> entrylist = new ArrayList<>(hm.entrySet());
		
		
		Collections.sort(entrylist, (o1,o2) -> o1.getValue() > o2.getValue()  ? -1 : o1.getValue()  < o2.getValue()  ? 1 : 0);
		
		
		entrylist.stream().forEach((o) -> System.out.println("Key: " + o.getKey() + " value: " + o.getValue()));
		}
	}
