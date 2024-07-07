public class HealthRecord {
    
    public static int MaxH = 0;
    public static int MinH = 0;
    public static final int MinHeight = 10;
    public static final int MaxHeight = 250;
    private int Height = MinHeight;


    public HealthRecord(int Height) {
        setHeight(Height);
    }
    public void setHeight(int Height) {
    if (Height > MinHeight && Height < MaxHeight)
      this.Height = Height;
    else
      this.Height = MaxHeight;
    if (this.Height > MaxH)
      MaxH = this.Height;
      }


    public int getHeight() {
        return Height;
    }
}
