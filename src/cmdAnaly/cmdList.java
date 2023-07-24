package src.cmdAnaly;

public class cmdList{
    static Integer COMMAND_NUMBER;
    static String[] COMMAND_LIST = {"quit",
                        "ls",
                        "echo"};
    public cmdList(){
        cmdList.COMMAND_NUMBER = cmdList.COMMAND_LIST.length;
    }
}
