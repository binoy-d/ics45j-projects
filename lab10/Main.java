package labs.lab10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
	public static String problem1_abbreviateWords(String filename) {

		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			Stream<String> words = 	lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream);
			words = words
					.map(w->(w.charAt(0)+"..."+w.charAt(w.length()-1)));
			return words.collect(Collectors.joining(" "));
			
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return "";
	}

	public static long problem2_countLinesWithThe(String filename) {
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			return lineStream.map(line->line.toLowerCase())
					.filter(line->line.contains(" the ") || line.startsWith("the ") || line.endsWith(" the"))
					.count();
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return 0; // FIX ME
	}

	public static List<String> problem3_getDistinctShortWords(String filename) {
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			Stream<String> words =  lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream)
									.filter(word->word.length()<=4)
									.sorted();
			return words.collect(Collectors.toList());
			
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	public static <T> String problem4_streamToString(Stream<T> stream, int n) {
		// WRITE YOUR CODE HERE
		return stream.limit(n).map(w->w.toString()).collect(Collectors.joining(", "));
	}

	public static Optional<Integer> problem5_smallestProperDivisor(int n) {
		// WRITE YOUR CODE HERE
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				return Optional.of(i);
			}
		}
		return Optional.empty();
	}

	public static int[] problem6_getIntPalindromes(int num) {
		if(num<1) {
			return new int[0];
		}
		// WRITE YOUR CODE HERE
		return IntStream
				.range(1, num)
				.map(n->n*n)
				.filter(s->(""+s).equals(new StringBuilder(""+s).reverse().toString()))//im meming
				.toArray();
	}

	public static String problem7_maxVowels(String filename) {
		
		
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			Stream<String> words = 	lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream);
			
			return words.max((v, w)->{
				int count1 = 0;
				for(int i = 0; i<v.length(); i++) {
					if("aeiouAEIOU".indexOf(v.charAt(i))!=-1){
						count1++;
					}
				}
				int count2 = 0;
				for(int i = 0; i<w.length(); i++) {
					if("aeiouAEIOU".indexOf(w.charAt(i))!=-1){
						count2++;
					}
				}
				return count1-count2;
			}).orElse("");
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return "";
	}

	public static Map<Integer, Long> problem8_countWordLengths(String filename) {
		Map<Integer, Long> out = new TreeMap<Integer, Long>();
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			
			Stream<String> words = 	lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream);
			for(String word:words.collect(Collectors.toList())) {
				int l = word.length();
				out.putIfAbsent(l, (long) 0);
				out.put(l, out.get(l)+1);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return out;
	}

	public static Map<String, Double> problem9_averageWordLengths(String filename) {
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			
			Stream<String> words = 	lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream);
			return 	words
					.collect(
							Collectors.groupingBy(
									w->w.substring(0, 1).toLowerCase(),
									Collectors.averagingDouble(w->w.length())
							)
							);
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return new TreeMap<String, Double>();
	}

	public static String problem10_findLongestWordContaining(String filename, String word) {
		try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
			Stream<String> words = 	lineStream
									.map(line-> line.split(" "))
									.flatMap(Arrays::stream);
			
			return words.filter(w->w.contains(word))
					.max((v, w)->v.length()-w.length())
					.orElse("");
		} catch (FileNotFoundException e) {
			System.out.println("File: "+filename+" not found");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(problem1_abbreviateWords("./src/labs/lab10/test.txt"));
		System.out.println(problem2_countLinesWithThe("./src/labs/lab10/testThe.txt"));

		System.out.println(problem3_getDistinctShortWords("./src/labs/lab10/testWords.txt"));
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		System.out.println(problem4_streamToString(Stream.of(words), 3));
		// Mary, had, a  System.out.println(problem4_streamToString(Stream.of(words), 2));
		// Mary, had
		System.out.println(problem4_streamToString(Stream.of(words), 50));
		// Mary, had, a, little, lamb
		Integer[] digits = {3, 1, 4, 1, 5, 9};
		System.out.println(problem4_streamToString(Stream.of(digits), 3));
		// 3, 1, 4
		System.out.println(problem4_streamToString(Stream.of(digits), 4));
		// 3, 1, 4, 1
		System.out.println(problem4_streamToString(Stream.of(digits), 0));
		//
		System.out.println(problem4_streamToString(Stream.of(digits), 10));
		// 3, 1, 4, 1, 5, 9
		
		Optional<Integer> result = problem5_smallestProperDivisor(9);
		System.out.println(result.orElse(-1)); // 3
		result = problem5_smallestProperDivisor(17);
		System.out.println(result.orElse(-1)); //-1
		result = problem5_smallestProperDivisor(25);
		System.out.println(result.orElse(-1)); // 5
		result = problem5_smallestProperDivisor(551);
		System.out.println(result.orElse(-1)); // 19
		
		for(int i : problem6_getIntPalindromes(100)) {
			System.out.print(i+",");
		}
		System.out.println();
		for(int i : problem6_getIntPalindromes(100)) {
			System.out.print(i+",");
		}
		System.out.println();
		
		System.out.println(problem7_maxVowels("./src/labs/lab10/testVowels.txt"));
		System.out.println(problem8_countWordLengths("./src/labs/lab10/testWords2.txt"));
		System.out.println(problem10_findLongestWordContaining("./src/labs/lab10/moby.txt", "f"));
	}
}
