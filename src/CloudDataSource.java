import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CloudDataSource extends DataSource{

    @Override
    public @Nullable MyData getData() {
        return new MyData(1,"description_1");
    }
}
