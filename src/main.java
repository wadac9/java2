import com.oops4u.dataStructure.ex3.*;

class main {
    public static void main(String args[]) {
        System.out.println("# start : main");

        studentInfo si = new studentInfo("dept", "hong", "123");
        System.out.println("# si : " + si);
        si.getStudent();

        studentScore ss = new studentScore("dept", "hong", "123", 90, 80, 60);
        System.out.println("# ss : " + ss);
        ss.getSum();
        ss.getAvg();
        ss.getStudent();
        ss.getStudentScore();

/*
        new tryCatch();
*/

        System.out.println("# end : main");
    }
}
