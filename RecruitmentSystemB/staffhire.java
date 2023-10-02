
/**
 * Write a description of class staffhire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class staffhire
{
    private int vacancyNumber;
    private String designationType;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

public staffhire (int vacancy,String designation,String aName,String job, String aDate,
String theQualification,String theHirer,boolean join)
{
    vacancyNumber=vacancy;
    designationType= designation;
    staffName= aName;
    jobType=job;
    joiningDate=aDate;
    qualification=theQualification;
    appointedBy=theHirer;
    joined=join;
}
public void setvacancyNumber(int vacancy)
{
    vacancyNumber=vacancy;
}
public int getvacancyNumber()
{
    return vacancyNumber;
}
public String getdesignationType()
{
    return designationType;
}
public void setdesignationType(String designation)
{
    designationType=designation;
}
public void setstaffName(String aName)
{
    staffName = aName;
}
public String getstaffName()
{
    return staffName;

}
public void setjobType(String job)
{
    jobType=job;
}
public String getjobType()
{
    return jobType;
}
public void setjoiningDate(String aDate)
{
    joiningDate=aDate;
}
public String getjoiningDate()
{
    return joiningDate;
}
public String getQualification()
{
    return qualification;
    
}
public void setappointedBy(String theHirer)
{
    appointedBy=theHirer;
}
public String getappointedBy()
{
    return appointedBy;
}
public void setJoined(boolean join)
{
    joined=join;
}
public boolean getJoined()
{
    return joined;
    
}
public void display()
{
    System.out.println();
    if(joined)
    { 
        System.out.println(" This position is vacant");
        System.out.println("Job Type:"+jobType);
        System.out.println("Designation:"+designationType);
        System.out.println("Qualification:"+ qualification);
        
        
    }
    else {
        System.out.println();
    
    System.out.println ("Not Vacant");
    System.out.println("Designation:"+ designationType);
    System.out.println("Staff Name:"+ staffName);
    System.out.println("Job Type:"+ jobType);
    System.out.println("JoiningDate:"+ joiningDate);
    System.out.println("Qualification:"+ qualification);
    System.out.println("AppointedBy:"+ appointedBy);
        }
}
}
