package model;

public abstract class Person {
	
	String name;
	PersonType personType;
	
	abstract public String getName();
	
	abstract public PersonType getPersonType();
	
}
