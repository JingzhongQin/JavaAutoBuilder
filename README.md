# JavaAutoBuilder #

JavaAutoBuilder is a tool that can download a given Java project on GitHub, 
which uses Maven, Gradle, or Ant to build the project runs all tests within the project(if the project
has, regarding Ant project, JavaAutoBuilder only executes the tasks in the default target).

### How do I get set up? ###

You will need to download and set up Java 17, Maven, Ant, and Gradle to use this tool.

See links below on how to install all 4 programs:

* [Install Java tutorial](https://www.youtube.com/watch?v=Uz13RXDpvDM)
* [Install Maven tutorial](https://www.youtube.com/watch?v=RfCWg5ay5B0&t)
* [Install Gradle tutorial](https://www.youtube.com/watch?v=C55i2OHKYMc)
* [Install Ant tutorial](https://www.youtube.com/watch?v=7z2yXY57jxY)

Start by downloading the repository on your PC. Press on the project folder and copy
the ```out``` folder to the desired folder (like in the program folder).

To set up the global environment:
* Go to Global Variables
* Press the button "Global Variables."
* Under ```System variables``` you will find ```Path```, click on it
* Press ```New``` and type the full location to ```out\artifacts\JavaAutoBuilder_jar```

To see if you have set up everything correctly, open your Command Line Interface and type ```JavaAutoBuilder [GitHub repository link]```.
