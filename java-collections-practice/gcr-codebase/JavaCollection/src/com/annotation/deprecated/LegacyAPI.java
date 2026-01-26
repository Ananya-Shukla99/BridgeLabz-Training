package com.annotation.deprecated;

public class LegacyAPI {

	@Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature. Use newFeature() instead!");
    }

    public void newFeature() {
        System.out.println("This is the new feature. Preferred over oldFeature().");
    }
}
