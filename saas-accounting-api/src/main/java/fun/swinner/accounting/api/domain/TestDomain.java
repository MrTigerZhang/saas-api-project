package fun.swinner.accounting.api.domain;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 *
 */
@Data
public class TestDomain implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
}
