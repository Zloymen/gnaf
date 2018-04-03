package software.perfekt.gnaf.param;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Zloy on 03.04.2018.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdressParam {
    private String search;
    private Integer size;
}
