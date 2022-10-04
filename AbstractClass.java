abstract class Shape{
    abstract void area(int i,int j);
}
class rect extends Shape{
    void area(int a,int b){
        int Area=a*b;
        System.out.println("Area of rectangle: "+Area);
    }
}
class AbstractClass{
    public static void main(String[] args) {
        rect r=new rect();
        rect a; //reference of class rect 
        a=r; //refered to class Shape
        a.area(5, 7);
    }
}