import java.util.List;

public class PrintService<T> {

    private List<T> list;

    public PrintService(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void addValue(T o) {
        list.add(o);
    }

    public void print() {
        if (list.isEmpty()) {
            throw new IllegalStateException("LISTA NAO PODE ESTAR VAZIA........");
        }

        for (T item : list) {
            System.out.println(item);
        }
    }

}
