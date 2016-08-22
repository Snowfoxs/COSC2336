/**
 * Created by Snowfoxs on 5/4/2016.
 */
class CharCount
{

	public CharCount()
	{

	}

	public int count(char[] characters, char testCharacter)
	{
		return count(characters, testCharacter, characters.length - 1);
	}

	private int count(char[] characters, char testCharacter, int index)
	{
		if (index == -1) // Base Case
		{
			return 0;
		}

		if (characters[index] == testCharacter) // Recursive case
		{
			return 1 + count(characters, testCharacter, index - 1);
		}

		return count(characters, testCharacter, index - 1);
	}

}
