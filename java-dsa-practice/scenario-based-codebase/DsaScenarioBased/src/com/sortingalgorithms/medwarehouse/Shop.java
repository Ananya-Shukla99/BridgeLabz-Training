package com.sortingalgorithms.medwarehouse;

import java.util.*;

public class Shop {

    // attributes
    public String name;
    protected List<Medicine> medicines;

    // constructor
    public Shop(String name, List<Medicine> medicines) {
        this.name = name;
        this.medicines = medicines;
    }

    public Medicine[] getMedicineArray() {
        return medicines.toArray(new Medicine[0]);
    }
}
