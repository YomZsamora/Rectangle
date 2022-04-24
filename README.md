# Rectangle
Java application that will ask for the length and width of a rectangle. Evaluate the length and width of the Rectangle and informs the user whether or not their rectangle is also a square.

## Prerequisites
- Have Gradle & JDK installed.

### Technologies Used
- openJDK-17
- Gradle 7.4.2
- JUnit Jupiter 5.8.1

### Setup/Installation Requirements
* To run the application, in your terminal:

    1. Open terminal and Clone or download the Repository `https://github.com/YomZsamora/Rectangle.git`
    2. cd into `Rectangle`
    3. Compile `gradle compileJava`
    4. cd into `Rectangle/build/classes/java/main  `
    5.  Run this command `java App` to run the app

## Behavior Driven Development
BDD(Behavior Driven Development) focuses on users providing the length and width of a rectangle. Identifying if it's also a square.

This requires users to input a random number, submit and wait for result.

| Input                     |                       output                        |                                            Purpose |
|:--------------------------|:---------------------------------------------------:|---------------------------------------------------:|
| Enter length of rectangle |     intro message to enter length of rectangle      |                    Save length of Rectangle Object |
| Enter width of rectangle  |     second message to enter width of rectangle      |                     Save width of Rectangle Object |
| No user Input             | Is your rectangle a square, too? `true` or `false`! | Verify if provided length & width creates a square |

### Development

Want to contribute? Great!

To fix a bug or enhance an existing module, follow these steps:

- Fork the repo
- Create a new branch (`git checkout -b improve-feature`)
- Make the appropriate changes in the files
- Add changes to reflect the changes made
- Commit your changes (`git commit -am 'Improve feature'`)
- Push to the branch (`git push origin improve-feature`)
- Create a Pull Request

### License

*MIT*
Copyright (c) 2022 **Yommie Samora**

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.