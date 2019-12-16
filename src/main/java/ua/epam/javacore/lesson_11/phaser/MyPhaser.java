package ua.epam.javacore.lesson_11.phaser;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;
    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }
    // Override onAdvance() to execute the specified
// number of phases.
    protected boolean onAdvance(int p, int regParties) {
// This println() statement is for illustration only.
// Normally, onAdvance() will not display output.
        System.out.println("Phase " + p + " completed.\n");
// If all phases have completed, return true
        if(p == numPhases || regParties == 0) return true;
// Otherwise, return false.
        return false;
    }
}