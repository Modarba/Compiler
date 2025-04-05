import AST.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visit.Visitor;
import java.io.IOException;
import Antlr.AngularParser;
import Antlr.AngularLexer;
public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\Lenovo\\Desktop\\untitled\\src\\Tests\\Test1.txt";
        CharStream cs = CharStreams.fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        // Parsing the program
        ParseTree tree = parser.program();
        Program program = (Program) new Visitor().visit(tree);

        // Output the result
        System.out.println(program);
    }
}
