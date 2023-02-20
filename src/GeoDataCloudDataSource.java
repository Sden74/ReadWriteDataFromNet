import org.jetbrains.annotations.Nullable;

public class GeoDataCloudDataSource implements DataSource<GeoData>{
    @Override
    public @Nullable GeoData getData() {
        return new GeoData(12,52.12,43.98);
    }
}
