package guru.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
@Null
    private UUID id;
@Null
    private Integer version;
@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssz",shape = JsonFormat.Shape.STRING)
@Null
    private OffsetDateTime createdDate;
@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssz",shape = JsonFormat.Shape.STRING)
@Null
    private OffsetTime lastModifiedDate;
@NotBlank
    private String beerName;
@NotNull
    private BeerStyleEnum  beerStyle;
@Positive
@NotNull
    private Long upc;
@JsonFormat(shape = JsonFormat.Shape.STRING)
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;




}
