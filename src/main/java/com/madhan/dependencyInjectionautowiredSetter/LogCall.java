/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.dependencyInjectionautowiredSetter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class LogCall {

LogConcept logconcept;

public LogConcept getLogconcept() {
    return logconcept;
}

@Autowired
public void setLogconcept(LogConcept logconcept) {
    this.logconcept = logconcept;
}

public void logMessage() {
    logconcept.getLog();
}

}
