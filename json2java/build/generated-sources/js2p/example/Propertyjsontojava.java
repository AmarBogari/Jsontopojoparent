
package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stringproperty",
    "intproperty",
    "numberproperty",
    "booleanproperty",
    "objectproperty",
    "listproperty",
    "setproperty",
    "requiredproperty",
    "optionalproperty",
    "nullobjectproperty",
    "anyobjectproperty",
    "defaultvalueproperty",
    "excludedFromEqualsAndHashCodeproperty",
    "enumproperty",
    "enumjavaproperty"
})
public class Propertyjsontojava {

    @JsonProperty("stringproperty")
    private String stringproperty;
    @JsonProperty("intproperty")
    private Integer intproperty;
    @JsonProperty("numberproperty")
    private Double numberproperty;
    @JsonProperty("booleanproperty")
    private Boolean booleanproperty;
    @JsonProperty("objectproperty")
    @Valid
    private Objectproperty objectproperty;
    @JsonProperty("listproperty")
    @Valid
    private List<Object> listproperty = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("setproperty")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    private Set<Object> setproperty = new LinkedHashSet<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("requiredproperty")
    private String requiredproperty;
    @JsonProperty("optionalproperty")
    private String optionalproperty;
    @JsonProperty("nullobjectproperty")
    private Object nullobjectproperty;
    @JsonProperty("anyobjectproperty")
    private Object anyobjectproperty;
    @JsonProperty("defaultvalueproperty")
    private String defaultvalueproperty = "defaultvalue";
    @JsonProperty("excludedFromEqualsAndHashCodeproperty")
    private String excludedFromEqualsAndHashCodeproperty;
    @JsonProperty("enumproperty")
    private Propertyjsontojava.Enumproperty enumproperty;
    @JsonProperty("enumjavaproperty")
    private Propertyjsontojava.Enumjavaproperty enumjavaproperty;

    @JsonProperty("stringproperty")
    public String getStringproperty() {
        return stringproperty;
    }

    @JsonProperty("stringproperty")
    public void setStringproperty(String stringproperty) {
        this.stringproperty = stringproperty;
    }

    @JsonProperty("intproperty")
    public Integer getIntproperty() {
        return intproperty;
    }

    @JsonProperty("intproperty")
    public void setIntproperty(Integer intproperty) {
        this.intproperty = intproperty;
    }

    @JsonProperty("numberproperty")
    public Double getNumberproperty() {
        return numberproperty;
    }

    @JsonProperty("numberproperty")
    public void setNumberproperty(Double numberproperty) {
        this.numberproperty = numberproperty;
    }

    @JsonProperty("booleanproperty")
    public Boolean getBooleanproperty() {
        return booleanproperty;
    }

    @JsonProperty("booleanproperty")
    public void setBooleanproperty(Boolean booleanproperty) {
        this.booleanproperty = booleanproperty;
    }

    @JsonProperty("objectproperty")
    public Objectproperty getObjectproperty() {
        return objectproperty;
    }

    @JsonProperty("objectproperty")
    public void setObjectproperty(Objectproperty objectproperty) {
        this.objectproperty = objectproperty;
    }

    @JsonProperty("listproperty")
    public List<Object> getListproperty() {
        return listproperty;
    }

