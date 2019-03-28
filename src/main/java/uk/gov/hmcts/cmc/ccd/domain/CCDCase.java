package uk.gov.hmcts.cmc.ccd.domain;

import lombok.Builder;
import lombok.Data;

import uk.gov.hmcts.cmc.ccd.domain.defendant.CCDDefendant;
import uk.gov.hmcts.cmc.ccd.domain.evidence.CCDEvidenceRow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class CCDCase {

    private Long id;
    private String referenceNumber;
    private String externalId;
    private String reason;
    private String externalReferenceNumber;

    private AmountType amountType;
    private BigDecimal amountLowerValue;
    private BigDecimal amountHigherValue;
    private List<CCDCollectionElement<CCDAmountRow>> amountBreakDown;
    private BigDecimal totalAmount;
    private CCDNotKnown notKnown;

    private CCDInterestType interestType;
    private BigDecimal interestBreakDownAmount;
    private String interestBreakDownExplanation;
    private BigDecimal interestRate;
    private String interestReason;
    private BigDecimal interestSpecificDailyAmount;
    private CCDInterestDateType interestDateType;
    private LocalDate interestClaimStartDate;
    private String interestStartDateReason;
    private CCDInterestEndDateType interestEndDateType;

    private String paymentId;
    private BigDecimal paymentAmount;
    private String paymentReference;
    private String paymentStatus;
    private LocalDate paymentDateCreated;
    private String feeAccountNumber;

    private String preferredCourt;
    private String personalInjuryGeneralDamages;
    private String housingDisrepairCostOfRepairDamages;
    private String housingDisrepairOtherDamages;
    private String sotSignerName;
    private String sotSignerRole;

    private List<CCDCollectionElement<CCDClaimant>> claimants;
    private List<CCDCollectionElement<CCDDefendant>> defendants;
    private List<CCDCollectionElement<CCDTimelineEvent>> timeline;
    private List<CCDCollectionElement<CCDEvidenceRow>> evidence;
}
