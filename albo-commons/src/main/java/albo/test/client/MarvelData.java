package albo.test.client;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelData {
    
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<MarvelComic> results;

    /**
     * @return the offset
     */
    public int getOffset() {
        return offset;
    }
    /**
     * @param offset the offset to set
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }
    /**
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }
    /**
     * @param limit the limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }
    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }
    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    /**
     * @return the results
     */
    public List<MarvelComic> getResults() {
        return results;
    }
    /**
     * @param results the results to set
     */
    public void setResults(List<MarvelComic> results) {
        this.results = results;
    }
}
