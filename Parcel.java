class Parcel{

  public int mHeight;
  public int mWidth;
  public int mLength;


  public Parcel(int height, int width, int length){
    mHeight = height;
    mWidth = width;
    mLength = length;
  }

  public Integer getVolume(){
    Integer volume = mHeight * mWidth * mLength;
    System.out.println("Parcel volume is : " + volume);
    return volume;
  }

}
