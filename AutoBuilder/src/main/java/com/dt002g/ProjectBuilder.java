package com.dt002g;

import java.io.IOException;

public class ProjectBuilder {

    //Batch files are used to build Maven/Gradle/Ant projects 
    final String BUILD_MAVEN_PROJECT_BATCH = "./batchFiles/buildMavenProject.bat";
    final String BUILD_GRADLE_PROJECT_BATCH = "./batchFiles/buildGradleProject.bat";
    final String BUILD_GRADLEW_BATCH = "./batchFiles/buildGradlew.bat";
    final String BUILD_ANT_PROJECT_BATCH = "./batchFiles/buildAntProject.bat";
    
    ProjectBuilder(){}

    public void buildProject(String projectType){
        String batchFileToRun = null; 
        
        //Maven project 
        if(projectType.equals(ProjectIdentifier.MAVEN)){
            batchFileToRun = BUILD_MAVEN_PROJECT_BATCH; 
            
        //Gralde project 
        }else if(projectType.equals(ProjectIdentifier.GRADLE)){
            batchFileToRun = BUILD_GRADLE_PROJECT_BATCH; 
            
        //Gradle project(run ./gradlew) 
        }else if(projectType.equals(ProjectIdentifier.GRADLEW)){
            batchFileToRun = BUILD_GRADLEW_BATCH; 
            
        //Ant project 
        }else if(projectType.equals(ProjectIdentifier.ANT)){
            batchFileToRun = BUILD_ANT_PROJECT_BATCH; 
            
        //The project is not a Maven/Gradle/Ant project 
        }else{
            System.out.println("Error, invalid project type. The project should be a Maven/Gradle/Ant project, please build the project manually"); 
        }

        //Run the batch file to build the project
        BatchFileRunner batchFileRunner = new BatchFileRunner();
        batchFileRunner.execute(batchFileToRun);
    }
}
