package org.example.store3D.inmemory;

public class Observer2 implements IModelChangeObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - observer$2");
    }
}
