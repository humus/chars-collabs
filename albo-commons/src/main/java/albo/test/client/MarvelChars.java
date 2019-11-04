package albo.test.client;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelChars {

    private int available;
    private String collectionURI;
    private int returned;
    private List<MarvelChar> items;
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
     * @return the collectionURI
     */
    public String getCollectionURI() {
        return collectionURI;
    }
    /**
     * @param collectionURI the collectionURI to set
     */
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }
    /**
     * @return the returned
     */
    public int getReturned() {
        return returned;
    }
    /**
     * @param returned the returned to set
     */
    public void setReturned(int returned) {
        this.returned = returned;
    }
    /**
     * @return the items
     */
    public List<MarvelChar> getItems() {
        return items;
    }
    /**
     * @param items the items to set
     */
    public void setItems(List<MarvelChar> items) {
        this.items = items;
    }
    
}
