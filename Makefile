# Makefile for MarkdownParse
CLASSPATH = libs/*:.
# Step 1: make MarkdownParse.class
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

# Step 2: make MarkdownParseTest.class
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp $(CLASSPATH) MarkdownParseTest.java

TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java

# Step 3: run test cases
test: MarkdownParseTest.class
	java -cp $(CLASSPATH) MarkdownParseTest