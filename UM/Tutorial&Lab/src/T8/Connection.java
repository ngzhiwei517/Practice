package T8;

public class Connection {
    private static int totalConnection; //belongs to class

    public Connection(){
        totalConnection++;
    }

    public void disconnect(){
        if(totalConnection>0){
            totalConnection--;
            System.out.println("Succesfully disconnected.Current connection:"+totalConnection);
        }else{
            System.out.println("No active connection to disconnect");
        }
    }


    public static void display(){
        System.out.println("Total number of connections to the server:"+totalConnection);
    }


}

class main{
    public static void main(String[] args) {
        Connection c1=new Connection();
        Connection c2=new Connection();

        Connection.display();
        c1.disconnect();
        c2.disconnect();
        Connection c3=new Connection();
        Connection.display();
    }
}

