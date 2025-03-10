# Documentation
Description: this is a simple calculator, which greets the user in the beginning with menu, there the user can implement one of the main operations:  

1. Basic arithmetical operations (addition (+), subtraction (-), multiplication (*), division (/), and modulus (%) )  

or 2. Additional functions (a power b, sqrt a, abs a, round a). 

In both options the user should to enter the input properly, with one space between numbers and operations. Scanner will get the input as one String and will split with spaces.  

 

Challenges encountered:  

For to work the second additional functions’ method properly, in every case we have a and b parse separately. 

When we were doing the second project in C++, I was working on matrix calculator, and the calculator should show the menu after every calculation until the user will choose the option exit. Then I couldn’t come up with solution of this task, but now, I thought, actually even the main parathesis are method(function) which you ca call, but because of the real main method has parameters like “String[] args” , it will just call the void method main2. And in the end of every methods and exceptions main2 is called. 

For to save history we need to use ArrayList collection, which will be static and beyond all methods. I had two collections, one for to save the String (input problem of the user) and second for to save the answer (type is Integer) (in the end of every case the result was added to the ArrayList). Type of the results of additional functions are Double, that’s why I’ve created second pair of (problem – result ) collections. 

For to review the history, we have two for loops, each of them have two collections, and equal sign between them. Undefined results were saved as ‘-1’. In the beginning of each loop there’s a text, so we have to exclude case where there’s no history, for that we check if each collection isEmpty(); If both of collections are empty, we have boolean check for to show an appropriate text. 

Maybe it might seem inconvenience to choose an option after every done operation, but there’s an issue, for example you chose in the menu Basic arithmetical operation, and after addition you wanted to perform also substraction, but how will the program know if is it menu’s input or task String for to solve? That’s why I did the way I did. 

Exception handling: There are undefined cases, which can finish the program, that’s why exception like division with zero, modulus with zero, square root of negative numbers are handled with if, the calculator won’t calculate, just show the text “Undefined”. In history exceptions’ answers (undefined) will be save as ‘-1’, because ArrayList history’s type is ‘Integer’ or ‘Double’ and can’t save Strings. In the end of every exception if, method main2 (menu) is called. 

Conclusion: Documentation took quite amount of time, but I’ve really described all the work. The most interesting thing in project is when you think how to implement what do you want with knowledge you’ve got, and if it is impossible to find other ways. In the second semester we learnt Strings and Collections and I’ve used them in this project. 

Actually, according to the description of the project, the calculator should to calculate also long Strings without spaces, but I didn’t know how to implement it. Time was limited, so I did what I can on my own, if it’s an issue and might subtract points, please contact me before grading. 
