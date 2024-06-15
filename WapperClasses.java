package practice;

public class WapperClasses
{
	void autoBoxing()
	{
		System.out.println("-----------Integer Class-------------");
		int i=62345;
		Integer i4=i;
		Integer i3=Integer.valueOf(""+i+"");
		int i1=i;
	//	Integer i2=new Integer(i);
		System.out.println(i3);
		System.out.println(Integer.toString(i));
		System.out.println(Integer.MIN_VALUE+" minimum value of int");
		System.out.println(Integer.MAX_VALUE+" maximum value of int");
		System.out.println(Integer.SIZE+" Bits");
		System.out.println(Integer.BYTES+" Bytes");
		System.out.println(Integer.TYPE+" -type of the data finding");
		System.out.println();
		System.out.println(Integer.bitCount(i)+" bit counting");
		System.out.println(Integer.compare(i, 1)+"  comare two integers");//two integers equal or not checking , equal = 0, not equal=1
		//System.out.println(Integer.compress(i, i)+" 2's compliment");
		System.out.println(Integer.divideUnsigned(i, 2)+" Dividing two values");
		System.out.println(Integer.highestOneBit(i)+" highestOneBit");
		System.out.println(Integer.lowestOneBit(i)+" lowestOneBit ");
		System.out.println(Integer.max(10, 8)+" find max value in two integers");
		System.out.println(Integer.min(10, 8)+" find min value in two integers");
		System.out.println(Integer.numberOfLeadingZeros(i)+" numberOfLeadingZeros");
		System.out.println(Integer.numberOfTrailingZeros(i)+"  numberOfTrailingZeros");
		System.out.println(Integer.parseInt("784664", 17)+" parseInt(String, int) two parameteres");
		//System.out.println(Integer.expand(i, 25)+" expand()");
		System.out.println(Integer.reverse(263)+ " reverse(263)-the value obtained by reversing order of the bits in thespecified int value.");
		System.out.println(Integer.sum(10, 20)+ " sum(10,20) add two numbers");
		System.out.println();
		System.out.println(Integer.toBinaryString(i)+" binary fromate");
		System.out.println(Integer.toHexString(i)+" Hexa Decimal formate");
		System.out.println(Integer.toOctalString(i)+" Octal fromate");
		//System.out.println(Integer.toString(i, 29));

	}
	void meth1()
	{
		System.out.println("------Byte Class-------");
		byte b=20;
		Byte b1=b;
		byte b4=Byte.parseByte("36");
		byte b2=b;
		Byte b3=Byte.valueOf(b);
		System.out.println(b3);
		System.out.println(Byte.BYTES+" Byte");
		System.out.println(Byte.SIZE+" Size");
		System.out.println(Byte.MIN_VALUE+"  min value");
		System.out.println(Byte.MAX_VALUE+"  max value");
		System.out.println(Byte.TYPE+ " -type of value");
		System.out.println(Byte.parseByte("10"));
		System.out.println(Byte.decode("65"));
	}
	void meth2()
	{
		System.out.println("------Short Class-------");
		short s=876;
		Short s1=s;
		short s2=s;
		Short s3=new Short(s);
		short s4=Short.parseShort("123");
		System.out.println(s3);
		System.out.println(Short.BYTES+" bytes of short");
		System.out.println(Short.SIZE+" size of short");
		System.out.println(Short.TYPE+" -type of data");
		System.out.println(Short.MIN_VALUE+" min value of short");
		System.out.println(Short.MAX_VALUE+" max value of ");
		System.out.println(Short.parseShort("8764")+" parseShort()");
	}
	void meth3()
	{
		System.out.println("------Character Class-------");
		char c='A';
		Character c1=c;
		char c2=c;
		char c3=c;
		System.out.println(c);
		System.out.println(Character.BYTES+" Bytes of Character");
		System.out.println(Character.SIZE+" Size of Character");
		System.out.println(Character.MIN_VALUE+" min value of Character('\\u005Cu0000')");
		System.out.println(Character.MAX_VALUE+" max value of Character('\\u005CuFFFF')");
		System.out.println(Character.TYPE+" -Type of Character");
		System.out.println(Character.MIN_CODE_POINT+" min uni code poin");
		System.out.println(Character.MIN_HIGH_SURROGATE+" The minimum value of a Unicode high-surrogate code unitin the UTF-16 encoding, constant '\\u005CuD800'.A high-surrogate is also known as a leading-surrogate");
		System.out.println(Character.MIN_LOW_SURROGATE+ " The minimum value of a Unicode low-surrogate code unitin the UTF-16 encoding, constant '\\u005CuDC00'.A low-surrogate is also known as a trailing-surrogate.");
		System.out.println(Character.MIN_SUPPLEMENTARY_CODE_POINT+" The minimum value of a Unicode supplementary code point, constant U+10000.");
		System.out.println(Character.MIN_SURROGATE+" The minimum value of a Unicode surrogate code unit in theUTF-16 encoding, constant '\\u005CuD800'.");
		System.out.println(Character.MAX_CODE_POINT+" The maximum value of a Unicode code point, constant U+10FFFF");
		System.out.println(Character.MAX_HIGH_SURROGATE+" The maximum value of a Unicode high-surrogate code unitin the UTF-16 encoding, constant '\\u005CuDBFF'.A high-surrogate is also known as a leading-surrogate.");
		System.out.println(Character.MAX_LOW_SURROGATE+" The maximum value of a Unicode low-surrogate code unitin the UTF-16 encoding, constant '\\u005CuDFFF'.A low-surrogate is also known as a trailing-surrogate");
		System.out.println(Character.MAX_RADIX+" max radix of character");
		System.out.println(Character.charCount(c)+" charCount(c)");
		System.out.println(Character.getName(c)+" getName(c)");
		System.out.println(Character.getNumericValue(c)+" getNumericValue(c)");
		System.out.println(Character.getType(c)+" getType(c)");
		System.out.println(Character.highSurrogate(c)+" highSurrogate(c)");
		System.out.println(Character.isAlphabetic(c)+" isAlphabetic(c)");
		System.out.println(Character.isBmpCodePoint(c)+" isBmpCodePoint(c)");
		System.out.println(Character.isDefined(c)+" isDefined(c)");
		System.out.println(Character.isDigit(c)+" isDigit(c)");
		System.out.println(Character.isIdentifierIgnorable(c)+" isIdentifierIgnorable(c)");
		System.out.println(Character.isIdeographic(c)+" isIdeographic(c)");
		System.out.println(Character.isISOControl(c)+" isISOControl(c)");
		System.out.println(Character.isJavaIdentifierPart(c)+" isJavaIdentifierPart(c)");
		System.out.println(Character.isJavaIdentifierStart(c)+" isJavaIdentifierStart(c)");
		System.out.println(Character.isJavaLetter(c)+" isJavaLetter(c)");
		System.out.println(Character.isLetter(c)+" isLetter(c)");
		System.out.println(Character.isLetterOrDigit(c)+" isLetterOrDigit(c)");
		System.out.println(Character.isLowerCase(c)+" isLowerCase(c)");
		System.out.println(Character.isLowSurrogate(c)+" isLowSurrogate(c)");
		System.out.println(Character.isMirrored(c)+" isMirrored(c)");
		System.out.println(Character.isSpace(c)+" isSpace(c)");
		System.out.println(Character.isSpaceChar(c)+" isSpaceChar(c)");
		System.out.println(Character.isSupplementaryCodePoint(c)+" isSupplementaryCodePoint(c)");
		System.out.println(Character.isTitleCase(c)+" isTitleCase(c)");
		System.out.println(Character.isUpperCase(c)+" isUpperCase(c)");
		System.out.println(Character.isValidCodePoint(c)+" isValidCodePoint(c)");
		System.out.println(Character.isWhitespace(c)+" isWhitespace(c)");
		System.out.println(Character.reverseBytes(c)+" reverseBytes(c)");
		System.out.println(Character.toChars(c));
		System.out.println(Character.toLowerCase(c)+" toLowerCase(c)");
		System.out.println(Character.toTitleCase(c)+" toTitleCase(c)");
		System.out.println(Character.toUpperCase(c)+" toUpperCase(c)");
		System.out.println();
		System.out.println(Character.COMBINING_SPACING_MARK+" COMBINING_SPACING_MARK");
		System.out.println(Character.CONNECTOR_PUNCTUATION+" CONNECTOR_PUNCTUATION");
		System.out.println(Character.CONTROL+" CONTROL");
		System.out.println(Character.CURRENCY_SYMBOL+" CURRENCY_SYMBOL");
		System.out.println(Character.DASH_PUNCTUATION+" DASH_PUNCTUATION");
		System.out.println(Character.DECIMAL_DIGIT_NUMBER+" DECIMAL_DIGIT_NUMBER");
		System.out.println(Character.DIRECTIONALITY_ARABIC_NUMBER+" DIRECTIONALITY_ARABIC_NUMBER");
		System.out.println(Character.DIRECTIONALITY_BOUNDARY_NEUTRAL+" DIRECTIONALITY_BOUNDARY_NEUTRAL");
		System.out.println(Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR+" DIRECTIONALITY_COMMON_NUMBER_SEPARATOR");
		System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR+" DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR");
		System.out.println(Character.DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR+" DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR");
		System.out.println(Character.DIRECTIONALITY_FIRST_STRONG_ISOLATE+" DIRECTIONALITY_FIRST_STRONG_ISOLATE");
		System.out.println(Character.FINAL_QUOTE_PUNCTUATION);
		System.out.println(Character.UPPERCASE_LETTER);




	}
	public static void main(String[] args)
	{
		new WapperClasses().meth3();
	}
}
