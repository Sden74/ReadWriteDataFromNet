import org.jetbrains.annotations.Nullable;

public class Repository extends DataSource{
    private final DataSource cloudDataSource;

    public Repository(DataSource cloudDataSource, DataSource cachedDataSource) {
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    private final DataSource cachedDataSource;

    @Override
    public @Nullable MyData getData() {
        MyData result = cachedDataSource.getData();
        if(result==null){
            result = cloudDataSource.getData();
        }
        return result;
    }
}
