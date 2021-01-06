all:
	@javac -d bin Tarea3.java
	@java -cp bin Tarea3
clean:
	rm bin/*.class
