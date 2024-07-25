package net.media.training.live.srp;


public class Employee {
    EmployeeInfo employeeInfo = new EmployeeInfo();
    GetResponseFormat getResponseFormat = new GetResponseFormat();

    public Employee(EmployeeInfo employeeInfo) {
        this.employeeInfo = employeeInfo;
    }

    public String toHtml() {
        return getResponseFormat.toHtml(employeeInfo);
    }
}
