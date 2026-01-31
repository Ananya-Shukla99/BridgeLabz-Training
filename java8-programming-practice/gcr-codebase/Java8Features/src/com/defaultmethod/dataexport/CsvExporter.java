package com.defaultmethod.dataexport;

public class CsvExporter implements ExportUtils {

    public void export(String data) {
        System.out.println("Exporting data to CSV: " + data);
    }
}