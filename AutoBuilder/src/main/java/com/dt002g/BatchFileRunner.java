package com.dt002g;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BatchFileRunner {
    BatchFileRunner(){}
    public void execute(String batchFile){
        Process p = null;

        //Execute the batch file
        try {
            p = Runtime.getRuntime().exec(batchFile);
        } catch (IOException e) {
            System.err.println("Error on exec(" + batchFile + ")");
            e.printStackTrace();
        }

        assert p != null;

        //Get the result
        copyOutput(p.getInputStream(), System.out);
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Get error messages
        copyOutput(p.getErrorStream(), System.out);
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Copy output to System.out
    private void copyOutput(InputStream in, OutputStream out){
        while (true) {
            int c = 0;
            try {
                c = in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (c == -1)
                break;
            try {
                out.write((char) c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
