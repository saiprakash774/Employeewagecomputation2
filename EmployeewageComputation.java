package day4;

import java.util.*;

public class EmployeewageComputation implements CompanyEmpWageInterface
{
	public static final int IS_FULL_TIME=1,IS_PART_TIME=2;
	private LinkedList<CompanyEmpWage>companyEmpWageList;
	private Map<String,CompanyEmpWage>companyEmpWageMap;
	public EmployeewageComputation() 
	{
		companyEmpWageList=new LinkedList<>();
		companyEmpWageMap=new HashMap<>();
	}
	public void addCompanyEmpWage(String company, int emprateprhr,int numofworkingdays,int maxhrprmonth) 
	{
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,emprateprhr,numofworkingdays,maxhrprmonth);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}
	public int dailywage(int empCheck)
    {
		int emphr=0;
		switch(empCheck)
		{
			case 1:
					emphr=8;//full-time
					return emphr;
			case 2:
					emphr=4; //part-time
					return emphr;        
			default:
					return emphr;
		}
    }
	public void computeEmpwage() 
	{
		for(int index=0;index<companyEmpWageList.size();index++) 
		{
		CompanyEmpWage companyEmpWage=companyEmpWageList.get(index);
		companyEmpWage.setTotalempwage(this.computeEmpwage(companyEmpWage));
		System.out.println(companyEmpWage);
		}
	}
	public int computeEmpwage(CompanyEmpWage companyempwage ) 
	{
		int totalemphrs=0,totalworkingdays=0;
		while( totalemphrs < companyempwage.maxhrprmonth && totalworkingdays <companyempwage.numofworkingdays)
		{
			totalworkingdays++;
			int empCheck= (int)Math.floor(Math.random() *10) % 3;
			totalemphrs+=dailywage(empCheck);
			System.out.println("Day: " + totalworkingdays + "  Emp hr "+ totalemphrs );
		}
		totalemphrs+=totalemphrs;
		return totalemphrs*companyempwage.emprateprhr;
	}
	
	
	public static void main(String[] args)
	{
		CompanyEmpWageInterface employeewagecomputation=new EmployeewageComputation();
		employeewagecomputation.addCompanyEmpWage("Trends",20,20,100);
		employeewagecomputation.addCompanyEmpWage("Twills",20,25,100);
		employeewagecomputation.computeEmpwage();
		System.out.println("Total Wage for Trends Company: " +employeewagecomputation.getTotalWage("Trends"));
	}
	@Override
	public int getTotalWage(String company) {
		return companyEmpWageMap.get(company).totalempwage;
	}
}