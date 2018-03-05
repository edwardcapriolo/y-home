package ex2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Character;

public class CharMapper {
	/*
	 * 0 -> (A,B,C)
1 -> (D,E,F)
2 -> (G,H,I,J)
3 -> (K,L,M)
4 -> (N,O,P)
5 -> (Q,R,S,T)
6 -> (U,V)
7 -> (W)
8 -> (X,Y)
9 -> (Z)
	 */
	Map<Character,Character> code;
	List<String> dictionary;
	MultiMap<String,String> codeToWord;
	
	public CharMapper() {
		code = new HashMap<Character,Character>();
		code.put('a', '0');
		code.put('b', '0');
		code.put('c', '0');
		code.put('d', '1');
		code.put('e', '1');
		code.put('f', '1');
		code.put('g', '2');
		code.put('h', '2');
		code.put('i', '2');
		code.put('j', '2');
		code.put('k', '3');
		code.put('l', '3');
		code.put('m', '3');
		code.put('n', '4');
		code.put('o', '4');
		code.put('p', '4');
		code.put('q', '5');
		code.put('r', '5');
		code.put('s', '5');
		code.put('t', '5');
		code.put('u', '6');
		code.put('v', '6');
		code.put('w', '7');
		code.put('x', '8');
		code.put('y', '8');
		code.put('z', '9');
		dictionary = Arrays.asList("cat", "dog");
		codeToWord = new MultiMap<String,String>();
		for (String word: dictionary) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < word.length(); i++) {
				sb.append(code.get(word.charAt(i)));
			}
			codeToWord.put(sb.toString(), word);
		}
	}

	Collection<String> findWordsForCode(String code){
		return codeToWord.get(code);
	}
	
} 
