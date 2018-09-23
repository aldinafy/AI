/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aldhinafy
 */
public class anealing {
    double x1;
    double x2;
    double nilai;
    double temp;
    
    double random(){
        double x = -10 + 20*Math.random();
        return x;
    }
    double fungsi(double p,double q){
        double r=Math.abs(1-(Math.sqrt(Math.pow(p, 2)+Math.pow(q, 2)))/Math.PI);
        return -Math.abs(Math.sin(p)*Math.cos(q)*Math.exp(r));
    }
    double randomprobability(){
        return Math.random();
    }
}
