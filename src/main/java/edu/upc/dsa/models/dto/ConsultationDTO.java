

package edu.upc.dsa.models.dto;

public class ConsultationDTO {
    private String title;
    private String message;
    private String sender;

    public ConsultationDTO() {}
    public ConsultationDTO(String title, String message, String sender) {
        this.title = title; this.message = message; this.sender = sender;
    }

    // Getters y Setters (NECESARIOS para JAX-RS/Jackson)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
}
