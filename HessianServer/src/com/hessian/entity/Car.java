package com.hessian.entity;

import java.io.Serializable;

public class Car implements Serializable {

	/** 
    *  
    */
	private static final long serialVersionUID = -1115598660168001267L;

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
