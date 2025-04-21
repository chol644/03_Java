package ch06.sec11.exam02;

public class Earth {
    static final int earthRadius = 64000;
    static final double surFaceArea;

    static {
        surFaceArea = 4 * Math.PI * earthRadius * earthRadius;
    }
}
