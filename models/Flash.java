package org.example.store3D.models;

import java.awt.*;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }
}
