package com.niharku.designPatterns.Creational.Singleton;

import java.io.Serializable;

public class Singleton implements Serializable{

    private static final long serialVersionUID = 1L;

	private Singleton(){}

    private static class SingletonHelper{
        private static final Singleton s = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.s;
    }
    
    protected Object readResolve() {
    	return getInstance();
    }


}
