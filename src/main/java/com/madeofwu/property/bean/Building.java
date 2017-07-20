package com.madeofwu.property.bean;

public class Building {
    private Integer buildingId;

    private String buildingName;

    
    @Override
	public String toString() {
		return "Building [buildingId=" + buildingId + ", buildingName="
				+ buildingName + "]";
	}

    public Building(){
    	super();
    }
	public Building(Integer buildingId, String buildingName) {
		super();
		this.buildingId = buildingId;
		this.buildingName = buildingName;
	}

	public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }
}