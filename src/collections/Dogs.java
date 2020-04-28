package collections;

public class Dogs{
  
  // fields (attributes)
  private String breed;
  private int avgWeight;
  private boolean apartment;

  // constructor
  public Dogs(String breed, int avgWeight, boolean apartment){

    this.breed = breed;
    this.avgWeight = avgWeight;
    this.apartment = apartment;

  }

  // methods (behaviors)
  // getters and setters
  
  // breed
  public String getBreed(){
    return breed;
  }

  public void setBreed(String breed){
    this.breed = breed;
  }

  // weight
  public int getWeight(){
    return avgWeight;
  }

  public void setWeight(int weight){
    this.avgWeight = weight;
  }

  // apartment
  public boolean isApartment(){
    return apartment;
  }

  public void setApartment(boolean apartment){
    this.apartment = apartment;
  }

  // this makes the output human readabel vs getting a mem address by default
  @Override
  public String toString(){
    return "Dogs{" +
            "breed='" + breed + '\''+
            ", avgWeight=" + avgWeight + 
            ", apartment=" + apartment +
            '}';
  }

}