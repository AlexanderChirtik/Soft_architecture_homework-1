package org.example.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    private static int counter = 1000;
    private int id;
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();

    {
        id = ++counter;
    }

}
