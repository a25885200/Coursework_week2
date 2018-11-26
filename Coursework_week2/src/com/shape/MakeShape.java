/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shape;

/**
 *
 * @author leung
 */
public class MakeShape {
    public void makeRactangle(double l, double w, Point p){
        Shape rectangle = new Rectangle(l,w,"Rectangle",p);
        System.out.println(rectangle.toString());
    }
    
    public void makeCircle(double r,Point p){
        Shape circle = new Circle(r,"Circle",p);
        System.out.println(circle.toString());
    }
}
