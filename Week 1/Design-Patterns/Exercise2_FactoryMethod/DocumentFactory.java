package exercise2;

public abstract class DocumentFactory {

    // Factory method — subclasses decide which Document to create
    public abstract Document createDocument();

    // Common workflow any factory can use
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}