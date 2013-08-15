@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type = LocalDate.class,
                        value = LocalDateAdapter.class)
})
package com.creditcloud.model.loan;

import com.creditcloud.model.util.LocalDateAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import org.joda.time.LocalDate;
