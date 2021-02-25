package sampleTest.streams;

import java.util.Arrays;

class BaseClass{
	 void calling() {
		System.out.println("Mobile calling");
	}
	 static void mobilecamera() throws Throwable{
		 System.out.println("Mobile camera");
	 }
}
public class Arraywithstream extends BaseClass{
	
	 public void calling() {
		 System.out.println("Samsung Calling");
	 }
	 void camera() {
		 System.out.println("camera of samsung");
	 }
	 static void mobilecamera() throws Exception{
		 System.out.println("Samsung camera");
	 }
	
	public static void main(String[] args) {
		
		//Instance Methods
		
		/*Arraywithstream child = new Arraywithstream();
		child.SameClassInstanceMethod();
		child.SameClassStaticMethod();
		child.add(12.5f, 23);*/
		BaseClass base = new Arraywithstream();
		
		//base.camera();	
		base.calling();
		//base.mobilecamera();
		
		// TODO Auto-generated method stub
		int[] integerarray = {1,2,100,4,5,6,7,8,9,10};
		//MyComparator comparator = new MyComparator();
		
		integerarray =	Arrays.stream(integerarray).boxed().sorted(( o1, o2) -> {return o1 > o2 ? -1 : o1 < o2 ? 1 : 0;}).mapToInt(i->i).toArray();
		System.out.println("Sorted array: " + Arrays.toString(integerarray));
		//Arrays.sort(integerarray,(o1,o2) -> {return o1 > o2 ? 1 : o1 < o2 ? -1 : 0;} );
		
		Arrays.stream(integerarray).forEach(System.out::println);
		
		//reduce method in stream:
		
		int sum = Arrays.stream(integerarray).reduce(0, (x,y) -> x+y);
		
		
		Arrays.stream(integerarray).reduce((x,y) -> x > y ? x : y).ifPresent(s -> System.out.println(s));;
		System.out.println("Sum is: " + sum);
		
		

		//Arrays.stream(integerarray).filter(i->i>0).map(i->i*2).limit(5).forEach(System.out::println);
		
	}
	
}
