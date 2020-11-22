package labs.lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static <K, V> List<Pair<K, V>> problem1_mapToList(Map<K, V> map){
		List<Pair<K, V>> ret = new ArrayList<Pair<K, V>>();
		for(K key: map.keySet()) {
			ret.add(new Pair<K, V>(key, map.get(key)));
		}
		return ret;
	}
	
	public static <E> String problem2_getElements(Iterable<E> iter) {
		String ret = "";
		for(E element : iter) {
			ret+=element.toString()+", ";
		}
		return ret.substring(0, ret.length()-2);
	}
	
	public static <E> boolean problem3_isPalindrome(ArrayList<E> arr) {
		for(int i = 0; i<arr.size()/2; i++) {
			if(arr.get(i)!=arr.get(arr.size()-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static <E extends Comparable<E>> boolean problem4_isIncreasing(ArrayList<E> arr){
		if(arr.size() <= 1) {
			return true;
		}
		for(int i = 1; i<arr.size(); i++) {
			if(arr.get(i).compareTo(arr.get(i-1))<0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static <T extends Comparable<T>> Pair<T, T> problem5_minmax(T[] arr){
		T min = null;
		T max = null;
		for(T element : arr) {
			if(min == null || element.compareTo(min)<0) {
				min = element;
			}
			if(max ==null|| element.compareTo(max)>0) {
				max = element;
			}
		}
		return new Pair<T, T>(min, max);
	}
	
	
	
	public static void main(String[] args) {
		/*

		Map<String, Color> colors = new TreeMap<>();
		colors.put("Juliet", Color.BLUE);
		colors.put("Adam", Color.RED);
		colors.put("Eve", Color.BLUE);
		List<Pair<String, Color>> list = problem1_mapToList(colors);
		Iterator<Pair<String, Color>> iter = list.iterator();
		Pair<String, Color> item = iter.next();
		System.out.println(item.getFirst()); // Adam
		System.out.println(item.getSecond()); //java.awt.Color[r=255,g=0,b=0]
		item = iter.next();
		System.out.println(item.getFirst()); // Eve
		System.out.println(item.getSecond()); //java.awt.Color[r=0,g=0,b=255] // etc...
		
		String sentence = "Mary had a little lamb";
		Iterable it = Arrays.asList(sentence.split(" "));
		System.out.println(problem2_getElements(it)); // Mary, had, a, little, lamb
		
		ArrayList<String> a = new ArrayList<>();
		a.add("apple");
		a.add("orange");
		a.add("apple");
		System.out.println(problem3_isPalindrome(a)); // true
		ArrayList<Color> b = new ArrayList<>();
		b.add(Color.RED);
		b.add(Color.GREEN);
		System.out.println(problem3_isPalindrome(b));// false
		ArrayList<Color> c = new ArrayList<>();
		c.add(Color.RED);
		c.add(Color.GREEN);
		c.add(Color.BLUE);
		c.add(Color.GREEN);
		c.add(Color.RED);
		System.out.println(problem3_isPalindrome(c)); // true
		
		ArrayList<String> a = new ArrayList<>();
		a.add("cupcake");
		a.add("banana");
		a.add("apple");
		System.out.println(problem4_isIncreasing(a)); // false
		ArrayList<Integer> b = new ArrayList<>();
		b.add(2);
		b.add(4);
		b.add(4);
		b.add(6);
		b.add(8);
		System.out.println(problem4_isIncreasing(b)); // true
	
		
		
		Integer[] nums = { 10, 100, 50, 15, 8, 99 };
		Pair<Integer, Integer> mm = problem5_minmax(nums);
		System.out.println(mm.getFirst()); // 8 
		System.out.println(mm.getSecond()); // 100
	
		*/
	}
	
	
}
