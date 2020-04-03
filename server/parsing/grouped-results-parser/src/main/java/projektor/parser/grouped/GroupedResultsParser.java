package projektor.parser.grouped;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import projektor.parser.grouped.model.GroupedResults;

import java.io.IOException;

public class GroupedResultsParser {
    private final ObjectMapper mapper = new ObjectMapper();

    public GroupedResults parseGroupedResults(String groupedResultsBlob) throws IOException {
        return mapper.readValue(groupedResultsBlob, GroupedResults.class);
    }

    public String serializeGroupedResults(GroupedResults groupedResults) throws JsonProcessingException {
        return mapper.writeValueAsString(groupedResults);
    }
}
