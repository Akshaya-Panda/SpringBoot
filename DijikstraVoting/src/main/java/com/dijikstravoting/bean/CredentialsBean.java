package com.dijikstravoting.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_credentials")
public class CredentialsBean {

		@Id
	
		private String userId;
		@Column
		private String password;
		@Column
		private String userType;
		@Column
		private int loginStatus;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public int getLoginStatus() {
			return loginStatus;
		}
		public void setLoginStatus(int loginStatus) {
			this.loginStatus = loginStatus;
		}

		
}
