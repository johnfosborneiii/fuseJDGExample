
package score;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "score"
})
public class Score {

    @JsonProperty("name")
    private String name;
    @JsonProperty("score")
    private int score;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public int getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(int score) {
        this.score = score;
    }
    

}
