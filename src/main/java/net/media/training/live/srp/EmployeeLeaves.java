package net.media.training.live.srp;

public class EmployeeLeaves {
    private int leavesTaken;
    private int totalLeavesAllowed;
    private int[] leavesLeftPreviously;

    public EmployeeLeaves() {

    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public void setTotalLeavesAllowed(int totalLeavesAllowed) {
        this.totalLeavesAllowed = totalLeavesAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public int getTotalLeavesAllowed() {
        return totalLeavesAllowed;
    }
}