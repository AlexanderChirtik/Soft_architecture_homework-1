package org.example.store3D;

import org.example.store3D.inmemory.ModelStore;
import org.example.store3D.inmemory.Observer1;
import org.example.store3D.models.Poligon;
import org.example.store3D.models.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.registerModelChanger(observer1);

        Poligon pl1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(pl1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);
    }
}
