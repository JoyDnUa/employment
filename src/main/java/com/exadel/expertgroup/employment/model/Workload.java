package com.exadel.expertgroup.employment.model;

import java.text.MessageFormat;

public enum Workload {

	NONE(0),
	QUARTER(25),
	HALF(50),
	THREEQUARTER(75),
	FULL(100);
	
	public static final Workload[] ALL={NONE, QUARTER, HALF, THREEQUARTER, FULL};
			
	private final int percent;
	
	private Workload(final int percent) {
		this.percent = percent;
	}
	
	public int getPercent(){
		return this.percent;
	}

    public static Workload forPercent(final int percent) {
        if (percent==0) {
            return NONE;
        } else if (percent==25) {
            return QUARTER;
        } else if (percent==50) {
            return HALF;
        } else if (percent==75) {
            return THREEQUARTER;
        } else if (percent==100) {
            return FULL;
        }
        throw new IllegalArgumentException("Value \"" + percent + "\" does not correspond to any percent");
    }	
    
	@Override
    public String toString() {
        return MessageFormat.format("{0}%", percent);
    }
    
    
	
}
