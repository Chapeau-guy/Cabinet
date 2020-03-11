package com.inti.service.interfaces;

import java.util.List;

//interface générique <T>
//contient methode crud et specifique a declarer dans services
public interface IService <T> {
	T save (T obj); 
	void delete (Long id);
	//findAll avec recuperation du nom de la classe de l'objet 
	List<T> findAll (); 
	//findAll avec recuperation du nom de la classe de l'objet et id 
	T findOne (Long id); 

}
