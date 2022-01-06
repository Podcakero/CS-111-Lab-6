public class TestBags{
  
  public static void main(String[] args){
   ArrayBag<String> bag1 = new ArrayBag<String>();
   bag1.add("cheese");
   bag1.add("eggs");
   bag1.add("Milk");
   bag1.add("Balls");
   bag1.add("Cubes");
   bag1.add("UwU");
   bag1.add("UwU");
   bag1.add("MatLab");
   bag1.add("UwU");
   bag1.add("OwO");
   bag1.add("End the world");
   
   System.out.println(bag1.toString());
   System.out.println("removing an item, the item is " + bag1.remove());
   System.out.println(bag1.toString());
   System.out.println("Removing a specific item, the item is Cubes. The removal was successful: " + bag1.remove("Cubes"));
   System.out.println(bag1.toString());
   System.out.println("Bag1 contains \"UwU\": " + bag1.contains("UwU") + ". There are " + bag1.getCountOf("UwU") + " of them.");
   System.out.println("Clearing the bag");
   bag1.clear();
   System.out.println(bag1.toString());
   System.out.println("Adding new elements");
   bag1.add("OwO");
   bag1.add("What's");
   bag1.add("This?");
   System.out.println(bag1.toString());
   
  }
}