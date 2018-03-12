/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.managerapi.dao;

import br.net.gvt.efika.managerapi.model.entity.Endpoint;
import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import java.util.List;

public class EndpointDAOImpl extends AbstractMongoDAO<Endpoint> implements EndpointDAO {

    public EndpointDAOImpl() {
        super(MongoEndpointEnum.MONGO.getIp(), "managerAPI", Endpoint.class);
    }

    @Override
    public List<Endpoint> listar() {
        return getDatastore()
                .createQuery(Endpoint.class)
                .asList();
    }

}
