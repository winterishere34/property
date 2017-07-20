package com.madeofwu.property.bean;

public class Serves {
    private Integer serveId;

    private String serveName;

    private String phone;

    private String serveTime;

    private String room;

    private Integer bId;

    private Integer dId;
    
    private Building building;
    
    private Department department;

    
    public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Serves [serveId=" + serveId + ", serveName=" + serveName
				+ ", phone=" + phone + ", serveTime=" + serveTime + ", room="
				+ room + ", bId=" + bId + ", dId=" + dId + "]";
	}

    public Serves(){
    	super();
    }
	public Serves(Integer serveId, String serveName, String phone,
			String serveTime, String room, Integer bId, Integer dId) {
		super();
		this.serveId = serveId;
		this.serveName = serveName;
		this.phone = phone;
		this.serveTime = serveTime;
		this.room = room;
		this.bId = bId;
		this.dId = dId;
	}


	public Integer getServeId() {
        return serveId;
    }

    public void setServeId(Integer serveId) {
        this.serveId = serveId;
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName == null ? null : serveName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getServeTime() {
        return serveTime;
    }

    public void setServeTime(String serveTime) {
        this.serveTime = serveTime == null ? null : serveTime.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}