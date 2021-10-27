package br.com.letscode.java.omdbclient.client;

import static java.lang.Boolean.valueOf;
import static java.lang.Integer.parseInt;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class ResultSearch {
    @JsonProperty("Search")
    private List<MovieMinimal> resultList;
    private Integer total;
    private Boolean response;

    @JsonProperty("totalResults")
    public void setTotal(String total) {
        this.total = Integer.parseInt(total);
    }
    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = Boolean.valueOf(response);
    }
}

