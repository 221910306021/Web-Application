abstract class Shape
{
public abstract void area();
public abstract void perimeter();

 

 public void display(){

 

 }
}

class Traingle extends Shape{
int height,base,x,y;
public void area(){
x = (height*base)/2;
}
public void perimeter(){
y = 3*base;
}
public void display(){
System.out.println("Traingle :\narea = "+ x+" "+"perimeter = "+ y);
}
public  Traingle(int height,int base){
this.height = height;
this.base = base;
}

 

}

 

class Rectangle extends Shape{
int length,breadth,x,y;

 

public void area(){
x = length*breadth;
}
public void perimeter(){
y = 2*(length+breadth);
}
public void display(){

 

System.out.println("Rectangle : \narea = "+ x+" "+"perimeter = "+ y);
}

 

public Rectangle(int length,int breadth){
this.length = length;
this.breadth = breadth;
}
}

 

class AbstractExample{

 

 public static void main(String[] args){

 

 Shape s = new Traingle(10,3);
 s.area();
 s.perimeter();
 s.display();
Shape s1 = new Rectangle(20,30);
s1.area();
s1.perimeter();
System.out.println("______________________");
s1.display();

 

 }

 

}