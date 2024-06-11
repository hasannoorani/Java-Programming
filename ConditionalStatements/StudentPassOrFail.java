public class StudentPassOrFail{
    public static void main(String[] args) {
        //use ternary operator

        int marks1 = 60;
        int marks2= 30;

        String reportCard1 =  (marks1>=33) ? "Pass" : "Fail";
        System.out.println(reportCard1);

        String reportCard2 =  (marks2>=33) ? "Pass" : "Fail";
        System.out.println(reportCard2);
    }
}