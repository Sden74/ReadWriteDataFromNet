import org.jetbrains.annotations.Nullable;

public class CloudDataSource implements DataSource {
    @Override
    public @Nullable MyData getData() {
        return new MyData(1,"description_1");
    }
}
