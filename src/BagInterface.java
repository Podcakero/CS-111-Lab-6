/* 
 * This is a variation of the BagInterface from the text:
 * "Data Structures and Abstractions with JAVA"
 * by Frank Carrano and Timothy Henry
 * 
 * This is a generic interface, the class which implements this interface, 
 * must be a generic container for values of any type
 * 
 * "T"  stands for some unknown class type
 */
public interface BagInterface <T >  {
 
/**
 * getCurrentSize():   This method returns the current number of items in the bag
 * 
 */
 public int getCurrentSize();
 
 
 /**
 * getMaxSize():   This method returns the maximum number of items the bag can hold
 * 
 */
 public int getMaxSize();
 
 
 /**
  * isEmpty():  This method returns true if the bag is empty
  * 
  * 
  */
 public boolean isEmpty();
 
  /**
  * isFull():  This method returns true if the currentSize = maxSize
  * 
  * 
  */
 public boolean isFull();
 /**
  * add ( T newEntry):  This method adds a new entry into the Bag
  * 
  */
 public void add(T newEntry);
 
/**
 * 
 * remove():  This removes a random item from the bag, use the library
 * import java.util.Random
 */
 public T remove();
 
 /**
  * 
  * remove (T anEntry):  This method returns true if the bag contains a specific
  * entry, and that entry is successfully removed from the bag. 
  * 
  */
 public boolean remove(T anEntry);
 
 /**
  * 
  * clear():  Empties the Bag
  * 
  */
 public void clear();
 
 /**
  * 
  * getCountOf(T anEntry):  returns the number of times "anEntry" occurs in the Bag
  * 
  */
 public int getCountOf(T anEntry);
 
 /**
  * 
  * contains(T anEntry):  returns true if the Bag contains "anEntry"
  * 
  */
 public boolean contains(T anEntry);
  
 /**
  * 
  * toString():  returns a String containing the contents of the bag
  * 
  */
 public String toString();
}
