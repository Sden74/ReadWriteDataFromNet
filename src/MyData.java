public class MyData {
    private final int id;
    private final int description;

    public MyData(int id, int description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyData{"+
                "id="+id+
                ", description='"+description+'\''+
                '}';
    }
}