    @JsonProperty("listproperty")
    public void setListproperty(List<Object> listproperty) {
        this.listproperty = listproperty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setproperty")
    public Set<Object> getSetproperty() {
        return setproperty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("setproperty")
    public void setSetproperty(Set<Object> setproperty) {
        this.setproperty = setproperty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requiredproperty")
    public String getRequiredproperty() {
        return requiredproperty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("requiredproperty")
    public void setRequiredproperty(String requiredproperty) {
        this.requiredproperty = requiredproperty;
    }

    @JsonProperty("optionalproperty")
    public String getOptionalproperty() {
        return optionalproperty;
    }

    @JsonProperty("optionalproperty")
    public void setOptionalproperty(String optionalproperty) {
        this.optionalproperty = optionalproperty;
    }

    @JsonProperty("nullobjectproperty")
    public Object getNullobjectproperty() {
        return nullobjectproperty;
    }

    @JsonProperty("nullobjectproperty")
    public void setNullobjectproperty(Object nullobjectproperty) {
        this.nullobjectproperty = nullobjectproperty;
    }

    @JsonProperty("anyobjectproperty")
    public Object getAnyobjectproperty() {
        return anyobjectproperty;
    }

    @JsonProperty("anyobjectproperty")
    public void setAnyobjectproperty(Object anyobjectproperty) {
        this.anyobjectproperty = anyobjectproperty;
    }

    @JsonProperty("defaultvalueproperty")
    public String getDefaultvalueproperty() {
        return defaultvalueproperty;
    }

    @JsonProperty("defaultvalueproperty")
    public void setDefaultvalueproperty(String defaultvalueproperty) {
        this.defaultvalueproperty = defaultvalueproperty;
    }

    @JsonProperty("excludedFromEqualsAndHashCodeproperty")
    public String getExcludedFromEqualsAndHashCodeproperty() {
        return excludedFromEqualsAndHashCodeproperty;
    }

    @JsonProperty("excludedFromEqualsAndHashCodeproperty")
    public void setExcludedFromEqualsAndHashCodeproperty(String excludedFromEqualsAndHashCodeproperty) {
        this.excludedFromEqualsAndHashCodeproperty = excludedFromEqualsAndHashCodeproperty;
    }

    @JsonProperty("enumproperty")
    public Propertyjsontojava.Enumproperty getEnumproperty() {
        return enumproperty;
    }

    @JsonProperty("enumproperty")
    public void setEnumproperty(Propertyjsontojava.Enumproperty enumproperty) {
        this.enumproperty = enumproperty;
    }

    @JsonProperty("enumjavaproperty")
    public Propertyjsontojava.Enumjavaproperty getEnumjavaproperty() {
        return enumjavaproperty;
    }

    @JsonProperty("enumjavaproperty")
    public void setEnumjavaproperty(Propertyjsontojava.Enumjavaproperty enumjavaproperty) {
        this.enumjavaproperty = enumjavaproperty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Propertyjsontojava.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stringproperty");
        sb.append('=');
        sb.append(((this.stringproperty == null)?"<null>":this.stringproperty));
        sb.append(',');
        sb.append("intproperty");
        sb.append('=');
        sb.append(((this.intproperty == null)?"<null>":this.intproperty));
        sb.append(',');
        sb.append("numberproperty");
        sb.append('=');
        sb.append(((this.numberproperty == null)?"<null>":this.numberproperty));
        sb.append(',');
        sb.append("booleanproperty");
        sb.append('=');
        sb.append(((this.booleanproperty == null)?"<null>":this.booleanproperty));
        sb.append(',');
        sb.append("objectproperty");
        sb.append('=');
        sb.append(((this.objectproperty == null)?"<null>":this.objectproperty));
        sb.append(',');
        sb.append("listproperty");
        sb.append('=');
        sb.append(((this.listproperty == null)?"<null>":this.listproperty));
        sb.append(',');
        sb.append("setproperty");
        sb.append('=');
        sb.append(((this.setproperty == null)?"<null>":this.setproperty));
        sb.append(',');
        sb.append("requiredproperty");
        sb.append('=');
        sb.append(((this.requiredproperty == null)?"<null>":this.requiredproperty));
        sb.append(',');
        sb.append("optionalproperty");
        sb.append('=');
        sb.append(((this.optionalproperty == null)?"<null>":this.optionalproperty));
        sb.append(',');
        sb.append("nullobjectproperty");
        sb.append('=');
        sb.append(((this.nullobjectproperty == null)?"<null>":this.nullobjectproperty));
        sb.append(',');
        sb.append("anyobjectproperty");
        sb.append('=');
        sb.append(((this.anyobjectproperty == null)?"<null>":this.anyobjectproperty));
        sb.append(',');
        sb.append("defaultvalueproperty");
        sb.append('=');
        sb.append(((this.defaultvalueproperty == null)?"<null>":this.defaultvalueproperty));
        sb.append(',');
        sb.append("excludedFromEqualsAndHashCodeproperty");
        sb.append('=');
        sb.append(((this.excludedFromEqualsAndHashCodeproperty == null)?"<null>":this.excludedFromEqualsAndHashCodeproperty));
        sb.append(',');
        sb.append("enumproperty");
        sb.append('=');
        sb.append(((this.enumproperty == null)?"<null>":this.enumproperty));
        sb.append(',');
        sb.append("enumjavaproperty");
        sb.append('=');
        sb.append(((this.enumjavaproperty == null)?"<null>":this.enumjavaproperty));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.numberproperty == null)? 0 :this.numberproperty.hashCode()));
        result = ((result* 31)+((this.nullobjectproperty == null)? 0 :this.nullobjectproperty.hashCode()));
        result = ((result* 31)+((this.objectproperty == null)? 0 :this.objectproperty.hashCode()));
        result = ((result* 31)+((this.stringproperty == null)? 0 :this.stringproperty.hashCode()));
        result = ((result* 31)+((this.intproperty == null)? 0 :this.intproperty.hashCode()));
        result = ((result* 31)+((this.enumproperty == null)? 0 :this.enumproperty.hashCode()));
        result = ((result* 31)+((this.requiredproperty == null)? 0 :this.requiredproperty.hashCode()));
        result = ((result* 31)+((this.setproperty == null)? 0 :this.setproperty.hashCode()));
        result = ((result* 31)+((this.anyobjectproperty == null)? 0 :this.anyobjectproperty.hashCode()));
        result = ((result* 31)+((this.booleanproperty == null)? 0 :this.booleanproperty.hashCode()));
        result = ((result* 31)+((this.optionalproperty == null)? 0 :this.optionalproperty.hashCode()));
        result = ((result* 31)+((this.defaultvalueproperty == null)? 0 :this.defaultvalueproperty.hashCode()));
        result = ((result* 31)+((this.listproperty == null)? 0 :this.listproperty.hashCode()));
        result = ((result* 31)+((this.enumjavaproperty == null)? 0 :this.enumjavaproperty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Propertyjsontojava) == false) {
            return false;
        }
        Propertyjsontojava rhs = ((Propertyjsontojava) other);
        return (((((((((((((((this.numberproperty == rhs.numberproperty)||((this.numberproperty!= null)&&this.numberproperty.equals(rhs.numberproperty)))&&((this.nullobjectproperty == rhs.nullobjectproperty)||((this.nullobjectproperty!= null)&&this.nullobjectproperty.equals(rhs.nullobjectproperty))))&&((this.objectproperty == rhs.objectproperty)||((this.objectproperty!= null)&&this.objectproperty.equals(rhs.objectproperty))))&&((this.stringproperty == rhs.stringproperty)||((this.stringproperty!= null)&&this.stringproperty.equals(rhs.stringproperty))))&&((this.intproperty == rhs.intproperty)||((this.intproperty!= null)&&this.intproperty.equals(rhs.intproperty))))&&((this.enumproperty == rhs.enumproperty)||((this.enumproperty!= null)&&this.enumproperty.equals(rhs.enumproperty))))&&((this.requiredproperty == rhs.requiredproperty)||((this.requiredproperty!= null)&&this.requiredproperty.equals(rhs.requiredproperty))))&&((this.setproperty == rhs.setproperty)||((this.setproperty!= null)&&this.setproperty.equals(rhs.setproperty))))&&((this.anyobjectproperty == rhs.anyobjectproperty)||((this.anyobjectproperty!= null)&&this.anyobjectproperty.equals(rhs.anyobjectproperty))))&&((this.booleanproperty == rhs.booleanproperty)||((this.booleanproperty!= null)&&this.booleanproperty.equals(rhs.booleanproperty))))&&((this.optionalproperty == rhs.optionalproperty)||((this.optionalproperty!= null)&&this.optionalproperty.equals(rhs.optionalproperty))))&&((this.defaultvalueproperty == rhs.defaultvalueproperty)||((this.defaultvalueproperty!= null)&&this.defaultvalueproperty.equals(rhs.defaultvalueproperty))))&&((this.listproperty == rhs.listproperty)||((this.listproperty!= null)&&this.listproperty.equals(rhs.listproperty))))&&((this.enumjavaproperty == rhs.enumjavaproperty)||((this.enumjavaproperty!= null)&&this.enumjavaproperty.equals(rhs.enumjavaproperty))));
    }

    public enum Enumjavaproperty {

        ONE(1),
        TWO(2),
        THREE(3);
        private final Integer value;
        private final static Map<Integer, Propertyjsontojava.Enumjavaproperty> CONSTANTS = new HashMap<Integer, Propertyjsontojava.Enumjavaproperty>();

        static {
            for (Propertyjsontojava.Enumjavaproperty c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Enumjavaproperty(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer value() {
            return this.value;
        }

        @JsonCreator
        public static Propertyjsontojava.Enumjavaproperty fromValue(Integer value) {
            Propertyjsontojava.Enumjavaproperty constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum Enumproperty {

        ONE("one"),
        TWO("two"),
        THREE("three");
        private final String value;
        private final static Map<String, Propertyjsontojava.Enumproperty> CONSTANTS = new HashMap<String, Propertyjsontojava.Enumproperty>();

        static {
            for (Propertyjsontojava.Enumproperty c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Enumproperty(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Propertyjsontojava.Enumproperty fromValue(String value) {
            Propertyjsontojava.Enumproperty constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
