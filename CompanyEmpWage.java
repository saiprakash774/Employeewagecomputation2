package day4;

public class CompanyEmpWage {
	
	public final String company;
    public final int emprateprhr;
	public final int numofworkingdays;
	public final int maxhrprmonth;
    public int totalempwage;
	
	public CompanyEmpWage(String company, int emprateprhr,int numofworkingdays,int maxhrprmonth) 
	{
		this.company=company;
		this.emprateprhr=emprateprhr;
		this.numofworkingdays=numofworkingdays;
		this.maxhrprmonth=maxhrprmonth;
		totalempwage=0;
	}
	
	public void setTotalempwage(int totalempwage) 
	{
		this.totalempwage=totalempwage;
	}
	public String toString()
	{
		return "Total Employee wage for Company: " + company + " is:" +totalempwage;
	}

}
