/**
 * Copyright MaDgIK Group 2010 - 2013.
 */
package com.foundationdb.sql.query;

/**
 *
 * @author heraldkllapi
 */
public class Column {

    public String tableAlias = null;
    public String columnName = null;

    @Override
    public String toString() {
        if(columnName != null) {
            return tableAlias + "." + columnName;
        }
        else {
            return tableAlias;
        }
    }
}