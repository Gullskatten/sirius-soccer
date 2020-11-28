package no.ntnu.soccer.parser.model;

import java.io.BufferedWriter;
import java.util.function.Function;

public interface XmiParsable {
    void toXmi(BufferedWriter writer, Function<Void, Void> children);
    String indent();
}
