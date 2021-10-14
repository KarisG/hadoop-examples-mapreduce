package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("liste", liste.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("lis_spec", lis_spec.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("trees_count", trees_count.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("size_job", size_job.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("sort_height_job", sort_height_job.class,
                    "A map/reduce program that counts the words in the input files.");
            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
