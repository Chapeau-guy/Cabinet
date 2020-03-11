package com.inti.service.interfaces;

import java.util.List;

//interface générique <T>
//contient methode crud et specifique a declarer dans services
public interface IService <T> {
	void save (T obj); 
	void update (T obj);
	void remove (T obj);
	//findAll avec recuperation du nom de la classe de l'objet 
	List<T> findAll (Class<?> c); 
	//findAll avec recuperation du nom de la classe de l'objet et id 
	T findOne (Class<?> c, Long id); 

}
