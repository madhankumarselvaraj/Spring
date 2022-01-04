/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.dependencyInjectionautowiredConstructor;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class LogCall {

private LogConcept logconcept;


@Autowired
public LogCall(LogConcept logconcepts) {
    System.out.println("Log Called in Aurowired constructor ");
    this.logconcept = logconcepts;
}

public void logMessage() {  
    logconcept.getLog();
}
}
