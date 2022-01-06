import java.util.Random;

public class ArrayBag<T> implements BagInterface<T>
{
	//Default number of elements
	private int maxSize = 10;
	private int currentSize = 0;

	private T[] arr;

	public ArrayBag()
	{
		//Create a new array of objects and cast it to our generic type.
		arr = (T[])new Object[maxSize];
	}

	public ArrayBag(int size)
	{
		maxSize = size;
		//Create a new array of objects and cast it to our generic type.
		arr = (T[])new Object[maxSize];
	}

	@Override
	public int getCurrentSize()
	{
		return currentSize;
	}

	@Override
	public int getMaxSize()
	{
		return maxSize;
	}

	@Override
	public boolean isEmpty()
	{
		return currentSize == 0;
	}

	@Override
	public boolean isFull()
	{
		return currentSize == maxSize;
	}

	@Override
	public void add(T newEntry)
	{
		//If the bag is full, don't add anything and tell the user
		if (isFull())
			System.out.println("ERROR: Max number of items exceeded. The max number of items is: " + maxSize + ". The element you tried to add was: " + newEntry);
		else
			arr[currentSize++] = newEntry;
	}

	@Override
	public T remove()
	{
		Random rand = new Random();

		//Grab the index and removed item
		int index = rand.nextInt(currentSize);
		T removed = arr[index];

		//"remove" the item by replacing it with the last item. Reduce the currentSize by 1
		arr[index] = arr[--currentSize];

		return removed;
	}

	@Override
	public boolean remove(T anEntry)
	{
		//Run through the array
		for (int i = 0; i < currentSize; i++)
			//If we find the item, remove it and return true
			if (arr[i].equals(anEntry))
			{
				arr[i] = arr[--currentSize];
				return true;
			}
		//If we don;t find the item, return false
		return false;
	}

	@Override
	public void clear()
	{
		currentSize = 0;
	}

	@Override
	public int getCountOf(T anEntry)
	{
		int count = 0;

		//Run through the array and count the # of items
		for (int i = 0; i < currentSize; i++)
			if (arr[i].equals(anEntry))
				count++;

		return count;
	}

	@Override
	public boolean contains(T anEntry)
	{
		//Run through the array
		for (T entry: arr)
			//If we find the object, return true
			if (entry.equals(anEntry))
				return true;
		//If we don't, return false
		return false;
	}

	@Override
	public String toString()
	{
		//Begin the string with a [
		String output = "[";

		//Run through the array and all the elements to our array
		for (int i = 0; i < currentSize - 1; i++)
			output += arr[i] + ", ";

		//If we don't have an empty array, add the last element
		if (!isEmpty())
			output += arr[currentSize - 1];

		//Add a closing ]
		output += "]";

		return output;
	}
}
