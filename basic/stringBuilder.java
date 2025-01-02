public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String name="Ng Zhi Wei";
        String color="violet";
        sb.append("Hello ").append(name).append("!😊").append("My favourite color is ").append(color).append(" Tq!");
        System.out.println(sb.toString());

        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<5;i++){
            sb1.append(i).append("🔢, ");
        }
        System.out.println(sb1.toString());
    }
}
