import java.util.ArrayList;
import java.util.Arrays;

public class EncryptCode {
	public static void main(String[] args) {
		String code = "System.out.println('Hello world');";
		String[] allChars = {"!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(allChars));
		int shift = 93-85;
		String[] split = code.split("");
		for (int i = 0; i < code.length(); i++) {
		    System.out.print(arrList.get(arrList.indexOf(split[i])+shift));
		}
	}
}
