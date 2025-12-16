package edu.upc.dsa.models.dto;

public class JoinGroupRequest {
    private String groupId;
    private String username;


    public JoinGroupRequest() {}


    public JoinGroupRequest(String groupId, String username) {
        this.groupId = groupId;
        this.username = username;
    }


    public String getGroupId() {
        return groupId;
    }

    public String getUsername() {
        return username;
    }


    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
