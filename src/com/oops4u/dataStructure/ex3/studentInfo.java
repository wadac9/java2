package com.oops4u.dataStructure.ex3;

public class studentInfo {
    private String dept, userName, userIdx;

    public studentInfo(String dept, String userName, String userIdx) {
        this.dept = dept;
        this.userName = userName;
        this.userIdx = userIdx;
    }

    public void getStudent() {
        System.out.println("# dept : " + dept);
        System.out.println("# userName : " + userName);
        System.out.println("# userIdx : " + userIdx);
    }
}
