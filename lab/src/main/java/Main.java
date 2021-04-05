import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args){
        xmlLexer lexer = new xmlLexer(CharStreams.fromString("document doc = new document('darowdarow');"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        xmlParser parser = new xmlParser(tokenStream);
        ParseTree tree = parser.initialise_var();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new xmlWalker(), tree);
    }
}
