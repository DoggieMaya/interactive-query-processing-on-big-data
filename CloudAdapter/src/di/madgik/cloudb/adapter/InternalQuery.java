package di.madgik.cloudb.adapter;

import com.foundationdb.sql.query.SQLQuery;
import com.foundationdb.sql.query.Table;

/**
 * Created by panossakkos on 2/21/14.
 */

public class InternalQuery extends SQLQuery {

    public InternalQuery () {
        Table leafTable = new Table();
        leafTable.name = "leaf";

        this.inputTables.add(leafTable);
    }

    @Override
    public String toString() {
        return super.toString().replace("\n", "\n\t");
    }
}
