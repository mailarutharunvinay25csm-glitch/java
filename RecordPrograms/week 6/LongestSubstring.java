import java.util.Scanner;
public class LongestSubstring {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String current = "";
String longest = "";
for (int i = 0; i < str.length(); i++) {
String ch = str.substring(i, i + 1);
int pos = current.indexOf(ch);
if (pos != -1) {
current = current.substring(pos + 1);
}
current = current + ch;
if (current.length() > longest.length()) {
longest = current;
}
}
System.out.println("Longest substring: " + longest);
System.out.println("Length: " + longest.length());
sc.close()
}
}
