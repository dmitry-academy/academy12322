package by.academy.lesson11.classwork;

import java.io.Serializable;

import by.academy.lesson7.deal.Product;

public class ThreeGeneric <T extends Comparable, V extends Product & Serializable, K extends Number> {
	
	private T t;
	private V v;
	private K k;
	
	public ThreeGeneric (T t, V v, K k) {
		super();
		this.t = t;
		this.v = v;
		this.k = k;
	}
	
	public T getT () {
		return t;
	}
	
	public void setT (T t) {
		this.t = t;
	}
	
	public V getV () {
		return v;
	}
	
	public void setV (V v) {
		this.v = v;
	}
	
	public K getK () {
		return k;
	}
	
	public void setK (K k) {
		this.k = k;
	}
	
	public void nameClassT () {
		System.out.println(t.getClass());
	}
	
	public void nameClassV () {
		System.out.println(v.getClass());
	}
	
	public void nameClassK () {
		System.out.println(k.getClass());
	}

}
