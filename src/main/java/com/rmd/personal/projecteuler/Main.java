package com.rmd.personal.projecteuler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rmd.personal.projecteuler.nine.P001;
import com.rmd.personal.projecteuler.nine.P002;
import com.rmd.personal.projecteuler.nine.P003;
import com.rmd.personal.projecteuler.nine.P004;
import com.rmd.personal.projecteuler.nine.P005;
import com.rmd.personal.projecteuler.nine.P006;
import com.rmd.personal.projecteuler.nine.P007;
import com.rmd.personal.projecteuler.nine.P008;
import com.rmd.personal.projecteuler.nine.P009;
import com.rmd.personal.projecteuler.nineteen.P010;
import com.rmd.personal.projecteuler.nineteen.P011;
import com.rmd.personal.projecteuler.nineteen.P012;
import com.rmd.personal.projecteuler.nineteen.P013;
import com.rmd.personal.projecteuler.nineteen.P014;
import com.rmd.personal.projecteuler.nineteen.P015;
import com.rmd.personal.projecteuler.nineteen.P016;
import com.rmd.personal.projecteuler.nineteen.P017;
import com.rmd.personal.projecteuler.nineteen.P018;
import com.rmd.personal.projecteuler.nineteen.P019;
import com.rmd.personal.projecteuler.twentynine.P020;
import com.rmd.personal.projecteuler.twentynine.P021;
import com.rmd.personal.projecteuler.twentynine.P022;
import com.rmd.personal.projecteuler.twentynine.P023;
import com.rmd.personal.projecteuler.twentynine.P024;
import com.rmd.personal.projecteuler.twentynine.P025;
import com.rmd.personal.projecteuler.twentynine.P026;
import com.rmd.personal.projecteuler.twentynine.P027;
import com.rmd.personal.projecteuler.twentynine.P028;
import com.rmd.personal.projecteuler.twentynine.P029;

public final class Main {

    private List<Problem> problemList;

    private Main() {
        Common.getPrimes();
        this.problemList = new ArrayList<Problem>();
        this.getProblemList().add(new P001());
        this.getProblemList().add(new P002());
        this.getProblemList().add(new P003());
        this.getProblemList().add(new P004());
        this.getProblemList().add(new P005());
        this.getProblemList().add(new P006());
        this.getProblemList().add(new P007());
        this.getProblemList().add(new P008());
        this.getProblemList().add(new P009());
        this.getProblemList().add(new P010());
        this.getProblemList().add(new P011());
        this.getProblemList().add(new P012());
        this.getProblemList().add(new P013());
        this.getProblemList().add(new P014());
        this.getProblemList().add(new P015());
        this.getProblemList().add(new P016());
        this.getProblemList().add(new P017());
        this.getProblemList().add(new P018());
        this.getProblemList().add(new P019());
        this.getProblemList().add(new P020());
        this.getProblemList().add(new P021());
        this.getProblemList().add(new P022());
        this.getProblemList().add(new P023());
        this.getProblemList().add(new P024());
        this.getProblemList().add(new P025());
        this.getProblemList().add(new P026());
        this.getProblemList().add(new P027());
        this.getProblemList().add(new P028());
        this.getProblemList().add(new P029());
        this.getProblemList().add(new P030());
        this.getProblemList().add(new P031());
        this.getProblemList().add(new P032());
        this.getProblemList().add(new P033());
        this.getProblemList().add(new P034());
        this.getProblemList().add(new P035());
        this.getProblemList().add(new P036());
        this.getProblemList().add(new P037());
        this.getProblemList().add(new P038());
        this.getProblemList().add(new P039());


        this.getProblemList().add(new P067());
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
            System.out.println("Problem: " + problem.getClass().getSimpleName().substring(1));
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
