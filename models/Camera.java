package org.example.store3D.models;

import java.awt.*;

public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }
}
