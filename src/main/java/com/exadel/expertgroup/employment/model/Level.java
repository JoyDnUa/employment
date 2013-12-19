package com.exadel.expertgroup.employment.model;

public enum Level {

	NONE("NONE"),
	NOVICE("NOVICE"),
	INTERMEDIATE("INTERMEDIATE"),
	ADVANCED("ADVANCED"),
	EXPERT("EXPERT");
	
    public static final Level[] ALL = { NONE, NOVICE, INTERMEDIATE, ADVANCED, EXPERT };
    
    public static final int LENGTH_MAX = 15;
    
    private final String name;

    public static Level forName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null for level");
        }
        if (name.toUpperCase().equals("NONE")) {
            return NONE;
        } else if (name.toUpperCase().equals("NOVICE")) {
            return NOVICE;
        } else if (name.toUpperCase().equals("INTERMEDIATE")) {
            return INTERMEDIATE;
        } else if (name.toUpperCase().equals("ADVANCED")) {
            return ADVANCED;
        } else if (name.toUpperCase().equals("EXPERT")) {
            return EXPERT;
        }
        throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Level");
    }
    
    
    private Level(final String name) {
        this.name = name;
    }
    
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
    
    
	
	
}
