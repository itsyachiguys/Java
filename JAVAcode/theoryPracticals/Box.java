package theoryPracticals;

// Demonstrates various Java concepts in a Box class  

// Final class to prevent inheritance  
final class Box {  
    private double width;  
    private double height;  
    private double depth;  

    // Static variable to keep track of the number of Box objects created  
    private static int boxCount = 0;  

    // Default constructor  
    public Box() {  
        this(1, 1, 1); // Using 'this' to call another constructor  
    }  

    // Parameterized constructor  
    public Box(double width, double height, double depth) {  
        this.width = width;  
        this.height = height;  
        this.depth = depth;  
        boxCount++; // Increment box count when a new box is created  
    }  

    // Copy constructor  
    public Box(Box other) {  
        this.width = other.width;  
        this.height = other.height;  
        this.depth = other.depth;  
        boxCount++;  
    }  

    // Static method to get the box count  
    public static int getBoxCount() {  
        return boxCount;  
    }  

    // Final method to prevent overriding  
    public final double volume() {  
        return width * height * depth;  
    }  

    // Method to set dimensions  
    public void setDimensions(double width, double height, double depth) {  
        this.width = width;  
        this.height = height;  
        this.depth = depth;  
    }  

    // Method to compare two Box objects  
    public boolean equals(Object obj) {  
        if (this == obj) return true;  
        if (obj == null || getClass() != obj.getClass()) return false;  
        Box box = (Box) obj;  
        return Double.compare(box.width, width) == 0 &&  
               Double.compare(box.height, height) == 0 &&  
               Double.compare(box.depth, depth) == 0;  
    }  

    // Method to represent the Box object as a string  
    public String toString() {  
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";  
    }  

    // Main method to demonstrate the Box class  
    public static void main(String[] args) {  
        Box box1 = new Box(5, 10, 15);  
        Box box2 = new Box(); // Default constructor  
        Box box3 = new Box(box1); // Copy constructor  

        System.out.println("Volume of box1: " + box1.volume());  
        System.out.println("Volume of box2: " + box2.volume());  
        System.out.println("Volume of box3: " + box3.volume());  
        System.out.println("Total number of boxes: " + Box.getBoxCount());  

        if (box1.equals(box3)) {  
            System.out.println("box1 and box3 are equal");  
        } else {  
            System.out.println("box1 and box3 are not equal");  
        }  

        System.out.println(box1); // toString method  
    }  
}