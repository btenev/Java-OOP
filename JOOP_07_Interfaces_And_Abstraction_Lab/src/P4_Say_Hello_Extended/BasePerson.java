package P4_Say_Hello_Extended;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    private void setName(String name) {
        this.name = name;
    }


}
