package com.rmd.personal.projecteuler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Main {

    private List<Problem> problemList;

    private Main() {
        Common.getPrimes();
        this.problemList = new ArrayList<Problem>();
        this.getProblemList().add(new Problem1());
        this.getProblemList().add(new Problem2());
        this.getProblemList().add(new Problem3());
        this.getProblemList().add(new Problem4());
        this.getProblemList().add(new Problem5());
        this.getProblemList().add(new Problem6());
        this.getProblemList().add(new Problem7());
        this.getProblemList().add(new Problem8());
        this.getProblemList().add(new Problem9());
        this.getProblemList().add(new Problem10());
        this.getProblemList().add(new Problem11());
        this.getProblemList().add(new Problem12());
        this.getProblemList().add(new Problem13());
        this.getProblemList().add(new Problem14());
        this.getProblemList().add(new Problem15());
        this.getProblemList().add(new Problem16());
        this.getProblemList().add(new Problem17());
        this.getProblemList().add(new Problem18());
        this.getProblemList().add(new Problem19());
        this.getProblemList().add(new Problem20());
        this.getProblemList().add(new Problem21());
        this.getProblemList().add(new Problem22());
        this.getProblemList().add(new Problem23());
        this.getProblemList().add(new Problem24());
        this.getProblemList().add(new Problem25());
        this.getProblemList().add(new Problem26());

        this.getProblemList().add(new Problem67());
    }

    private List<Problem> getProblemList() {
        return this.problemList;
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

    private void run() {
        final String delimiter = "--------------------------------------------------";
        System.out.println(delimiter);
        System.out.println();

        for (Problem problem : this.getProblemList()) {
            System.out.println("Problem: " + (this.getProblemList().indexOf(problem) + 1));
            System.out.println(problem.getDescription());
            Date startTime = new Date();
            String answer = problem.run();
            Date endTime = new Date();
            System.out.println("Answer: " + answer
                    + " (time taken: " + (endTime.getTime() - startTime.getTime()) + " ms)");
            System.out.println();
            System.out.println(delimiter);
            System.out.println();
        }
    }
}
