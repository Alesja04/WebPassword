/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */
@Entity
public class AccountBox implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urllogin;
    private String urlpassword;
    private String url;

    public AccountBox() {
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        
    }

    public String getUrllogin() {
        return urllogin;
    }

    public void setUrllogin(String urllogin) {
        this.urllogin = urllogin;
    }

    public String getUrlpassword() {
        return urlpassword;
    }

    public void setUrlpassword(String urlpassword) {
        this.urlpassword = urlpassword;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "AccountBox{" + "id=" + id + ", urllogin=" + urllogin + ", urlpassword=" + urlpassword + ", url=" + url + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.urllogin);
        hash = 17 * hash + Objects.hashCode(this.urlpassword);
        hash = 17 * hash + Objects.hashCode(this.url);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AccountBox other = (AccountBox) obj;
        if (!Objects.equals(this.urllogin, other.urllogin)) {
            return false;
        }
        if (!Objects.equals(this.urlpassword, other.urlpassword)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}

    


