
public enum TokenType {
    // Keywords
    WHILE, BREAK, CONTINUE,

    // Identifiers and numbers
    IDENTIFIER, NUMBER,

    // Symbols
    LPAREN, RPAREN,      // ( )
    LBRACE, RBRACE,      // { }
    SEMICOLON,           // ;

    // Operators
    ASSIGN,              // =
    EQUAL,               // ==
    NOT_EQUAL,           // !=
    LT, GT,              // < >
    LE, GE,              // <= >=
    PLUS, MINUS, STAR, SLASH,

    // Logical
    AND, OR, NOT,

    EOF
}
