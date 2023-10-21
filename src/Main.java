import java.io.IOException;

public class Main extends TelnetServer{
    public Main(int port) {
        super(port);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Thread telnetThread = new Thread(new Main(23));
        telnetThread.start();
    }

    @Override
    public void runAbstraction() {
        // TODO Auto-generated method stub
        writeMessage("hello");
        try {
            System.out.println(readMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        writeMessage("berjaya");
    }
}
