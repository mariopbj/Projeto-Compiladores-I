import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) {

        try {

            CharStream input =
                CharStreams.fromFileName("input/teste.txt");

            MiniLangLexer lexer =
                new MiniLangLexer(input);

            Token token;

            while ((token = lexer.nextToken()).getType() != Token.EOF) {

                String tipo =
                    lexer.getVocabulary()
                         .getSymbolicName(token.getType());

                String atributo = null;

                switch (tipo) {

                    case "OPAD":

                        atributo =
                            token.getText().equals("+")
                            ? "MAIS"
                            : "MENOS";

                        break;

                    case "OPMULT":

                        atributo =
                            token.getText().equals("*")
                            ? "VEZES"
                            : "DIV";

                        break;

                    case "OPREL":

                        switch (token.getText()) {

                            case "<":  atributo = "MENOR"; break;
                            case "<=": atributo = "MENIG"; break;
                            case ">":  atributo = "MAIOR"; break;
                            case ">=": atributo = "MAIG"; break;
                            case "==": atributo = "IGUAL"; break;
                            case "<>": atributo = "DIFER"; break;
                        }

                        break;

                    case "OPLOG":

                        atributo =
                            token.getText().equalsIgnoreCase("OR")
                            ? "OR"
                            : "AND";

                        break;

                    case "OPNEG":

                        atributo = "NEG";
                        break;

                    case "ID":
                    case "CTE":
                    case "CADEIA":

                        atributo = token.getText();
                        break;
                }

                if (atributo != null) {

                    System.out.println(
                        "LEXEMA: " + token.getText()
                        + " | TIPO: " + tipo
                        + " | ATRIBUTO: " + atributo
                    );

                } else {

                    System.out.println(
                        "LEXEMA: " + token.getText()
                        + " | TIPO: " + tipo
                    );
                }
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}