import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        DataSource repository = new Repository(
                new CloudDataSource(),
                new CachedDataSource()
        );

        MyData data = repository.getData();
        print(data.toString());

        data = repository.getData();
        print(data.toString());
    }

    private static void print(Object string) {
        System.out.println(string);
    }

}
