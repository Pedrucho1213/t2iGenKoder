package mx.t2i.ideaGenKoder.model;

/**
 * @author ati
 *
 */
public class ImportArray {

    private String entry;
    /**
     * 
     */
    public ImportArray() {
// TODO Auto-generated constructor stub
    }

    public ImportArray(String entry) {
        super();
        this.entry = entry;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((entry == null) ? 0 : entry.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ImportArray other = (ImportArray) obj;
        if (entry == null) {
            if (other.entry != null) {
                return false;
            }
        } else if (!entry.equals(other.entry)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return entry;// "ImportArray [entry=" + entry + "]";
    }

    public String getEntryFullyCapitalized() {
        String original = entry;
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.toUpperCase();
    }

    public String getEntryCapitalizingFirstLetter() {
        String original = entry;
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }

}
