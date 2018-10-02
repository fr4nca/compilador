for i in {1..9}; do
	echo teste numero $i
	java -jar dist/Compiler.jar -target parser -debug ../parser/legal-0$i
done


