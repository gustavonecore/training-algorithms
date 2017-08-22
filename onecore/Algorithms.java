package onecore;

public class Algorithms{
    public static void main(String[] args) {
	    System.out.println("Hola Gus");
    }

    /**
     * Method to detect if a given string have unique characters or not
     *
     * Description
     * 1.1 Implement an algorithm to determine if a string has all unique
     * characters. What if you can not use additional data structures?
     *
     * Complexity: O(n)
     *
     * @param string  The string to evaluate
     * @return boolean
     */
    public boolean isUniqueString(String string)
    {
	    boolean unique = true;
	    boolean[] charSet = new boolean[256];
	    int i=0;

	    while(unique && i < string.length())
	    {
		    int val = string.charAt(i);
		    if (charSet[val])
		    {
			    unique = false;
		    }

		    charSet[val] = true;
		    i++;
	    }

	    System.out.println("String: " + string + " is " + (unique ? "unique" : "not unique"));

	    return unique;
    }

    /**
     * Reverse an string
     *
     * Description
     * Write code to reverse a C-Style String. (C-String means that "abcd"
     * is represented as five characters, including the null character.)
     *
     * Complexity: O(n)
     *
     * @param string  The string to evaluate
     * @return String
     */
    public String reverse(String string)
    {
	String reversed = "";

	int i=string.length();

	while (i > 0)
	{
	    reversed += string.substring(i-1, i);
	    i--;
	}

	System.out.println("Reverse In: " + string + ", out: " + reversed);

	return reversed;
    }

    /**
     * Remove duplicated chars
     *
     * Problem
     * Design an algorithm and write code to remove the duplicate characters
     * in a string without using any additional buffer.
     * NOTE: One or two additional variables are fine.
     * An extra copy of the array is not.
     *
     */
    public String removeDuplicated(char[] input)
    {
	int lastPointer = 1;
	int i=0;
	int j=1;

	while (i < input.length)
	{
	    while (j < input.length)
	    {
		if (input[i] == input[j])
		{
		    lastPointer = j;
		    break;
		}

		j++;
	    }

	    if (lastPointer >= 1)
	    {
		input[lastPointer] = 0;
	    }

	    i++;
	}

	System.out.println("Remove duplicated: " + new String(input) + ", out: " + (new String(input)).trim());

	return (new String(input)).trim();
    }
}





