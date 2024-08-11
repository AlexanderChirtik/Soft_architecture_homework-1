package org.example.store3D.inmemory;

public class Observer1 implements IModelChangeObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer$1");
    }
}
