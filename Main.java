import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input)
	{
		String lower = input.tolowerCase();
		String output = lower.substring(0,1);
		int vowel_removed = 0;
		int letter_removed = 0;
		int characters = 0; 


		String vowels = "aeiou";

		for(i=1; i<lower.length(); i++)
		{
			String letter = lower.substring(i, i+1);
			String letter_behind = lower.substring(i-1, i);
			boolean isVowel = letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"); 
			if (isVowel && !letter_behind.equals())
			{
				// index of letter in vowels is -1 only if letter is NOT a vowel
				// if (it is a vowel) means indexOf cannot be -1 ( >= 0)
				if (vowels.indexOf(letter) != -1)
				{
					vowel_removed++;
				}
				else if (letter.equals(letter_behind))
				{
					letter_removed++;
				}
				else
				{
					output += letter;
				}

			}
			System.out.println("Algorithm 1");
			System.out.println("Vowels Removed: " + vowels_removed);
			System.out.println("Repeats Removed: " + letter_removed);
			System.out.println("Algorithm 1 message: " + );
			System.out.println("Alogirthm 1 characters saved: " +)
		}


		// TODO: Put solution to Algorithm 1 here
		System.out.println("Implement me!");
	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		// TODO: Put solution to Algorithm 1 here
		System.out.println("Implement me!");
	}
}
