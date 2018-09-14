for i in {1..8}; do
	echo teste numero $i
	java -jar dist/Compiler.jar -target parser -debug ../parser/legal-0$i	
done


