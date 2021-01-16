## Make Change Project

### Description

This is a program that calculates the amount of change returned to a customer
based on the purchase price and the amount tendered.

The change is given in terms of how many pieces of each currency is needed using
the largest denominations possible.

### Topics and Technologies Used

Technologies used in this program:
* Conditionals (if/else)
* Multiple methods
* Casting data types
* Keyboard inputs

### How to Run

Run the application. The user will be prompted for the item price and the amount
tendered. The output will be the change given to the user in the largest
denominations possible.

### Lessons Learned

I struggled with the precision of the double data-type doing simple arithmetic
operations. I wasted time attempting to track down where in the code the
variable lost precision, then attempting to consistently get the correct number
of pennies without using a round function or building my own rounding function.

I tried multiple combinations of casting first versus completing my calculations
before casting, changing the order of the calculations and changing how the
coins variable was calculated. Ultimately, to consistently get the correct
answer, I found it best to use the math rounding function and would've saved
time had I decided to go with that first, rather than experimenting with the
precision of doubles and how to manipulate them.
