package gradledemo.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public
class AForm {

    private final List<Integer> years;


    @SuppressWarnings("WeakerAccess")
    public AForm() {
        years = createYearList();
    }

    private List<Integer> createYearList() {
        LocalDate now = LocalDate.now();
        return Arrays.asList(now.getYear(), now.getYear() + 1);
    }

}
