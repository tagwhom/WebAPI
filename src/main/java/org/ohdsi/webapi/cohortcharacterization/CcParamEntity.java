package org.ohdsi.webapi.cohortcharacterization;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.ohdsi.standardized_analysis_api.cohortcharacterization.design.CohortCharacterization;
import org.ohdsi.standardized_analysis_api.cohortcharacterization.design.CohortCharacterizationParam;

@Entity
@Table(name = "cohort_characterization_params")
public class 
CcParamEntity implements CohortCharacterizationParam {
    
    @Id
    @SequenceGenerator(name = "cohort_characterization_params_pk_sequence", sequenceName = "cohort_characterization_params_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cohort_characterization_params_pk_sequence")
    private Long id;
    @ManyToOne(optional = false, targetEntity = CohortCharacterizationEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "cohort_characterization_id")
    private CohortCharacterization cohortCharacterization;
    @Column
    private String name;
    @Column
    private String value;
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public CohortCharacterization getCohortCharacterization() {
        return cohortCharacterization;
    }

    public void setCohortCharacterization(final CohortCharacterization cohortCharacterization) {
        this.cohortCharacterization = cohortCharacterization;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof CcParamEntity)) return false;
        final CcParamEntity that = (CcParamEntity) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), super.hashCode());
    }
}
