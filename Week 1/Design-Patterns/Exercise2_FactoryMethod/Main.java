package exercise2;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Creating Word Document ===");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

        System.out.println("\n=== Creating PDF Document ===");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();

        System.out.println("\n=== Creating Excel Document ===");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
    }
}