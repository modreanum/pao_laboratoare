package task3;

public class Main {
    public static void main(String[] args) {

        if(args.length!=1) throw new RuntimeException();
        Git git=new Git();
        git.createDirectory(args[0]+"/.git");
        git.createDirectory(args[0]+"/.git/objects");
        git.createDirectory(args[0]+"/.git/refs");
        git.createFile(args[0]+"/.git/HEAD");
        git.writeToFile(args[0]+"/.git/HEAD","ref: refs/head/main\n");
    }
}
