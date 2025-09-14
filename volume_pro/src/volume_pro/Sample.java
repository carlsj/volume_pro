package volume_pro;

public class Sample {
	

	public class UserInfo {
		private String userId;
		private String password;
		private String userName;
		
		private String age;
		
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
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		
		
		@Override
		public String toString() {
			return "UserInfo [userId=" + userId + ", password=" + password + ", userName=" + userName + ", age=" + age
					+ "]";
		}
		
		
		
		
	}


}
