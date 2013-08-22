package com.rmd.personal.projecteuler;

public abstract class AbstractProblemTestBase<TProblem extends Problem> {

    private TProblem problem;

    protected AbstractProblemTestBase(TProblem problem) {
        this.problem = problem;
    }

    protected TProblem getProblem() {
        return this.problem;
    }
}
