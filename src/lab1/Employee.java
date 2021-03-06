package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

   
 
    public Employee(){
        
    }
    
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()){
            System.out.println("Please enter the first name again: ");
        
        }else{
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
       if (lastName == null || lastName.isEmpty()){
           System.out.println("Please enter the last name again: "); 
        }else{
        this.lastName = lastName;
        }
    }

    public void setSsn(String ssn) {
        if ((ssn == null || ssn.isEmpty()) && (ssn.trim().length() < 9) ){
           System.out.println("Please enter the SSN again: "); 
        }else{
        this.ssn = ssn;
    }
    }
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public void setCubeId(String cubeId) {
       if (cubeId == null || cubeId.isEmpty()){
           System.out.println("Please enter the cube Id again: "); 
        }else{
        this.cubeId = cubeId;
       }
    }

    public void setOrientationDate(Date orientationDate) {
        if (orientationDate== null){
           System.out.println("Please enter the orientation Date again: "); 
        }else{
        this.orientationDate = orientationDate;
        }
    }
    
   
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }



}
