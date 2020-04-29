package collections;

import java.util.*;

public class Main{

  public static void main(String[] args){
    
    // 0 -> First elm
    // 1 -> Second elm
    // fixed index (index's are intergers)
    // fixed element type
    // fixed length
    System.out.println("*** ARRAYS ***");
    
    // Dogs dogArr[];
    // dogArr = new Dogs[5]; // 0 - 4 index's
    Dogs[] dogArr = new Dogs[5];
    dogArr[0] = new Dogs("Springer", 50, false);
    dogArr[4] = new Dogs("Corgie", 35, true);
    dogArr[1] = new Dogs("Bull Dog", 50, true);
    dogArr[2] = new Dogs("Collie", 50, false);
    dogArr[3] = new Dogs("Chihuahua", 5, true);

    for(int i = 0; i < dogArr.length; i++){
      System.out.println(dogArr[i]);
    }

    System.out.println("Breed sub 3 good for an apartment? " + dogArr[3].isApartment());
    System.out.println(dogArr.toString());
    System.out.println(Arrays.toString(dogArr));

    // fixed index
    // fixed element type
    // varied length
    System.out.println("*** ARRAY LIST ***");
    
    // v Java Hiarchey v
    /*
      Object -> Collections -> List -> Array List
                                    -> Linked List
                            -> Map
                            -> Set
    */
    // create a array list
    ArrayList<Dogs> dogsList = new ArrayList<Dogs>();
    // copy an array into the array list
    dogsList.addAll(Arrays.asList(dogArr));
    // add in a new item to the end of the array list
    dogsList.add(new Dogs("Mutt", 15, true));

    // Java forEach
    for(Dogs d: dogsList){
      // System.out.println(d);
      if(d.getWeight() >= 50){
        System.out.println(d.getBreed() + " are large");
      } else {
        System.out.println(d.getBreed() + " are small");
      }
    }

    // Compare StringsMUST use .equals to compare strings since they are objects
    if (dogsList.get(2).getBreed().equals("Turtle")){
      System.out.println("They are equal");
    }
    System.out.println();

    // add new element to a specific index
    dogsList.add(2, new Dogs("Labador", 75, false));
    // Java for each with Lambda Expression
    dogsList.forEach(d -> System.out.println(d));
    System.out.println();

    // replace an elm in the ArrayList
    dogsList.set(2, new Dogs("Poodle", 50, false));
    dogsList.forEach(d -> System.out.println(d));
    System.out.println();

    System.out.println("List size curretnly is: " + dogsList.size());
    System.out.println(dogsList.get(3));
    dogsList.remove(3);
    System.out.println(dogsList.get(3));
    System.out.println();

    // choice in index (can be litteraly anything)
    // fixed element type
    // varried length
    System.out.println("*** HashMaps ***");
    
    // Hashmap<Key Type, Key Value>
    HashMap<Integer, Dogs> dogsHash = new HashMap<Integer, Dogs>();

    int hashCount = 0;
    for (Dogs d: dogsList){

      // PUT: add data if the key does NOT exist
      // if key does exist....update the data, you will not be warned if it does or does not exist.
      dogsHash.put(hashCount, d);
      hashCount++;
    }

    // free up mem from an array list
    dogsList.clear();
    System.out.println(dogsHash.get(3));
    System.out.println(dogsHash.size());
    System.out.println("Removing the data at key of 3...");
    dogsHash.remove(3);
    System.out.println(dogsHash.get(3));

    for (Integer i: dogsHash.keySet()) {
      System.out.println("Key: " + i + " Value: " + dogsHash.get(i));

    }
    System.out.println();

    // Sorting hashMap
    ArrayList<HashMap.Entry<Integer, Dogs>> sortedMap = new ArrayList<HashMap.Entry<Integer, Dogs>>();
    // Get all entries from the hash map
    sortedMap.addAll(dogsHash.entrySet());
    Collections.sort(sortedMap, new Comparator<HashMap.Entry<Integer, Dogs>>()
      
      // method for the comparator
      {
        // the compare fn takes in the types that the comparator is acting on
        public int compare(HashMap.Entry<Integer, Dogs> obj1, HashMap.Entry<Integer, Dogs> obj2) {
          
          // we must return an integer
          // Sorts by breed alphabetically
          return obj1.getValue().getBreed().compareToIgnoreCase(obj2.getValue().getBreed());

        }
      });
    
    for (HashMap.Entry<Integer, Dogs> d: sortedMap) {
      System.out.println("key: " + d.getKey() + " value: " + d.getValue());
    }
    System.out.println();
    System.out.println(sortedMap);
  }
}