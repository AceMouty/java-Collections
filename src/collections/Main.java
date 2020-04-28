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
    ArrayList<Dogs> dogsList = new ArrayList<Dogs>();
    dogsList.addAll(Arrays.asList(dogArr));
    dogsList.add(new Dogs("Mutt", 15, true));

    // Java forEach
    for(Dogs d: dogsList){
      System.out.println(d);
    }

    // choice in index (can be litteraly anything)
    // fixed element type
    // varried length
    System.out.println("*** HashMaps ***");

  }
}