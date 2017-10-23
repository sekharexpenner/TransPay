package com.expenner.TransPay.model;

public class Group {
private String id;
private String name;
private boolean deleted;
private boolean enabled;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the deleted
 */
public boolean getDeleted() {
	return deleted;
}
/**
 * @param deleted the deleted to set
 */
public void setDeleted(boolean deleted) {
	this.deleted = deleted;
}
/**
 * @return the enabled
 */
public boolean getEnabled() {
	return enabled;
}
/**
 * @param enabled the enabled to set
 */
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}


}
