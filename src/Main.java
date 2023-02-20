import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        DataSource<MyData> myDataDataSource = new Repository(
                new CloudDataSource(),
                new CachedDataSource<>()
        );
        DataSource<GeoData> geoDataDataSource = new GeoRepository(
                new GeoDataCloudDataSource(),
                new CachedDataSource<>()
        );
        MyData data = myDataDataSource.getData();
        GeoData geoData = geoDataDataSource.getData();
        print(data.toString());
        print(geoData.toString());


    }

    private static void print(Object string) {
        System.out.println(string);
    }

}
