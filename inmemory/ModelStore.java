package org.example.store3D.inmemory;

import org.example.store3D.models.Camera;
import org.example.store3D.models.Flash;
import org.example.store3D.models.PoligonalModel;
import org.example.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{

    private List<IModelChangeObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangeObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangeObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeModelChanger(IModelChangeObserver observer) {
        observers.remove(observer);
    }
}
