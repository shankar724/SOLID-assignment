package net.media.training.live.srp;

public class EmployeeInfo {
    private static int TOTAL_LEAVES_ALLOWED = 30;
    private int empId;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private String manager;
    private int yearsInOrg;
    private int thisYear;
    private EmployeeLeaves leaves = new EmployeeLeaves();
    private int monthlySalary;

    public EmployeeInfo() {
    }

    public EmployeeInfo(int empId, String name, String addressStreet, String addressCity, String addressCountry,
            String manager, int yearsInOrg, int thisYear, int leavesTaken, int[] leavesLeftPreviously,
            int monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.manager = manager;
        this.yearsInOrg = yearsInOrg;
        this.thisYear = thisYear;
        this.leaves.setLeavesTaken(leavesTaken);
        this.leaves.setLeavesLeftPreviously(leavesLeftPreviously);
        this.monthlySalary = monthlySalary;

    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

    public void setThisYear(int thisYear) {
        this.thisYear = thisYear;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leaves.setLeavesTaken(leavesTaken);
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leaves.setLeavesLeftPreviously(leavesLeftPreviously);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getManager() {
        return manager;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public int getThisYear() {
        return thisYear;
    }

    public int getLeavesTaken() {
        return leaves.getLeavesTaken();
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int[] getLeavesLeftPreviously() {
        return leaves.getLeavesLeftPreviously();
    }

    public int getTotalLeaveAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

}