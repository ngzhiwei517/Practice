public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello World");
        sb.append(" MC Cheung").append("& Lucy");
        sb.insert(5," Java");
        System.out.println(sb);
        sb.replace(6,10,"C++"); //replace from position 6 to 9 [10 is not inclusive]
        System.out.println(sb);
    }
}
