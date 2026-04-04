// Abstract class Figure
abstract class Figure {
    int x, y; // x = length/base, y = height/width

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area(); // abstract method — no body here
}

// Rectangle: area = length * width
class Rectangle extends Figure {
    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    double area() {
        return x * y;
    }
}

// Triangle: area = (1/2) * base * height
class Triangle extends Figure {
    Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    double area() {
        return 0.5 * x * y;
    }
}

// Square: only one side needed, but Figure requires two params
class Square extends Figure {
    Square(int x) {
        super(x, x); // both sides are equal
    }

    @Override
    double area() {
        return x * x;
    }
}

// Main class — Dynamic Polymorphism in action
class FigureDemo {
    public static void main(String[] args) {

        // Figure reference holds subclass objects — dynamic polymorphism
        Figure[] shapes = new Figure[3];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Triangle(8, 6);
        shapes[2] = new Square(4);

        // At runtime, Java decides WHICH area() to call based on actual object
        for (Figure f : shapes) {
            System.out.println(f.getClass().getSimpleName() + " Area = " + f.area());
        }
    }
}
