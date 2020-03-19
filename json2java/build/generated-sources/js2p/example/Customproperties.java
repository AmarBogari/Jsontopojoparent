
package example;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import json2java.CustomChildName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "a",
    "myProperty",
    "map"
})
public class Customproperties {

    /**
     * 
     * Corresponds to the "a" property.
     * 
     */
    @JsonProperty("a")
    private java.lang.String b;
    @JsonProperty("myProperty")
    @Valid
    private CustomChildName myProperty;
    @JsonProperty("map")
    @Valid
    private Map<String, Integer> map;
    @JsonIgnore
    @Valid
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * 
     * Corresponds to the "a" property.
     * 
     */
    @JsonProperty("a")
    public java.lang.String getB() {
        return b;
    }

    /**
     * 
     * Corresponds to the "a" property.
     * 
     */
    @JsonProperty("a")
    public void setB(java.lang.String b) {
        this.b = b;
    }

    @JsonProperty("myProperty")
    public CustomChildName getMyProperty() {
        return myProperty;
    }

    @JsonProperty("myProperty")
    public void setMyProperty(CustomChildName myProperty) {
        this.myProperty = myProperty;
    }

    @JsonProperty("map")
    public Map<String, Integer> getMap() {
        return map;
    }

    @JsonProperty("map")
    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customproperties.class.getName()).append('@').append(java.lang.Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("b");
        sb.append('=');
        sb.append(((this.b == null)?"<null>":this.b));
        sb.append(',');
        sb.append("myProperty");
        sb.append('=');
        sb.append(((this.myProperty == null)?"<null>":this.myProperty));
        sb.append(',');
        sb.append("map");
        sb.append('=');
        sb.append(((this.map == null)?"<null>":this.map));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.b == null)? 0 :this.b.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.myProperty == null)? 0 :this.myProperty.hashCode()));
        result = ((result* 31)+((this.map == null)? 0 :this.map.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customproperties) == false) {
            return false;
        }
        Customproperties rhs = ((Customproperties) other);
        return (((((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.myProperty == rhs.myProperty)||((this.myProperty!= null)&&this.myProperty.equals(rhs.myProperty))))&&((this.map == rhs.map)||((this.map!= null)&&this.map.equals(rhs.map))));
    }

}
