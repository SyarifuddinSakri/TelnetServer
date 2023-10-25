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
        writeMessage("hello "+putSymbol(Symbol.TEST));
        try {
            String text = readMessage();
            try {
                int intText = Integer.parseInt(text);
                switch(intText) {
                case 0: writeMessage("User Selected 0");break;
                case 1: writeMessage("User Selected 1");break;
                case 2: writeMessage("User Selected 2");break;
                case 3: writeMessage("User Selected 3");break;
                case 4: writeMessage("User Selected 4");break;
                default: System.out.println("Not defined yet");break;
                }
            }catch(NumberFormatException e) {
                System.out.println("input is not an Integer :  "+text);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setTextColor(TextColor.BLUE);
        writeMessage("berjaya");
    }

    @Override
    public void ctrlB() {
        // TODO Auto-generated method stub
        writeMessage("User pressed Ctrl + B !");
        
    }
}
