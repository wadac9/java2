package com.oops4u.dataStructure.ex3;

public class studentScore extends studentInfo {
    private int kor, eng, math, sum;
    private double avg;
    public studentScore(String dept, String userName, String userIdx,
                 int kor, int eng, int math) {
        super(dept, userName, userIdx);
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getSum() {
        sum = kor + eng + math;
        return sum;
    }

    public double getAvg() {
        avg = sum / 3.0;
        return avg;
    }

    public void getStudent() {
        super.getStudent();
    }

    public void getStudentScore() {
        System.out.println("# kor : " + kor);
        System.out.println("# eng : " + eng);
        System.out.println("# math : " + math);
        System.out.println("# sum : " + getSum());
        System.out.println("# avg : " + getAvg());
    }

}
