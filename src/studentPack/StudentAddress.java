package studentPack;

public class  StudentAddress extends StudentDetails  {

		private String stDistrict;
		private String stCity;
		private String stCountry;
		private String stProvince;
		private String stZipCode;
		
		 
public StudentAddress(String stFirstName,String stLastName,String stGrade,int stId,int stAge,Gender stGender,String stDistrict,String stCity,String stCountry,String stProvince,String stZipCode){
		
			this.stFirstName=stFirstName;
			this.stLastName=stLastName;
			this.stGrade=stGrade;
			this.stId=stId;
			this.stAge=stAge;
			this.stGender=stGender;
			this.stDistrict=stDistrict;
			this.stCity=stCity;
			this.stCountry=stCountry;
			this.stProvince=stProvince;
			this.stZipCode=stZipCode;
			
			}


	public String getDistrict() {
		return stDistrict;
	}
	public void setDistrict(String stDistrict) {
		this.stDistrict = stDistrict;
	}
	public String getCity() {
		return stCity;
	}
	
	public void setCity(String stCity) {
		this.stCity = stCity;
	}
	public String getCountry() {
		return stCountry;
	}
	public void setCountry(String stCountry) {
		this.stCountry = stCountry;
	}
	
	public String getProvince() {
		return stProvince;
	}
	public void setProvince(String stProvince) {
		this.stProvince = stProvince;
	}
		
	public String getZipCode() {
		return stZipCode;
	}
	public void setZipCode(String stZipCode) {
		this.stZipCode = stZipCode;
	}
			
		
}


 







