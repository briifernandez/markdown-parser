# This script will compile and run MarkdownParse files
set -e
CLASSPATH=.:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar 
echo Class path is $CLASSPATH
javac -cp $CLASSPATH *.java

# echo $? # Prints out the exit code
<< //
# We can also write an if statement to check if the exit code is not zero
if [ $? -ne 0 ]
then
    echo "Exiting early!"
    exit 1
fi
//

java -cp $CLASSPATH org.junit.runner.JUnitCore MarkdownParseTest