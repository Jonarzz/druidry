package in.zapr.druid.druidry.dimension;


import com.fasterxml.jackson.annotation.JsonInclude;
import in.zapr.druid.druidry.dimension.enums.FilteredDimensionType;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper = true)
public class RegexFilteredDimension extends FilteredDimension {
    private String pattern;

    @Builder
    public RegexFilteredDimension(@NonNull DimensionSpec dimensionSpec, @NonNull String pattern) {
        this.pattern = pattern;
        this.delegate = dimensionSpec;
        this.type = FilteredDimensionType.REGEX_FILTERED;
    }


}
