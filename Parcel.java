class Parcel{

  public int mHeight;
  public int mWidth;
  public int mLength;
  public int mWeight;

  public Parcel(int height, int width, int length, int weight){
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
  }

  public Integer getVolume(){
    Integer volume = mHeight * mWidth * mLength;
    System.out.println(volume);
    return volume;
  }
}
