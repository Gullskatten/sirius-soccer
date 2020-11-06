package no.ntnu.soccer.parser.csv;

import com.opencsv.bean.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvUtil<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CsvUtil.class);

    public List<T> readCsv(String resourceFileName, Class typeOfObjects, String delimiter, Charset charset) {

        Path absPath = Path.of(System.getProperty("user.dir") + "/src/main/resources/" + resourceFileName);
        LOGGER.info("Reading file from {}", absPath);

        try(BufferedReader reader =
                    Files.newBufferedReader(absPath, charset)) {

            CsvToBean<T> cb = new CsvToBeanBuilder<T>(reader)
                    .withSeparator(delimiter.charAt(0))
                    .withType(typeOfObjects)
                    .withSkipLines(1)
                    .build();
            LOGGER.debug("Parsing file content to CSV");
            return cb.parse();
        } catch (Exception e) {
            LOGGER.error("Reading of CSV file failed: {}", e.getMessage());
        }
        return null;
    }
}
