/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.managerapi.model.entity;

import br.net.gvt.efika.mongo.model.entity.AbstractMongoEntity;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author G0042204
 */
@Entity(value = "endpoint")
public class Endpoint extends AbstractMongoEntity {

    private String api;

    private String url;

    public Endpoint() {
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
