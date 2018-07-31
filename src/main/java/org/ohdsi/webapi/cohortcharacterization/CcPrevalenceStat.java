package org.ohdsi.webapi.cohortcharacterization;

import org.ohdsi.standardized_analysis_api.cohortcharacterization.result.PrevalenceStat;

public class CcPrevalenceStat extends CcResultEntity implements PrevalenceStat {
    
    private String timeWindow;
    private Long value;
    private Double proportion;
    private Long covariateId;
    private String covariateName;
    private Long conceptId;
    private Long count;
    
    @Override
    public Double getProportion() {
        return this.getProportion();
    }

    @Override
    public Long getCovariateId() {
        return covariateId;
    }

    @Override
    public String getCovariateName() {
        return covariateName;
    }

    @Override
    public Long getConceptId() {
        return conceptId;
    }

    @Override
    public Long getCount() {
        return count;
    }

    public void setCovariateId(final Long covariateId) {
        this.covariateId = covariateId;
    }

    public void setCovariateName(final String covariateName) {
        this.covariateName = covariateName;
    }

    public void setConceptId(final Long conceptId) {
        this.conceptId = conceptId;
    }

    public void setCount(final Long count) {
        this.count = count;
    }
    
    public String getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(final String timeWindow) {
        this.timeWindow = timeWindow;
    }
}
