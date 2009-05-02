package rmiage.server.data;

import rmiage.framework.data.ISearchable;
import rmiage.framework.data.SearchablesContainer;



public class UserGroup extends SearchablesContainer<User> implements ISearchable{

	protected String name;
	public UserGroup(String name) {
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}

	public boolean contains(String searched) {
		return this.name.toLowerCase().contains(searched);
	}

	public boolean matches(String searched) {
		return this.name.toLowerCase().equals(searched);
	}
}
