# Recursion
Java, like most modern languages, supports recursion.

All recursion is, is a method calling itself from inside itself. The classic example of recursion is
the factorial function, like used in this repository:
```
public int factorial(int n) throws ArithmeticException{
        if (n == 1) {
            return n;
        } else if (n < 1) {
            throw new ArithmeticException("Factorial input cannot be less than 1!");
        }
        
        return n * factorial(n-1);
    }
```
The function factorial takes an integer argument **n**, which the program first checks to see if
is equal to 1, in which case **n** is simply returned, or, if **n** is less than 1, an exception is 
thrown for the invoking method to handle (logically, the only way for this last case to occur is for 
the programmer to invoke factorial() with an n less than 1, however). If neither of these conditions 
are found to be true, then the factorial function returns **n** multiplied by the return of factorial(n-1).

Wait, what? While it may seem circular at first, this is perfectly legal, and perhaps a bit elegant, too.
The function factorial() calls itself, using a value of **n** that is numerically one less than the
value of **n** given to it. When we as the programmer call factorial(n), the function must call itself,
which then must call itself, which then... until finally one call to factorial() has an n that is equal
to 1. Then, that most recent call to factorial() returns 1 to its invoking method, which returns 2 x 1
to its invoking method, which returns 3 x 2 x 1 to its invoking method, which returns... until the original
factorial() function call is reached, and the product of n and the return of that most recent factorial() 
call (n-1!) are returned. This is why the condition checks at the beginning of the function are important.

If we didn't have an escape condition for the factorial() function, then factorial() would keep calling itself
until the returns of the factorial() function were numerically larger than the int data-type could hold, and the
program would exit with that error. 

Opportunities to use recursion in every-day programs are rare, but when those opportunities do arise, a recursive
solution rather than an iterative solution (involving for-loops) can simplify and clean up code. Recursion has
important roles in theoretical Computer Science as well, so aside from its practical applications, it's good to become 
familiar with the basic concept of recursion: methods calling themselves from inside themselves.