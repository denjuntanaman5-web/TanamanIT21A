
# Lesson 6: Polymorphism and Abstraction

## Part 1: Polymorphism

### Program Description

The PolymorphismDemo.java program demonstrates
how different payment methods can perform the same
operation in different ways.

It uses cash payment and online payment as examples.

### How Polymorphism Works

In my program, I created a parent class named Payment.
It has a method called processPayment().

I created two child classes, CashPayment and
OnlinePayment, which inherit from Payment.

Both child classes override the processPayment()
method. CashPayment displays a message for cash
transactions, while OnlinePayment displays a
message for online banking transactions.

I also used Payment references to call the methods
of the two child objects. Even though they use the
same method name, their results are different.

### Classes and Methods

- Parent Class: Payment
- Child Classes: CashPayment and OnlinePayment
- Overridden Method: processPayment()

## Part 2: Abstraction

### Program Description

The AbstractionDemo.java program demonstrates
abstraction using household appliances.

It uses a washing machine and an electric fan
to show how different appliances perform their
own operations.

### How Abstraction Works

I created an abstract class named Appliance.
It contains an abstract method called operate()
and a regular method called turnOff().

The operate() method does not have a body in the
abstract class. Instead, the child classes provide
their own instructions.

The WashingMachine class implements operate()
by displaying that it is washing clothes. The
ElectricFan class implements the same method
by displaying that it is circulating air.

Both classes also inherit the turnOff() method
from the Appliance class.

### Classes and Methods

- Abstract Class: Appliance
- Child Classes: WashingMachine and ElectricFan
- Abstract Method: operate()
- Concrete Method: turnOff()

## Difference Between Polymorphism and Abstraction

Based on my understanding, polymorphism is useful
when different objects need to perform different
actions using the same method name.

Abstraction is useful when I want to create a
common structure for related classes without
putting every implementation detail in the parent
class.

For example, my payment program uses polymorphism
because cash and online payments have different
ways of processing a transaction.

My appliance program uses abstraction because
each appliance follows a common structure but
has its own way of operating.

## Guide Questions

### 1. Why is method overriding important in polymorphism?
What happens if a child class does not override
the parent's method?

Method overriding is important because it allows
a child class to change the behavior of a method
that it inherits from its parent. This makes it
possible for different objects to respond differently
when the same method is called.

If a child class does not override the method,
it will simply use the parent's original method
instead of having its own behavior.

### 2. Why can't we create an object directly from
an abstract class? What is the purpose of this restriction?

We cannot directly create an object from an abstract
class because it may contain methods that are not
yet complete. These methods need to be implemented
by the child classes.

I think this restriction is useful because it makes
sure that the required behaviors are provided before
we use the actual objects.

### 3. If you need to add another child class to your
polymorphism program, how would your existing code
handle it?

I can add another class, such as CardPayment,
that extends the Payment class. I would override
the processPayment() method and provide instructions
for processing card payments.

The existing parent class does not need to be
rewritten. I can also create another Payment
reference to use the new child object.

### 4. Can polymorphism and abstraction work together
in a single program? Explain how and provide an example.

Yes, they can work together in one program.

For example, I can create an abstract Payment class
with an abstract processPayment() method. CashPayment,
OnlinePayment, and CardPayment can extend that class
and provide their own implementations.

I can then use a Payment reference to call the
method of different payment objects.

Abstraction provides the common structure, while
polymorphism allows the objects to perform the
method differently.

### 5. As a future programmer, when would you use
polymorphism, and when would you use abstraction?

As a future programmer, I would use polymorphism
when I have different objects that need to perform
similar operations but have different behaviors.
For example, different payment methods can use
the same processPayment() method.

I would use abstraction when I want to organize
related classes and provide a common structure
without requiring the parent class to contain
every specific instruction.

I believe both concepts are useful because they
help make my programs easier to organize, update,
and maintain.

## Conclusion

Through this activity, I learned that polymorphism
and abstraction have different purposes but can
also work together.

Polymorphism allows objects to perform different
behaviors through the same method, while abstraction
provides a common structure and hides unnecessary
implementation details.

These concepts will help me create more organized
and flexible Java programs.
