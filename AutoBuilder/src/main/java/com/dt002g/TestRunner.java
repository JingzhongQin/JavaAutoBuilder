package com.dt002g;

import java.io.*;

//Run all test cases within the repository
public class TestRunner {

    final String GRADLE_BUILD_FILE_PATH = "./TempRepository/build.gradle";

    //Batch files that run test cases within a Maven/Gradle project
    final String RUN_MAVEN_TEST_BATCH = "./batchFiles/runMavenTests.bat";
    final String RUN_GRADLE_TEST_BATCH = "./batchFiles/runGradleTests.bat";
    final String RUN_GRADLEW_TEST_BATCH = "./batchFiles/runGradlewTests.bat";
    final String RUN_ANT_BATCH = "./batchFiles/buildAntProject.bat";

    //Add test logging to build.gradle
    final String TEST_LOGGING = "test { testLogging { events \"PASSED\", \"SKIPPED\", \"FAILED\"}}";

    TestRunner() {}

    //Run test cases within the repository
    public void runTests(String projectType){

        //Which batch we should use to run the test cases?
        String batchFileToRun;

        //Gradle project
        if(projectType.equals(ProjectIdentifier.GRADLE)) {
            batchFileToRun = RUN_GRADLE_TEST_BATCH;
            addTestLogging();

        //Maven project
        }else if(projectType.equals(ProjectIdentifier.MAVEN)){
            batchFileToRun = RUN_MAVEN_TEST_BATCH;

        //Maven project(gradlew)
        }else if(projectType.equals(ProjectIdentifier.GRADLEW)){
            batchFileToRun = RUN_GRADLEW_TEST_BATCH;

        //Ant project
        }else if(projectType.equals(ProjectIdentifier.ANT)){
            batchFileToRun = RUN_ANT_BATCH;
        }
        else{
            return;
        }

        //Run the batch file
        BatchFileRunner batchFileRunner = new BatchFileRunner();
        batchFileRunner.execute(batchFileToRun);
    }

    //Append test logging to build.gradle file
    private void addTestLogging(){
        File buildGradleFile = new File(GRADLE_BUILD_FILE_PATH);
        try {
            FileWriter fw = new FileWriter(buildGradleFile, true);
            fw.append(TEST_LOGGING);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
