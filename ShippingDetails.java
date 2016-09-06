class ShippingDetails {

  public int mWeight;
  public int mDays;
  public int mDistance;
  public int mDimensions;


  public ShippingDetails(int weight, int days, int distance, int dimensions) {
    mWeight = weight;
    mDays = days;
    mDistance = distance;
  }

  public Integer getCostToShip(){
    Integer inputCost = ((mDistance/10) + (mDimensions/2) + (mWeight/4))/mDays;
    System.out.println("Your shipping cost is : $" + inputCost);
    return inputCost;
  }
}
