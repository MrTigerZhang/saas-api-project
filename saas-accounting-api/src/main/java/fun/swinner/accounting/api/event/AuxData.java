package fun.swinner.accounting.api.event;

import lombok.Data;

import java.io.Serializable;

/**
 * 辅助核算项。
 */
@Data
public class AuxData implements Serializable {
    private String id;
    private String type;
    private String name;
}
