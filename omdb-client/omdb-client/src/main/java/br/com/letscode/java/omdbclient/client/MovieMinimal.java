package br.com.letscode.java.omdbclient.client;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public record MovieMinimal(String imdbId, String title, Integer year ) {

    @JsonCreator
    public MovieMinimal(String imdbId, String title, String year) {
        this(imdbId, title, convertYear(year));
    }

    private static int convertYear(final String year) {
        if (year.matches("\\d+")) {
            return Integer.parseInt(year);
        }
        return Arrays.stream(year.split("\\D"))
            .map(Integer::parseInt)
            .findFirst()
            .orElseThrow();
    }

    public static void escreveCsv(String linha){
        String filePath = getFilePath("cache.csv");
        try{
            Files.writeString(Path.of(filePath), linha, StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFilePath(String fileName){
        URL url = MovieMinimal.class.getClassLoader().getResource(fileName);
        File file = new File(url.getFile());
        return file.getPath();
    }
}
