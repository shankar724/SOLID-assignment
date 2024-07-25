package net.media.training.live.srp;

public class GetResponseFormat {
    public String toHtml(EmployeeInfo employeeInfo) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employeeInfo.getEmpId() + "'>" +
                "<span>" + employeeInfo.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employeeInfo.getTotalLeaveAllowed() - employeeInfo.getLeavesTaken())
                + "</span>";
        str += "<span>" + Math.round(employeeInfo.getMonthlySalary() * 12) + "</span>";
        if (employeeInfo.getManager() != null)
            str += "<span>" + employeeInfo.getManager() + "</span>";
        else
            str += "<span>None</span>";
        int years = 3;
        if (employeeInfo.getYearsInOrg() < 3) {
            years = employeeInfo.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employeeInfo.getLeavesLeftPreviously()[employeeInfo.getYearsInOrg() - i - 1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
