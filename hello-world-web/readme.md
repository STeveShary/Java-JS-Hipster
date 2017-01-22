# Hello World Comparison between JS (ES6) and Java (Spring Boot)

This project is a comparison between the code that is needed to run a simple, but complete web server that handles a "hello world"
request.  There is both a java component and a JS component.  Both contain the needed scripts to build, test, and run the
application.  Both have an integration test that will setup Express and SpringBoot to test that a call can be made
into the application.

#### How to use the applications

The applications require NodeJS of 5.x+ to be installed and Java 8 (JDK) to be installed and available on the path.

Building:

To build and test the application, you can use the command `build.sh` or `build.bat`

Running:

To start the application after it has been built, you can run either `run.sh` or `run.bat`

The JS application will be on port 3000, and the Java application will be on port 8080.