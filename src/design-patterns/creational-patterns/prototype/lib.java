package prototype;

import java.util.List;

public class Lib implements ILib {
    public String name;
    public string owner;
    public List<String> usedBy = null;

    public Lib(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public Lib(String name, String owner, List<string> usedBy) {
        this.name = name;
        this.owner = owner;
        this.usedBy = usedBy;
    }

    @Override
    public Object copy() {
        return new SystemLib(this.name, this.owner, this.usedBy);
    }
}