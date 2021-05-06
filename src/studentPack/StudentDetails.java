package studentPack;



public class StudentDetails {
	public  enum Gender{
		MALE,FEMALE;
	}
	
	protected String stFirstName,stLastName,stGrade;
	protected int stId,stAge;
	protected Gender stGender;
	

	
	 public String getFName() {
			return stFirstName;
		}
		public void setFName(String stFirstName) {
			this.stFirstName = stFirstName;
		}
		public String getLName() {
			return stLastName;
		}
		public void setLName(String stLastName) {
			this.stLastName = stLastName;
		}
		public String getGrade() {
			return stGrade;
		}
		public void setGrade(String stGrade) {
			this.stGrade = stGrade;
		}
		public int getId() {
			return stId;
		}
		public void setId(int stId) {
			this.stId = stId;
		}
		public int getAge() {
			return stAge;
		}
		public void setAge(int stAge) {
			this.stAge = stAge;
		}
		public Gender getGender() {
			return stGender;
		}
		public void setGender(Gender stGender) {
			this.stGender = stGender;
		}
		
		
	
	
	
}

	
	
	
   	