package problemoftheday;


// Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.
// Find out whether they touch(at one or more than one points).
// Example 1:
// Input:
// X1=3
// Y1=4
// R1=5
// X2=14
// Y2=18
// R2=8
// Output: 0

// Explanation:
// The circles centred at (3,4) and (14,18)
// and having radii 5 and 8 respectively
// do not touch each other.
// Example 2:
// Input:
// X1=3
// Y1=4
// R1=5
// X2=14
// Y2=18
// R2=18
// Output: 1

// Explanation:
// The circles centred at (3,4) and (14,18)
// and having radii 5 and 18 respectively
// touch each other at two points.

import java.util.Scanner;

class Circle {
    double x, y, r;

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    double distanceTo(Circle other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }

    boolean touches(Circle other) {
        double distance = distanceTo(other);
        return distance <= r + other.r && distance >= Math.abs(r - other.r);
    }
}

public class CircleTouchCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the parameters for Circle C1 (x y r):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        Circle c1 = new Circle(x1, y1, r1);

        System.out.println("Enter the parameters for Circle C2 (x y r):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        Circle c2 = new Circle(x2, y2, r2);

        scanner.close();

        if (c1.touches(c2)) {
            System.out.println("The circles touch at one or more points.");
        } else {
            System.out.println("The circles do not touch.");
        }
    }
}

