package symbole;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List <Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
    public void printyy() {
        System.out.println("Type\t\t\t\t\t\t\t\tValue");
        System.out.println("------------------------------------------------------------------------------");


        for (int i = 0; i < rows.size(); i++) {
            if (rows.get(i) != null) {
                String type = rows.get(i).getType();
                String value = rows.get(i).getValue();

                // Adjust the formatting based on the length of type and value
                String formattedType = String.format("%-20s", type);

                String formattedValue = String.format("%-20s", value);

                System.out.println(formattedType +"\t\t\t"+'|'+"\t\t\t"+ formattedValue);
            }
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
    }
}
