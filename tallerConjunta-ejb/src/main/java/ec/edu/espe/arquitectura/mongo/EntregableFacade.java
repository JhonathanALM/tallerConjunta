package ec.edu.espe.arquitectura.mongo;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.model.Entregable;
import javax.ejb.Stateless;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;
import xyz.morphia.query.Query;
import xyz.morphia.query.UpdateOperations;

/**
 * @author jhona
 */
@Stateless(name="ent")
public class EntregableFacade {
public void create(Entregable p) {
        Morphia m = new Morphia();
        Datastore ds = m.mapPackage("ec.edu.espe.arquitectura.model.Entregable").createDatastore(new MongoClient(), "Taller");
        DBObject dbo = m.toDBObject(p);
        ds.ensureIndexes();
        ds.getCollection(Entregable.class).insert(dbo);
    }
public void edit(Entregable p, String id) {
        Morphia m = new Morphia();
        Datastore ds = m.mapPackage("ec.edu.espe.as.model.Entregable").createDatastore(new MongoClient(), "Taller");
        Query query = ds.createQuery(Entregable.class).field("cedula").equal(id);
        System.out.println("Entregable"+p.toString());
        UpdateOperations<Entregable> ops = ds.createUpdateOperations(Entregable.class).set("fechaReal", p.getFechaReal());
        ds.update(query, ops);
    }
}
