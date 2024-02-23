import java.util.Objects;

public class Candidact implements Comparable<Candidact> {

    private String name;

    public Candidact(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidact candidact = (Candidact) o;
        return Objects.equals(name, candidact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Candidact o) {
        return name.compareTo(o.getName());
    }
}
