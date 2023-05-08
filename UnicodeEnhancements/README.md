In this example, we're working with a string that contains the Unicode code point for a smiley face (\uD83D\uDE00).

We use the codePointAt method to get the code point at index 6 in the string (which corresponds to the first character of the smiley face).

We then use the codePointCount method to get the number of code points in the string (which is 8, since the smiley face requires two code points).

Finally, we use the Character.toChars method to convert the code point back to a character, and print the resulting string.

Note that these are just a few examples of the new Unicode enhancements in Java 9. There are many other methods and features that make it easier to work with Unicode characters and strings in Java 9.
