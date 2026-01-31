package com.defaultmethod.dataexport;

public class PdfExporter implements ExportUtils {

    public void export(String data) {
        System.out.println("Exporting data to PDF: " + data);
    }
}