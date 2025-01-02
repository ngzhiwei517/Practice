package T9.Q1;

public class ClassComparision {
    public static void main(String[] args) {
        Student s=new Student();
        Teacher t=new Teacher();
        Teacher t2=new Teacher();
        boolean equal=compare(t,t2);
        System.out.println("Do they belongs to same class:"+equal);
    }

    public static boolean compare(Teacher t,Teacher t2){
        if(t==null || t2==null){
            return false;
        }
        return t.getClass().equals(t2.getClass());
    }
}
class Student{
    private int height;
    private String name;
}

class Teacher{
    private String name;
    private double height;
}
