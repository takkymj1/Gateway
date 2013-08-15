/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.utils;

import java.sql.Date;
import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;
import org.joda.time.LocalDate;

/**
 *
 * @author sobranie
 */
public class LocalDateConverter implements Converter {

    @Override
    public Object convertObjectValueToDataValue(Object objectValue, Session session) {
        return objectValue == null ? null : new Date(((LocalDate)objectValue).toDate().getTime());
    }

    @Override
    public Object convertDataValueToObjectValue(Object dataValue, Session session) {
        return dataValue == null ? null : new LocalDate((Date)dataValue);
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public void initialize(DatabaseMapping mapping, Session session) {
    }

}
