package de.demo.micro.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;
import de.demo.micro.domain.enumeration.SctType;

/**
 * A DTO for the Image entity.
 */
public class ImageDTO implements Serializable {

    private Long id;

    private String filePath;

    private SctType type;

    private String mandantId;

    private String kundenId;

    private String imageName;

    private LocalDate validFrom;

    private LocalDate validTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public SctType getType() {
        return type;
    }

    public void setType(SctType type) {
        this.type = type;
    }

    public String getMandantId() {
        return mandantId;
    }

    public void setMandantId(String mandantId) {
        this.mandantId = mandantId;
    }

    public String getKundenId() {
        return kundenId;
    }

    public void setKundenId(String kundenId) {
        this.kundenId = kundenId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ImageDTO imageDTO = (ImageDTO) o;
        if(imageDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), imageDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ImageDTO{" +
            "id=" + getId() +
            ", filePath='" + getFilePath() + "'" +
            ", type='" + getType() + "'" +
            ", mandantId='" + getMandantId() + "'" +
            ", kundenId='" + getKundenId() + "'" +
            ", imageName='" + getImageName() + "'" +
            ", validFrom='" + getValidFrom() + "'" +
            ", validTo='" + getValidTo() + "'" +
            "}";
    }
}
