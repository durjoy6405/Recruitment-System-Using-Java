
/**
 * Write a description of class fullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fullTimeStaffHire extends staffhire
{   
    private double salary;
    private int weeklyFractionalHours;
    private boolean joined;

    public fullTimeStaffHire(int vacancy,String designation,String aName,String job, String aDate,
    String theQualification,String theHirer,double salary,int workingHours,boolean join)
    {
        super(vacancy,designation,aName,job,aDate,theQualification,theHirer,join);
        this.salary= salary;
        weeklyFractionalHours = workingHours;
        joined=join;
    }


    public void setSalary(double salary)
    {
        this.salary= salary;;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setWeeklyFractionalHours(int workingHours)
    {
        weeklyFractionalHours= workingHours;
    }
    public int getWeeklyFractionalHours()
    {
        return weeklyFractionalHours;
    }

    public void setJoined(boolean join)
    {
        joined= join;
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
            super.display();
        }
        else  
        {
            System.out.println("Position is vacant");
            System.out.println("Full time Staff required");
            System.out.println("Designation:Line manager");
            System.out.println("Job Type:Permanent");
            System.out.println("Salary:" + salary);
            System.out.println("Working Hours:"+ weeklyFractionalHours);
        }

    }

}
