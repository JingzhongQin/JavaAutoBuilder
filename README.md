# JavaAutoTester #

JavaAutoTester is a tool which can download a given Java project, 
which uses Maven or Gradle, on GitHub and run all tests within the project.

### How do I get set up? ###

You will need to download and set up Java, Maven and Gradle to use this tool.

See links below on how to install all 3 programs:

* [Install Java tutorial](https://www.youtube.com/watch?v=Uz13RXDpvDM)
* [Install Maven tutorial](https://www.youtube.com/watch?v=RfCWg5ay5B0&t)
* [Install Gradle tutorial](https://www.youtube.com/watch?v=C55i2OHKYMc)

Start by downloading the repository on your PC. Press on the project folder and copy
the ```out``` folder to a desired folder (like in the program folder).

Inside the ```out\artifacts\AutoTester_jar``` folder you will find a file named
```JavaAutoTester.bat```, copy paste it to ```out\artifacts\```.

To setup the global envoirment:
* Go to Global Variables
* Press the button Global variables 
* Under ```System variables``` you will find ```Path```, click on it
* Press ```New``` and type the full location to ```out\artifacts```

To see if everything is setup correctly, open your Command Line Interface and type 
```JavaAutoTester [GitHub repository link]```.