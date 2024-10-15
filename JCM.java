
public static void main(String[] args) {
 
 
}
 
class Circle { 
 
double radius; 
 
public Circle(double radius) { 
 
//Scanner console = new Scanner(System.in);
 
this.radius = radius; 
 
//radius = console.nextDouble();
 
} 
 
public double area() { 
 
return Math.PI * radius * radius; 
 
} 
 
public double circumference()
 
{ 
return 2 * Math.PI * radius; 
 
} 
 
public double getRadius() { 
 
//Scanner console = new Scanner(System.in);
//radius = console.nextDouble();
return radius; 
} 
 
public String toString() { 
 
return "Circle{radius=" + radius + "}"; 
}
 
