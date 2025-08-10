class Rectangle
{
    private int length;
    private int breadth;
    
    public Rectangle()
    {
        length=0;
        breadth=0;
    }
    
    public Rectangle(int l, int b)
    {
        length=l;
        breadth=b;
    }
    
    int Area()
    {
        return length*breadth;
    }
}

class MainRectangle
{
    public static void main(String[] args)
    {
        Rectangle rect1=new Rectangle(10,5);
        Rectangle rect2=new Rectangle();
        
        System.out.println("Area"+rect1.Area());
        System.out.println("Area"+rect2.Area());
    }
}