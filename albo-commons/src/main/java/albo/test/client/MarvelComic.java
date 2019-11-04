package albo.test.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelComic {

    private Integer id;
    private Integer digitalId;
    private String title;
    private Integer issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private Integer pageCount;
    private MarvelCreators creators;
    private MarvelChars characters;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the digitalId
     */
    public Integer getDigitalId() {
        return digitalId;
    }
    /**
     * @param digitalId the digitalId to set
     */
    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the issueNumber
     */
    public Integer getIssueNumber() {
        return issueNumber;
    }
    /**
     * @param issueNumber the issueNumber to set
     */
    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }
    /**
     * @return the variantDescription
     */
    public String getVariantDescription() {
        return variantDescription;
    }
    /**
     * @param variantDescription the variantDescription to set
     */
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the modified
     */
    public String getModified() {
        return modified;
    }
    /**
     * @param modified the modified to set
     */
    public void setModified(String modified) {
        this.modified = modified;
    }
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * @return the upc
     */
    public String getUpc() {
        return upc;
    }
    /**
     * @param upc the upc to set
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }
    /**
     * @return the diamondCode
     */
    public String getDiamondCode() {
        return diamondCode;
    }
    /**
     * @param diamondCode the diamondCode to set
     */
    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }
    /**
     * @return the ean
     */
    public String getEan() {
        return ean;
    }
    /**
     * @param ean the ean to set
     */
    public void setEan(String ean) {
        this.ean = ean;
    }
    /**
     * @return the issn
     */
    public String getIssn() {
        return issn;
    }
    /**
     * @param issn the issn to set
     */
    public void setIssn(String issn) {
        this.issn = issn;
    }
    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }
    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }
    /**
     * @return the pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }
    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }
    /**
     * @return the creators
     */
    public MarvelCreators getCreators() {
        return creators;
    }
    /**
     * @param creators the creators to set
     */
    public void setCreators(MarvelCreators creators) {
        this.creators = creators;
    }
    /**
     * @return the characters
     */
    public MarvelChars getCharacters() {
        return characters;
    }
    /**
     * @param characters the characters to set
     */
    public void setCharacters(MarvelChars characters) {
        this.characters = characters;
    }
}
