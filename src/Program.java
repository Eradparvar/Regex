import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		String name, birthday, email, favoriteWebsites;
		ArrayList<String> urls = new ArrayList<String>();

		System.out.println("Enter a your name");
		name = userInput.nextLine();
		System.out.println(nameChecker(name) ? "Valid" : "Invalid");
		System.out.println("Enter a your birthday");
		birthday = userInput.nextLine();
		System.out.println(bDayChecker(birthday) ? "Valid" : "Invalid");
		System.out.println("Enter a your email");
		email = userInput.nextLine();
		System.out.println(emailChecker(email) ? "Valid" : "Invalid");
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter your ten favorite websites " + (i + 1) + " out of 10");
			favoriteWebsites = userInput.nextLine();
			urls.add(favoriteWebsites);
		}

		Pattern pattern = Pattern.compile("https?://www\\.\\w+\\.(com|edu|co.il)/?\\w*");
		urls.stream().filter((s) -> pattern.matcher(s).find()).forEach((s) -> System.out.println(s));

	}

	public static boolean nameChecker(String name) {
		String nameRegex = "(([A-Za-z]{2,}\\s([A-Za-z]\\b\\.\\s)?([A-Za-z]\\b\\.\\s)?)|([A-Za-z]\\b\\.\\s)([A-Za-z]\\b\\.\\s)?)[A-Za-z]{2,}";
		return name.matches(nameRegex);

	}

	public static boolean bDayChecker(String birthday) {
		String bDayRegex = "(0[1-9]|1[0-2])/(0[1-9]|([1-2][0-9]|3[0-1]))/(2\\d\\d\\d|[1-9]\\d)";
		return birthday.matches(bDayRegex);

	}

	public static boolean emailChecker(String email) {
		String emailRegex = "(\\w*)(\\.\\w*)*(@)(\\w*\\.)\\w*(\\.\\w*)*";
		return email.matches(emailRegex);
	}

}
