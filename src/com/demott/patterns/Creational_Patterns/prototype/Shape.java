package com.demott.patterns.Creational_Patterns.prototype;

/**
 * Prototype Pattern Example.
 * <p>
 * Intent: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 * </p>
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType() {
        return type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
