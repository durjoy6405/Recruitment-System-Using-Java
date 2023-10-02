
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends staffhire
{  //attributes
    private int workingHour;
    private double wagesPerhour;
    private String shifts;
    private boolean terminated;
    private boolean joined;

    //constructor
    public PartTimeStaffHire(int vacancy,String designation,String aName,String job, String aDate ,String theQualification,String theHirer,
    int theWorkingHour,double wages,String theShifts,boolean termination,boolean join)
    {
        super( vacancy, designation, aName,job,aDate ,theQualification,theHirer,join);
        workingHour=theWorkingHour;
        wagesPerhour=wages;
        shifts=theShifts;
        terminated= termination;
        joined=join;

    }
    //accessor methods
    public int getWorkingHour()
    {
        return workingHour;
    }

    public void setWorkingHour(int theWorkingHour)
    {
        workingHour= theWorkingHour;
    }

    public void setWagesPerhour(double wages)
    {
        wagesPerhour= wages;
    }

    public double getWagesPerhour()
    {
        return wagesPerhour;
    }

    public void setJoined(boolean join)
    {
        joined = join;
    }

    public boolean getJoined()
    {
        return joined;
    }

    public void setShifts(String theShifts)
    { 
        
        shifts=theShifts;
    }

    public String getShifts()
    {
        return shifts;
    }

    public void setTerminated(boolean termination)
    {
        terminated=termination;
    }

    public boolean getTerminated(){
        
        return terminated;
    }
    public void display()
    {
        System.out.println();
        if(joined==true && terminated==false)
        {
            super.display();
        }
        else
        {
        System.out.println(" Per Time Staff needed");
        System.out.println("Working hour:"+ workingHour);
        System.out.println("Wages per hour:"+ wagesPerhour);
        System.out.println("Shifts:"+ shifts);
        System.out.println("Income per day:" + workingHour *wagesPerhour);
        }
   }
}
