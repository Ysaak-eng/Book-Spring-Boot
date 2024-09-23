package com.example.ysaak.api.model;

import java.io.Serializable;
import java.util.Date;

public class BookModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String autor;
    private Date launch_date;
    private Double price;
    private String longText;

    public BookModel() {
    }

    public BookModel(Long id, String autor, Date launch_date, Double price, String longText) {
        this.id = id;
        this.autor = autor;
        this.launch_date = launch_date;
        this.price = price;
        this.longText = longText;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getLaunch_date() {
        return this.launch_date;
    }

    public void setLaunch_date(Date launch_date) {
        this.launch_date = launch_date;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLongText() {
        return this.longText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((launch_date == null) ? 0 : launch_date.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((longText == null) ? 0 : longText.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookModel other = (BookModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (launch_date == null) {
            if (other.launch_date != null)
                return false;
        } else if (!launch_date.equals(other.launch_date))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        if (longText == null) {
            if (other.longText != null)
                return false;
        } else if (!longText.equals(other.longText))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", autor='" + getAutor() + "'" +
                ", launch_date='" + getLaunch_date() + "'" +
                ", price='" + getPrice() + "'" +
                ", longText='" + getLongText() + "'" +
                "}";
    }

}
