public class Student {
    String name ;
    String department ;
    int redNo;
    int phNo;

    Student(String n,String d,int r,int p){
        this.name = n;
        this.department=d;
        this.redNo=r;
        this.phNo=p;
    }
    //Override the default print of the statement
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", redNo=" + redNo +
                ", phNo=" + phNo +
                '}';
    }
}
