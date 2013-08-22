package com.rmd.personal.projecteuler;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private List<Problem> problemList;

    private Main() {
        this.problemList = new ArrayList<Problem>();
        this.getProblemList().add(new Problem1());
    }

    private List<Problem> getProblemList() {
        return this.problemList;
    }

    public static void main(String[] args) {
        (new Main()).run();
    }

    private void run() {
        for (Problem problem : this.getProblemList()) {
            System.out.println("Problem: " + this.getProblemList().indexOf(problem));
            System.out.println(problem.getDescription());
            System.out.println(problem.run());
        }
    }
}
