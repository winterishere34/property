package com.madeofwu.property.bean;

public class User {
    private Integer userId;

    private String userName;

    private String gender;

    private String phone;

    private String email;

    private String room;

    private String bId;

    private Building building;
    
    public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", gender=" + gender + ", phone=" + phone + ", email="
				+ email + ", room=" + room + ", bId=" + bId + "]";
	}

    public User(){
    	super();
    }
	public User(Integer userId, String userName, String gender, String phone,
			String email, String room, String bId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.room = room;
		this.bId = bId;
	}

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }
}