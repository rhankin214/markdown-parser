# Makefile for MarkdownParse

# Step 1: make MarkdownParse.class
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

# Step 2: make MarkdownParseTest.class
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar MarkdownParseTest.java

# Step 3: run test cases
test: MarkdownParseTest.class
	java -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest