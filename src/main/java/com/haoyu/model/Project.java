package com.haoyu.model;

public class Project {
	private String projectId;
	private String projcetName;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjcetName() {
		return projcetName;
	}
	public void setProjcetName(String projcetName) {
		this.projcetName = projcetName;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projcetName=" + projcetName + "]";
	}

}
