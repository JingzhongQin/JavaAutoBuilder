package com.dt002g;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

//This class is used to identify the type of project: Gradle project or Maven project
public class ProjectIdentifier {
    public final static String GRADLE = "Gradle";
    public final static String GRADLEW = "Gradlew";
    public final static String ANT = "Ant";
    public final static String MAVEN = "Maven";
    public final static String NONE = "NONE";
    final String POM_FILE = "pom.xml";
    final String GRADLEW_FILE = "gradlew";
    final String BUILD_XML_FILE = "build.xml";
    final String GRADLE_BUILD_FILE = "build.gradle";
    final String CLONE_DIRECTORY_PATH = "TempRepository";

    ProjectIdentifier(){}

    //Return the type of project: Maven or Gradle project
    public String getProjectType(){
        Path path = Path.of(CLONE_DIRECTORY_PATH);
        if(Files.isDirectory(path)){

            //Check all files in the root directory
            for(File subDirectory : Objects.requireNonNull(path.toFile().listFiles())){

                //Files
                if(!subDirectory.isDirectory()){

                    //Pom.xml file
                    if(subDirectory.getName().equals(POM_FILE)){
                        return MAVEN;

                    //build.gradle file
                    }else if(subDirectory.getName().equals(GRADLE_BUILD_FILE)){
                        return GRADLE;

                    //gradlew file
                    }else if(subDirectory.getName().equals(GRADLEW_FILE)){
                        return GRADLEW;

                    //build.xml
                    }else if(subDirectory.getName().equals(BUILD_XML_FILE)){
                        return ANT;
                    }
                }
            }
        }

        //The project is not a Maven/Gradle/Ant project
        return NONE;
    }
}
