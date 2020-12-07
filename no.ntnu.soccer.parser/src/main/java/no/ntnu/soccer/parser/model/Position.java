package no.ntnu.soccer.parser.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Position implements XmiParsable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Position.class);
    private final FieldPositionType type;
    private final List<Player> players;

    public Position(List<Player> players, FieldPositionType type) {
        this.players = players;
        this.type = type;
    }

    @Override
    public void toXmi(BufferedWriter writer, Function<Void, Void> children) {
        try {
            writer.write(indent() + "<lineup\n"
                    + indent() + "    players=" + "\""  + players.stream().map(x -> x.getId() + "").collect(Collectors.joining(" ")) + "\"\n"
                    + indent() + "    type=" + "\""  + type + "\"/>\n");
        } catch (IOException e) {
            LOGGER.info("Exception occurred: ",e);
        }
    }

    @Override
    public String indent() {
        return "              ";
    }

    public List<Player> getPlayers() {
        return players;
    }
}
