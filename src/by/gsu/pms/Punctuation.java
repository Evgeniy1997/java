package by.gsu.pms;

public enum Punctuation {
	 EXCLAMATION('!'),
	  DOT('.'),
	  QUESTION('?'),
	  NEWLINE('\n'),
	  CARRET('\r'),
	  INTERROBANG('\u2048'),
	  DISAMBIGUATION('\u2047'),
	  NUMBERSIGN('#'),
	  DOLLAR('$'),
	  PERCENT('%'),
	  AMPERSAND('&'),
	  LBRACKETS('('),
	  RBRACKETS(')'),
	  ASTERISK('*'),
	  PLUS('+'),
	  COMMA(','),
	  COMMA2(','),
	  SPACE(' '),
	  MINUS('-'),
	  SLASH('/'),
	  COLON(':'),
	  SEMICOLON(';'),
	  LESSTHAN('<'),
	  EQUAL('='),
	  GREATERTHAN('>'),
	  LSQUAREBRACKETS('['),
	  RSQUAREBRACKETS(']'),
	  CARET('^'),
	  UNDERSCORE('_'),
	  GRAVIS('`'),
	  LCURLYBRACKETS('{'),
	  VERTICALBAR('|'),
	  RCURLYBRACKETS('}'),
	  TILDE('~'),
	  QUOTATION('"'),
	  BACKSLASH('\\');


	  private char sign;

	  private Punctuation(char sign) {
	      this.sign = sign;
	  }

	  public char getSign() {
	      return this.sign;
	  }
}
