//WRITE A PROGRAM TO SHOW THAT PRIVATE MEMBER OF A SUPERCLASS CAN'T BE ACCESSED FROM DRIVED CLASS

package EXPERIMENT_3;

// Base class 'room' to represent a room with length and breadth
class room {
    private int l, b;

    // Constructor to initialize length and breadth
    room(int x, int y) {
        l = x;
        b = y;
    }

    // Method to calculate and return area
    int area() {
        return (l * b);
    }
}

// Derived class 'class_room' extending 'room' to represent a class room with height
class class_room extends room {
    int h;

    // Constructor to initialize length, breadth, and height
    class_room(int x, int y, int z) {
        super(x, y);
        h = z;
    }

    // Method to calculate and return volume
    int volume() {
        return (area() * h);
    }
}

// Main class
public class superclass_can_not_be_accessed_from_drived_class {
    public static void main(String args[]) {
        // Create an instance of 'class_room'
        class_room cr = new class_room(10, 20, 30);

        // Calculate area and volume
        int aa = cr.area();
        int bb = cr.volume();

        // Print results
        System.out.println("Area of Room : " + aa);
        System.out.println("Volume of Room : " + bb);
    }
}
