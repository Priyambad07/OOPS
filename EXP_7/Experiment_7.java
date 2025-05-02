import java.util.Scanner;
abstract class Solid {
    abstract double calculateVolume();
}

class Cuboid extends Solid {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double calculateVolume() {
        return length * width * height;
    }
}

class Sphere extends Solid {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    double calculateVolume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

public class Experiment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length");
        int l = sc.nextInt();
        System.out.println("Enter the value of width");
        int w = sc.nextInt();
        System.out.println("Enter the value of height");
        int h = sc.nextInt();
        System.out.println("Enter the value of radius");
        int r = sc.nextInt();

        Cuboid cuboid = new Cuboid(l, w, h);
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        Sphere sphere = new Sphere(r);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        sc.close();
    }
}
