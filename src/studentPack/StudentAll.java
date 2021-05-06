package studentPack;

import java.util.ArrayList;
import java.util.Iterator;

import studentPack.StudentDetails.Gender;

public class StudentAll {

	public static void main(String[] args) {
		
		    StudentAddress s1=new StudentAddress("Joe","Sam","Fourth",12,12,Gender.MALE,"Brampton","Toronto","Canada","On","M1P6T6");
			StudentAddress s2=new StudentAddress("Deep","Sudh","Second",2,10,Gender.FEMALE,"Scarborough","Toronto","Canada","On","M2V5J6");
			StudentAddress s3=new StudentAddress("Merin","John","Third",10,9,Gender.FEMALE,"Manama","Dubai","Arabia","UAE","45678");
			StudentAddress s4=new StudentAddress("David","Jose","Tenth",4,15,Gender.MALE,"Surrey","Columbia","Canada","BC","B3C5D4");
		
			
		ArrayList<StudentAddress> stud = new ArrayList<StudentAddress>();
		      stud.add(new StudentAddress("George","Tom","Seventh",11,13,Gender.MALE,"Chicago","Newyork","US","USA","JH1S3"));
	          stud.add(s1);
	          stud.add(s2);
	          stud.add(s3);
	          stud.add(s4);
	          stud.remove(0);
	          stud.get(1).setCity("Ajax");
	          
	          Iterator<StudentAddress> itr=stud.iterator();
	          while(itr.hasNext()) {
	        	    
	           StudentAddress st=(StudentAddress)itr.next();
	           System.out.println("FirstName: "+st.stFirstName+" LastName: "+st.stLastName+" Grade: "+st.stGrade+" Id: "+st.stId+" Age: "+st.stAge+ " Gender: "+st.stGender+" District: "+st.getDistrict()+" City: "+st.getCity()+" Country: "+st.getCountry()+" Province: "+st.getProvince()+" ZipCode: "+st.getZipCode());
	            
	          if(st.stGender.toString().equalsIgnoreCase("female")){
	        	 // System.out.println("First name: "+st.stFirstName);
	          }
	          if(st.getCity().contains("Toronto")) {
	        	  
	        		//System.out.println("FirstName: "+st.stFirstName+" LastName: "+st.stLastName);  
	        	  }
	        	    
	        		}
	        	 }
	          }
	      

	


