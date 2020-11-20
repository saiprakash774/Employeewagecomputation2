package day4;

public interface CompanyEmpWageInterface {
	public void addCompanyEmpWage(String company, int emprateprhr,int numofworkingdays,int maxhrprmonth);
	public void computeEmpwage();
	public int getTotalWage(String company);
}
