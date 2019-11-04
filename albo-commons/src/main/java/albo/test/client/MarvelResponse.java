package albo.test.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MarvelResponse {

   private int code; 
   private String status;
   private String copyright;
   private String attributionText;
   private String attributionHTML;
   private MarvelData data;

   /**
    * @return the code
    */
   public int getCode() {
       return code;
   }
   /**
    * @param code the code to set
    */
   public void setCode(int code) {
       this.code = code;
   }
   /**
    * @return the status
    */
   public String getStatus() {
       return status;
   }
   /**
    * @param status the status to set
    */
   public void setStatus(String status) {
       this.status = status;
   }
   /**
    * @return the copyright
    */
   public String getCopyright() {
       return copyright;
   }
   /**
    * @param copyright the copyright to set
    */
   public void setCopyright(String copyright) {
       this.copyright = copyright;
   }
   /**
    * @return the attributionText
    */
   public String getAttributionText() {
       return attributionText;
   }
   /**
    * @param attributionText the attributionText to set
    */
   public void setAttributionText(String attributionText) {
       this.attributionText = attributionText;
   }
   /**
    * @return the attributionHTML
    */
   public String getAttributionHTML() {
       return attributionHTML;
   }
   /**
    * @param attributionHTML the attributionHTML to set
    */
   public void setAttributionHTML(String attributionHTML) {
       this.attributionHTML = attributionHTML;
   }
   /**
    * @return the data
    */
   public MarvelData getData() {
       return data;
   }
   /**
    * @param data the data to set
    */
   public void setData(MarvelData data) {
       this.data = data;
   }
}
