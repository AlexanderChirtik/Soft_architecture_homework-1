package org.example.store3D.inmemory;

public interface IModelChanger {

    /**
     * Произошло изменение в хранилище моделей
     */
    void notifyChange();

    /**
     * Регистрирует наблюдателя
     * @param observer
     */
    void registerModelChanger(IModelChangeObserver observer);

    /**
     * Удаляет наблюдателя
     * @param observer
     */
    void removeModelChanger(IModelChangeObserver observer);
}
