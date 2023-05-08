1. First, we import the necessary classes from the java.lang and java.util packages.

2. Then, we define a class called ProcessApiExample.

3. In the main() method, we start by running a simple command using the ProcessBuilder class. We pass a list of command-line arguments to the ProcessBuilder constructor that starts the Windows command prompt (cmd) with the /c flag and the dir command. This will list the files in the current directory.

4. We then read the output of the process and print it to the console.

5. Next, we create another ProcessBuilder object and pass a more complex command as a list of arguments to its command() method. This command uses the echo command to print the string "Hello, world!" to the standard output stream, which is then piped to the wc -c command to count the number of characters in the string.

6. We then start the process using the start() method of the ProcessBuilder class and get its PID (process ID) using the pid() method of the Process class.

7. We use the ProcessHandle class to check if the process is still running and print a message to the console accordingly.

8. Finally, we use the ProcessHandle class to get a list of all running processes on the system and print the number of processes to the console.

This example demonstrates some of the enhancements to the Java Process API introduced in Java 9, such as the ability to get the PID of a running process and to easily get a list of all running processes on the system.