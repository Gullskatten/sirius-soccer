package no.ntnu.soccer.parser.model;

import com.opencsv.bean.AbstractBeanField;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class LocalDateConverter extends AbstractBeanField<String, LocalDate> {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected Object convert(String s) {
        if(StringUtils.isEmpty(s) || !s.startsWith("2")) {
            return null;
        }
        TemporalAccessor parse = DATE_FORMAT.parse(s);
        return LocalDate.from(parse);
    }
}
