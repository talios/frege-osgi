package com.talios.frege.osgi.calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) {
        System.out.println("Starting the bundle");
        com.talios.frege.osgi.calculator.Calculator.main(new String[] {""});
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the bundle");
    }

}