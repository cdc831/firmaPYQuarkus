package net.sytes.cantero.firma;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "opencodedb")
public class schemaFirma extends PanacheEntity {

    public String OPENCODE_ID;

    public String COMPANY_FISCAL_ID_TYPE;

    public String COMPANY_FISCAL_ID;

    public String CONSIGNMENT_ID;

    @NotNull
    public String EMPLOYEE_FISCAL_ID_TYPE;

    @NotNull
    public String EMPLOYEE_FISCAL_ID;

    @NotNull
    public String DOCUMENT_TYPE;

    @CreationTimestamp
    public Date DOCUMENT_DATE;

    @NotNull
    public String DOCUMENT_PATH;

    @NotNull
    public String ACTION_COLUMN;

    public String RESULT_COLUMN;

    public String OPENCODE_RESPONSE_CODE;

    public String OPENCODE_RESPONSE_DESCRIPTION;
}
