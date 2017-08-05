package com.dnsoft.springlessons.lesson2;

public class BaseDao<T> {
	 
    public void save(T entity){
        System.out.println("Save:" + entity);
    }
    
}
