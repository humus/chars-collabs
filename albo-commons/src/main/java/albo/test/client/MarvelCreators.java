package albo.test.client;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelCreators {

    private int available;
    private String collecntionURI;
    private List<MarvelCreator> items;
    /**
     * @return the available
     */
    public int getAvailable() {
        return available;
    }
    /**
     * @param available the available to set
     */
    public void setAvailable(int available) {
        this.available = available;
    }
    /**
     * @return the collecntionURI
     */
    public String getCollecntionURI() {
        return collecntionURI;
    }
    /**
     * @param collecntionURI the collecntionURI to set
     */
    public void setCollecntionURI(String collecntionURI) {
        this.collecntionURI = collecntionURI;
    }
    /**
     * @return the items
     */
    public List<MarvelCreator> getItems() {
        return items;
    }
    /**
     * @param items the items to set
     */
    public void setItems(List<MarvelCreator> items) {
        this.items = items;
    }
}
