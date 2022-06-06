package mx.t2i.ideaGenKoder.model;

/**
 * @author ati
 *
 */
public class FtlAttribute {

    private String javaName;
    private String javaType;
    private String javaInit;

    private String coreName;
    private String coreType;
    private String coreInit;

    /**
     * 
     */
    public FtlAttribute() {
// TODO Auto-generated constructor stub
    }

    public FtlAttribute(String javaName, String javaType, String javaInit) {
        super();
        this.javaName = javaName;
        this.javaType = javaType;
        this.javaInit = javaInit;
        this.coreName = null;
        this.coreType = null;
        this.coreInit = null;
    }

    public FtlAttribute(String javaName, String javaType, String javaInit, String coreName, String coreType,
            String coreInit) {
        super();
        this.javaName = javaName;
        this.javaType = javaType;
        this.javaInit = javaInit;
        this.coreName = coreName;
        this.coreType = coreType;
        this.coreInit = coreInit;
    }

    public String getJavaName() {
        return javaName;
    }

    public void setJavaName(String javaName) {
        this.javaName = javaName;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getJavaInit() {
        return javaInit;
    }

    public void setJavaInit(String javaInit) {
        this.javaInit = javaInit;
    }

    public String getCoreName() {
        return coreName;
    }

    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }

    public String getCoreType() {
        return coreType;
    }

    public void setCoreType(String coreType) {
        this.coreType = coreType;
    }

    public String getCoreInit() {
        return coreInit;
    }

    public void setCoreInit(String coreInit) {
        this.coreInit = coreInit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coreInit == null) ? 0 : coreInit.hashCode());
        result = prime * result + ((coreName == null) ? 0 : coreName.hashCode());
        result = prime * result + ((coreType == null) ? 0 : coreType.hashCode());
        result = prime * result + ((javaInit == null) ? 0 : javaInit.hashCode());
        result = prime * result + ((javaName == null) ? 0 : javaName.hashCode());
        result = prime * result + ((javaType == null) ? 0 : javaType.hashCode());
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
        FtlAttribute other = (FtlAttribute) obj;
        if (coreInit == null) {
            if (other.coreInit != null) {
                return false;
            }
        } else if (!coreInit.equals(other.coreInit)) {
            return false;
        }
        if (coreName == null) {
            if (other.coreName != null) {
                return false;
            }
        } else if (!coreName.equals(other.coreName)) {
            return false;
        }
        if (coreType == null) {
            if (other.coreType != null) {
                return false;
            }
        } else if (!coreType.equals(other.coreType)) {
            return false;
        }
        if (javaInit == null) {
            if (other.javaInit != null) {
                return false;
            }
        } else if (!javaInit.equals(other.javaInit)) {
            return false;
        }
        if (javaName == null) {
            if (other.javaName != null) {
                return false;
            }
        } else if (!javaName.equals(other.javaName)) {
            return false;
        }
        if (javaType == null) {
            if (other.javaType != null) {
                return false;
            }
        } else if (!javaType.equals(other.javaType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FtlAttribute [javaName=" + javaName + ", javaType=" + javaType + ", javaInit=" + javaInit
                + ", coreName=" + coreName + ", coreType=" + coreType + ", coreInit=" + coreInit + "]";
    }

    public String getJavaNameFullyCapitalized() {
        String original = javaName;
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.toUpperCase();
    }

    public String getJavaNameCapitalizingFirstLetter() {
        String original = javaName;
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }

    public String getCoreValueAsString() {
        return convertCoreValueToString(javaName);
    }

    public String convertCoreValueToString(String attributeName) {
        String result = null;
        if (javaType.contentEquals("String")) {
            result = attributeName;
        } 
        else 
        if (javaType.contentEquals("Integer")) {
            result = "UtilTranslateModel.parseValue(String.valueOf(" + attributeName + "), Integer.class)";
        } 
        else 
        if (javaType.contentEquals("Double")) {
            result = "String.valueOf(" + attributeName + ")";
        }
        else 
        if (javaType.contentEquals("Date")) {
            result = "String.valueOf(UtilFechaCore.toCoreValue(" + attributeName + "))";
        }
        else
        {
            result = "WARNING from convertCoreValueToString: javaType "+ javaType + " is unexpected.";
        }
        return result;
    }

    public String getParsedValueFromEntry() {
        String result = null;
        if (javaType.contentEquals("String")) {
            result = "(entry.getValue())";
        } 
        else 
        if (javaType.contentEquals("Integer")) {
            result = "Integer.parseInt(entry.getValue())";
        } 
        else 
        if (javaType.contentEquals("Double")) {
            result = "Double.parseDouble(entry.getValue())";
        }
        else 
        if (javaType.contentEquals("Date")) { // Para los CORE es un entero CAAMMDD, donde si C=1 es > año 2000 y si se omite son < 1999
            result = "UtilFechaCore.fromCoreValue(entry.getValue())";
        }
        else
        {
            result = "WARNING from getParsedValueFromEntry: javaType "+ javaType + " is unexpected.";
        }
        return result;
    }

    public String getCapitalizedCoreName() {
        String result = null;
        String index = extractNumber(javaName); 
        if(index == null || index.isEmpty()) {
            result = javaName;
        }
        else
        {
            int pos = firstDigitPosition(javaName);
            String prefix = javaName.substring(0, pos - 1);
            result = prefix + "[" + index + "]";
        }
        return result.toUpperCase();
    }

    /**
     * extractNumber function
     * @param str
     * @return string with first number out if the input string
     * Examples:
     *     For input "123abc", the method above will return 123.
     *     For "abc1000def", 1000.
     *     For "555abc45", 555.
     *     For "abc", will return an empty string.
     * Reference: https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java/18591205
     */
    public static String extractNumber(final String str) {
        
        if(str == null || str.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                found = true;
            } else if(found){
                // If we already found a digit before and this char is not a digit, stop looping
                break;                
            }
        }
        
        return sb.toString();
    }

    public static int firstDigitPosition(final String str) {
        int r = -1;
        if(str != null && !str.isEmpty()) {
            boolean found = false;
            for(char c : str.toCharArray()){
                r++;
                if(Character.isDigit(c)){
                    found = true;
                } else if(found){
                    // If we already found a digit before and this char is not a digit, stop looping
                    break;                
                }
            }
        }
        return r;
    }
}
