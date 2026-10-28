# Level 2 — Decisions and Loops

Use conditions and repetition to handle more than one case.

## Task 6: Print even numbers

Print every even number from 1 through 100.

- Reference: `src/Loop/EvenNumbers.java`
- [ ] The first value is 2 and the last is 100.
- [ ] No odd values are printed.
- Stretch: ask the user for the upper limit.

## Task 7: Sum until a limit

Keep asking for integers until their running sum is greater than 100, then show the final sum.

- Reference: `src/Loop/SumOfValues.java`
- [ ] Input continues while the sum is 100 or less.
- [ ] The program stops as soon as the sum exceeds 100.
- Stretch: also show how many values were entered.

## Task 8: Find minimum and maximum

Read numbers until the user enters a negative value. Display the smallest and largest accepted values.

- Reference: `src/Loop/NumberCheckWhenExceed100.java`
- [ ] The negative stop value is not included in the results.
- [ ] A sequence containing one value works.
- Stretch: handle a negative first value with a clear message.

## Task 9: Sum the digits

Read an integer and calculate the sum of its digits.

- Reference: `src/Loop/SumOfDigit.java`
- [ ] `108` produces `9`.
- [ ] Negative input produces the same digit sum as its positive form.
- Stretch: repeat until the user chooses to quit.

## Task 10: Reverse text

Print the characters in a string from last to first.

- Reference: `src/Loop/ReverseOfString.java`
- [ ] `ADAMS` produces `S M A D A`.
- [ ] Empty input does not cause an error.
- Stretch: return the reversed string from a method instead of printing inside the loop.

## Task 11: Check a palindrome

Decide whether the entered word reads the same forward and backward.

- Reference: `src/Loop/PalindromeString.java`
- [ ] `ADA` is a palindrome and `JAVA` is not.
- [ ] A one-character word is accepted.
- Stretch: ignore spaces, punctuation, and letter case.

## Task 12: Check for a prime number

Read an integer and report whether it is prime.

- Reference: `src/Loop/PrimeNumbers.java`
- [ ] Values below 2 are not prime.
- [ ] A prime and a composite number are classified correctly.
- Stretch: only test divisors up to the square root of the input.

## Task 13: Find a Fibonacci value

Ask for a one-based position and display that Fibonacci value, using the sequence `1, 1, 2, 3, 5, ...`.

- Reference: `src/Loop/Fibonacci.java`
- [ ] Positions 1 and 2 both produce 1.
- [ ] Position 10 produces 55.
- Stretch: use `long` and explain what happens when the value exceeds its range.

## Task 14: Sum strict divisors

List the positive divisors of a number that are smaller than the number, then display their sum.

- Reference: `src/Loop/StrictDivisors.java`
- [ ] For 32, the divisors are 1, 2, 4, 8, and 16; the sum is 31.
- [ ] Inputs less than or equal to 1 are handled.
- Stretch: report whether the number is perfect.

## Task 15: Print patterns

Use nested loops to print an increasing triangle and a centered pyramid.

- References: `src/Loop/nestedLoop.java`, `src/Loop/Star.java`
- [ ] The number of rows matches the user's input.
- [ ] Each row has the expected number of stars and spaces.
- Stretch: let the user select a pattern and a character.

## Task 16: Add spaces between characters

Print a space between every character in the entered string.

- Reference: `src/Loop/StringWithSPace.java`
- [ ] `some text` is displayed with a space between each character.
- Stretch: preserve existing spaces without adding extra ones around them.

Continue to [Level 3](03-methods-and-arrays.md).
