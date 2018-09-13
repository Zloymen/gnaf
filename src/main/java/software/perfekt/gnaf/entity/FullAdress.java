package software.perfekt.gnaf.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

/**
 *    , address_detail_pid
 *
 * Created by Zloy on 03.04.2018.
 */

@Entity
@Immutable
@Table(name = "full_address")
@Data
public class FullAdress {

    @Id
    @Column(name = "address_detail_pid")
    private String pid;

    @Column(name = "flat_number")
    private Integer flatNumber;

    @Column(name = "flat_number_suffix")
    private Integer flatNumberSuffix;

    @Column(name = "number_first")
    private Integer number;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_type_code")
    private String streetTypeCode;

    @Column(name = "locality_name")
    private String locality;

    @Column(name = "state_abbreviation")
    private String state;

    @Column(name = "postcode")
    private String postcode;


    /**
     * Mr S Tan
     * 200 Broadway Av
     * WEST BEACH SA 5024
     *
     * select flat_number, flat_number_suffix, number_first, street_name, street_type_code, locality_name, state_abbreviation, postcode from full_adress;
     */

    @Transient
    private String display;

    @PostLoad
    public void postLoad(){
        this.display = (flatNumber == null ? "" : flatNumber + " ")
                + (flatNumberSuffix == null ? "" : flatNumberSuffix + " ")
                + (number == null ? "" : number + " ")
                + (streetName == null ? "" : streetName + " ")
                + (streetTypeCode == null ? "" : streetTypeCode + " ")
                + (locality == null ? "" : locality + " ")
                + (state == null ? "" : state + " ")
                + (postcode == null ? "" : postcode);
    }
}
