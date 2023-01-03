Description:

Exception Handling in Java is one of the effective means to handle the runtime errors so that the regular flow of the application can be preserved. 

Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

Exception is an unwanted or unexpected event, which occurs during the execution of a program, i.e. at run time, that disrupts the normal flow of the program’s instructions. Exceptions can be caught and handled by the program. 

When an exception occurs within a method, it creates an object. This object is called the exception object. It contains information about the exception, such as the name and description of the exception and the state of the program when the exception occurred.

\- GeeksforGeeks

The program catches the error that a perticular section of code can throw and this section of code in put inside a try block.

The program here, catches Arithemetic errors, IndexOutofBound error and any other errors that the code will throw.

This is also an example of Nested try blocks.

After the catch block catches the error, the programmer can display any message to the user for understanding the error. These are errors we get while run time and not compile time.

This helps the user to enter the correct input if he/she entered any wrong input.

This is a good practice, rather than giving just the error, we can give an informative Error message.

