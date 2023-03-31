package com.io.gift.model.request;

import jakarta.validation.constraints.NotEmpty;
import java.util.Map;
import lombok.Data;


@Data
public class TagCreateRequest {

    @NotEmpty
    private Map<String, RequestedTagStatus> tags;
}
