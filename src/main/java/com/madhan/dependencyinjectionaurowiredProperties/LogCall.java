/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.dependencyinjectionaurowiredProperties;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class LogCall {

@Autowired
private LogConcept logconcept;

public LogCall() {
    System.out.println("Log Called in Aurowired properties ");
}

public LogConcept getLogconcept() {
    return logconcept;
}

public void logMessage() {
    logconcept.getLog();
}
}
