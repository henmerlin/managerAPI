/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.managerapi.model;

import br.net.gvt.efika.managerapi.model.entity.Endpoint;
import java.util.List;

/**
 *
 * @author G0042204
 */
public class EndpointResponse {

    private List<Endpoint> endpoints;

    public EndpointResponse() {
    }

    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

}
