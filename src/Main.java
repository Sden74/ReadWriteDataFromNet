public class Main {
    public static void main(String[] args) {
        MyData data = getMyData();
        if(data==null){
            print("object was null");
        }else{
            print(data.toString());
        }


    }

    private static void print(String string) {
        System.out.println(string);
    }

    private static MyData getMyData() {
        return null;
    }
}
