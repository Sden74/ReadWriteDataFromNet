import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        MyData data = getMyData();
        print(data.toString());
    }

    private static void print(String string) {
        System.out.println(string);
    }
    @NotNull
    private static MyData getMyData() {
        return new MyData(1,"1");
    }
}
