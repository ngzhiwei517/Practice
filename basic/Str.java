public class Str {
    private String name;
    private int age;

    public Str(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Name:"+name+" Age:"+age;
    }
}
//to String can use to modify the word that we want to print
class Main{
    public static void main(String[] args) {
        Str person1=new Str("Wei",23);
        Str person2=new Str("Ken",24);
        System.out.println("Person 1 details:\n"+person1);
        System.out.println();
        System.out.println("Person 2 details:\n"+person2);
    }
}
