package AST;

public class ImportStatement {
     ImportFromBlock importFromBlock; // The import block containing the module and items

    public ImportStatement() {
        this.importFromBlock = importFromBlock;
    }

    public ImportFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ImportFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }

    @Override
    public String toString() {
        return  importFromBlock.toString() + "; \n";
    }
}
