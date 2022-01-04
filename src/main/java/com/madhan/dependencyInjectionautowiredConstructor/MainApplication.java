/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.dependencyInjectionautowiredConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class MainApplication {

public static void main(String[] args) {
    ApplicationContext ob = new ClassPathXmlApplicationContext("BeansCons.xml");
    LogCall lgCall = (LogCall) ob.getBean("logCall");
    lgCall.logMessage();
}

}
