package com.defaultmethod.dataexport;

public class Main {

	public static void main(String[]args) {
		
        ExportUtils csv = new CsvExporter();
        ExportUtils pdf = new PdfExporter();

        // previous methods
        csv.export("Sales Report");
        pdf.export("Invoice Report");

        //new conversion
        csv.exportToJSON("Sales Report");
        pdf.exportToJSON("Invoice Report");
	}
}
