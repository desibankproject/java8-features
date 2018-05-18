####https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx

If we only use a method of an object in another method, we still have to pass the full object as an argument. 
Wouldn't it be more practical to just pass the method as an argument? For example:
	
We know that we can use lambda expressions instead of using an anonymous class. 
But sometimes, the lambda expression is really just a call to some method, for example:

Consumer<String> c = s -> System.out.println(s);

To make the code clearer, you can turn that lambda expression into a method reference:

Consumer<String> c = System.out::println;

In a method reference, you place the object (or class) that contains the method before the :: operator and the name of the method after it without arguments.

But you may be thinking:

How is this clearer?
What will happen to the arguments?
How can this be a valid expression?
I don't understand how to construct a valid method reference...

So to use a method reference, you first need a lambda expression with one method. And to use a lambda expression, you first need a functional interface, an interface with just one abstract method.

Instead of using
AN ANONYMOUS CLASS
you can use
A LAMBDA EXPRESSION
And if this just calls one method, you can use
A METHOD REFERENCE

There are four types of method references:

A method reference to a static method.
A method reference to an instance method of an object of a particular type.
A method reference to an instance method of an existing object.
A method reference to a constructor.

