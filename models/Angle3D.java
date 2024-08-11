package org.example.store3D.models;

public class Angle3D {

    private double angleX, angleY, angleZ;

    public Angle3D(double angleX, double angleY, double angleZ) {
        this.angleX = angleX;
        this.angleY = angleY;
        this.angleZ = angleZ;
    }

    public double getAngleX() {
        return angleX;
    }

    public void setAngleX(double angleX) {
        this.angleX = angleX;
    }

    public double getAngleY() {
        return angleY;
    }

    public void setAngleY(double angleY) {
        this.angleY = angleY;
    }

    public double getAngleZ() {
        return angleZ;
    }

    public void setAngleZ(double angleZ) {
        this.angleZ = angleZ;
    }
}
