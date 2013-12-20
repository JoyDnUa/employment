package com.exadel.expertgroup.employment.model;

public enum Level {

	/**
	 * If an employee heard or read about it
	 */
	NONE("NONE"),
	
	/**
	 * If an employee: 
	 * Doesn't have an expert level of theoretical knowledge in that particular skill, 
	 * Has completed at least two major projects with key requirements for that particular skill 
	 * OR 
	 * Has 2 or more years of recent experience in that particular skill
	 */
	NOVICE("NOVICE"), 
	
	/**
	 * If an employee:
	 * Has a low level of theoretical knowledge in that particular skill,
	 * Has completed at least two major projects with key requirements for that particular skill
	 * OR
	 * Has 2 or more years of recent experience in that particular skill
	 */
	INTERMEDIATE("INTERMEDIATE"), 
	
	/**
	 * If an employee: Has an expert level of theoretical knowledge in that particular skill,
	 * Has completed at least two major projects with key requirements for that particular skill
	 * OR
	 * Has an expert level theoretical knowledge in that particular skill,
	 * Has 2 or more years of recent experience in that particular skill
	 * OR
	 * Has completed at least two major projects with key requirements for that particular skill,
	 * Has two or more years of recent experience in that particular skill
	 */
	ADVANCED("ADVANCED"), 
	
	/**
	 * If an employee:
	 * Has an expert level of theoretical knowledge in that particular skill,
	 * Has completed at least two major projects with key requirements for that particular skill,
	 * Has 2 or more years of recent experience in that particular skill
	 */
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
