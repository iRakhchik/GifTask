package ru.rakhcheev.alphatask.model.gif;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GifData {

    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("embed_url")
    private String embed_url;

}
