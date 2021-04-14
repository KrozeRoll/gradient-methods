package com.caucasus.optimization.algos.entities.minfinder;

import com.caucasus.optimization.algos.entities.util.GradientSolution;
import com.caucasus.optimization.algos.entities.util.QuadraticFunction;
import com.caucasus.optimization.algos.interfaces.GradientMethod;

public class SteepestDescent implements GradientMethod {
    private final QuadraticFunction function;
    private final Double eps;

    public SteepestDescent(QuadraticFunction function, Double eps) {
        this.function = function;
        this.eps = eps;
    }

    @Override
    public GradientSolution getSolution() {
        return null;
    }
}
