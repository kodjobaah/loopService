package com.aire.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Created by kodjobaah on 12/06/2017. */
public class ApplicationData {

  @JsonProperty("a")
  private String loc;

  @JsonProperty("desc")
  private String desc;

  @JsonProperty("num_il_tl")
  private String numIlTl;

  @JsonProperty("num_bc_sats")
  private String numBcSats;

  @JsonProperty("total_il_high_credit_limit")
  private String totalIlHighCreditLimit;

  @JsonProperty("acc_open_past_24mths")
  private String accOpenPast24mths;

  @JsonProperty("delinq_2yrs")
  private String delinq2yrs;

  @JsonProperty("pub_rec_bankruptcies")
  private String pubRecBankruptcies;

  @JsonProperty("mo_sin_rcnt_rev_tl_op")
  private String moSinRcntRevTlOp;

  @JsonProperty("num_actv_rev_tl")
  private String numActvRevTl;

  @JsonProperty("open_il_6m")
  private String openIl6m;

  @JsonProperty("verification_status")
  private String verificationStatus;

  @JsonProperty("mths_since_recent_inq")
  private String mthsSinceRecentInq;

  @JsonProperty("num_tl_op_past_12m")
  private String numTlOpPast12m;

  @JsonProperty("tax_liens")
  private String taxLiens;

  @JsonProperty("issue_d")
  private String issueD;

  @JsonProperty("mths_since_last_delinq")
  private String mthsSinceLastDelinq;

  @JsonProperty("toatl_cu_tl")
  private String totalCuTl;

  @JsonProperty("mort_acc")
  private String mortAcc;

  @JsonProperty("inq_last_6mths")
  private String inqLast6mths;

  @JsonProperty("inq_last_12m")
  private String inqLast12m;

  @JsonProperty("num_actv_bc_tl")
  private String numActvBcTl;

  @JsonProperty("addr_state")
  private String addrState;

  @JsonProperty("num_op_rev_tl")
  private String numOpRevTl;

  @JsonProperty("open_acc_6m")
  private String openAcc6m;

  @JsonProperty("mo_sin_rcnt_tl")
  private String moSinRcntTl;

  @JsonProperty("num_tl_120dpd_2m")
  private String numTl120dpd2m;

  @JsonProperty("total_rev_hi_lim")
  private String totalRevHiLim;

  @JsonProperty("emp_title")
  private String empTitle;

  @JsonProperty("delinq_amnt")
  private String delinqAmnt;

  @JsonProperty("mths_since_recent_bc")
  private String mthsSinceRecentBc;

  @JsonProperty("total_bal_il")
  private String totalBalIl;

  @JsonProperty("bc_util")
  private String bcUtil;

  @JsonProperty("num_tl_30dpd")
  private String numTl30dpd;

  @JsonProperty("dti")
  private String dti;

  @JsonProperty("avg_cur_bal")
  private String avgCurBal;

  @JsonProperty("purpose")
  private String purpose;

  @JsonProperty("mths_since_last_major_derog")
  private String mthsSinceLastMajorDerog;

  @JsonProperty("bc_open_to_buy")
  private String bcOpenToBuy;

  @JsonProperty("open_il_12m")
  private String openIl12m;

  @JsonProperty("revol_bal")
  private String revolBal;

  @JsonProperty("tot_hi_cred_lim")
  private String totHiCredLim;

  @JsonProperty("num_sats")
  private String numSats;

  @JsonProperty("percent_bc_gt_75")
  private String percentBcGt75;

  @JsonProperty("tot_cur_bal")
  private String totCurBal;

  @JsonProperty("total_bc_limit")
  private String totalBcLimit;

  @JsonProperty("il_util")
  private String il_util;

  @JsonProperty("home_ownership")
  private String homeOwnership;

  @JsonProperty("earliest_cr_lime")
  private String earliestCrLine;

  @JsonProperty("open_rv_12m")
  private String open_rv_12m;

  @JsonProperty("num_bc_tl")
  private String numBcTl;

  @JsonProperty("mths_since_recent_bc_dlq")
  private String mthsSinceRecentBcDlq;

  @JsonProperty("num_tl_90g_dpd_24m")
  private String numTl90gDpd24m;

  @JsonProperty("num_rev_accts")
  private String numRevAccts;

  @JsonProperty("pct_tl_nvr_dlq")
  private String pctTlNvrDlq;

  @JsonProperty("zip_code")
  private String zipCode;

  @JsonProperty("revol_util")
  private String revolUtil;

  @JsonProperty("collection_recovery_fee")
  private String collectionRecoveryFee;

  @JsonProperty("open_acc")
  private String openAcc;

  @JsonProperty("open_il_24m")
  private String openIl24m;

  @JsonProperty("mo_sin_old_il_acct")
  private String moSinOldIlAcct;

  @JsonProperty("acc_now_delinq")
  private String accNowDelinq;

  @JsonProperty("inq_fi")
  private String inqFi;

  @JsonProperty("mths_since_last_record")
  private String mthsSinceLastRecord;

  @JsonProperty("emp_length")
  private String emp_length;

  @JsonProperty("title")
  private String title;

  @JsonProperty("mths_since_rcnt_il")
  private String mthsSinceRcntIl;

  @JsonProperty("total_acc")
  private String totalAcc;

  @JsonProperty("pub_rec")
  private String pubRec;

  @JsonProperty("annual_inc")
  private String annualInc;

  @JsonProperty("num_accts_ever_120_pd")
  private String numAcctsEver120Pd;

  @JsonProperty("max_bal_bc")
  private String maxBalBc;

  @JsonProperty("all_util")
  private String allUtil;

  @JsonProperty("mo_sin_old_rev_tl_op")
  private String moSinOldRevTlOp;

  @JsonProperty("tot_coll_amt")
  private String tot_coll_amt;

  @JsonProperty("open_rv_24m")
  private String openRv24m;

  @JsonProperty("total_bal_ex_mort")
  private String totalBalExMort;

  @JsonProperty("mths_since_recent_revol_delinq")
  private String mthsSinceRecentRevolDelinq;

  @JsonProperty("collections_12_mths_ex_med")
  private String collections12MthsExMed;

  @JsonProperty("chargeoff_within_12_mths")
  private String chargeoffWithin12Mths;

  @JsonProperty("num_rev_tl_bal_gt_0")
  private String numRevTlBalGt0;

  public String getLoc() {
    return loc;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getNumIlTl() {
    return numIlTl;
  }

  public void setNumIlTl(String numIlTl) {
    this.numIlTl = numIlTl;
  }

  public String getNumBcSats() {
    return numBcSats;
  }

  public void setNumBcSats(String numBcSats) {
    this.numBcSats = numBcSats;
  }

  public String getTotalIlHighCreditLimit() {
    return totalIlHighCreditLimit;
  }

  public void setTotalIlHighCreditLimit(String totalIlHighCreditLimit) {
    this.totalIlHighCreditLimit = totalIlHighCreditLimit;
  }

  public String getAccOpenPast24mths() {
    return accOpenPast24mths;
  }

  public void setAccOpenPast24mths(String accOpenPast24mths) {
    this.accOpenPast24mths = accOpenPast24mths;
  }

  public String getDelinq2yrs() {
    return delinq2yrs;
  }

  public void setDelinq2yrs(String delinq2yrs) {
    this.delinq2yrs = delinq2yrs;
  }

  public String getPubRecBankruptcies() {
    return pubRecBankruptcies;
  }

  public void setPubRecBankruptcies(String pubRecBankruptcies) {
    this.pubRecBankruptcies = pubRecBankruptcies;
  }

  public String getMoSinRcntRevTlOp() {
    return moSinRcntRevTlOp;
  }

  public void setMoSinRcntRevTlOp(String moSinRcntRevTlOp) {
    this.moSinRcntRevTlOp = moSinRcntRevTlOp;
  }

  public String getNumActvRevTl() {
    return numActvRevTl;
  }

  public void setNumActvRevTl(String numActvRevTl) {
    this.numActvRevTl = numActvRevTl;
  }

  public String getOpenIl6m() {
    return openIl6m;
  }

  public void setOpenIl6m(String openIl6m) {
    this.openIl6m = openIl6m;
  }

  public String getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public String getMthsSinceRecentInq() {
    return mthsSinceRecentInq;
  }

  public void setMthsSinceRecentInq(String mthsSinceRecentInq) {
    this.mthsSinceRecentInq = mthsSinceRecentInq;
  }

  public String getNumTlOpPast12m() {
    return numTlOpPast12m;
  }

  public void setNumTlOpPast12m(String numTlOpPast12m) {
    this.numTlOpPast12m = numTlOpPast12m;
  }

  public String getTaxLiens() {
    return taxLiens;
  }

  public void setTaxLiens(String taxLiens) {
    this.taxLiens = taxLiens;
  }

  public String getIssueD() {
    return issueD;
  }

  public void setIssueD(String issueD) {
    this.issueD = issueD;
  }

  public String getMthsSinceLastDelinq() {
    return mthsSinceLastDelinq;
  }

  public void setMthsSinceLastDelinq(String mthsSinceLastDelinq) {
    this.mthsSinceLastDelinq = mthsSinceLastDelinq;
  }

  public String getTotalCuTl() {
    return totalCuTl;
  }

  public void setTotalCuTl(String totalCuTl) {
    this.totalCuTl = totalCuTl;
  }

  public String getMortAcc() {
    return mortAcc;
  }

  public void setMortAcc(String mortAcc) {
    this.mortAcc = mortAcc;
  }

  public String getInqLast6mths() {
    return inqLast6mths;
  }

  public void setInqLast6mths(String inqLast6mths) {
    this.inqLast6mths = inqLast6mths;
  }

  public String getInqLast12m() {
    return inqLast12m;
  }

  public void setInqLast12m(String inqLast12m) {
    this.inqLast12m = inqLast12m;
  }

  public String getNumActvBcTl() {
    return numActvBcTl;
  }

  public void setNumActvBcTl(String numActvBcTl) {
    this.numActvBcTl = numActvBcTl;
  }

  public String getAddrState() {
    return addrState;
  }

  public void setAddrState(String addrState) {
    this.addrState = addrState;
  }

  public String getNumOpRevTl() {
    return numOpRevTl;
  }

  public void setNumOpRevTl(String numOpRevTl) {
    this.numOpRevTl = numOpRevTl;
  }

  public String getOpenAcc6m() {
    return openAcc6m;
  }

  public void setOpenAcc6m(String openAcc6m) {
    this.openAcc6m = openAcc6m;
  }

  public String getMoSinRcntTl() {
    return moSinRcntTl;
  }

  public void setMoSinRcntTl(String moSinRcntTl) {
    this.moSinRcntTl = moSinRcntTl;
  }

  public String getNumTl120dpd2m() {
    return numTl120dpd2m;
  }

  public void setNumTl120dpd2m(String numTl120dpd2m) {
    this.numTl120dpd2m = numTl120dpd2m;
  }

  public String getTotalRevHiLim() {
    return totalRevHiLim;
  }

  public void setTotalRevHiLim(String totalRevHiLim) {
    this.totalRevHiLim = totalRevHiLim;
  }

  public String getEmpTitle() {
    return empTitle;
  }

  public void setEmpTitle(String empTitle) {
    this.empTitle = empTitle;
  }

  public String getDelinqAmnt() {
    return delinqAmnt;
  }

  public void setDelinqAmnt(String delinqAmnt) {
    this.delinqAmnt = delinqAmnt;
  }

  public String getMthsSinceRecentBc() {
    return mthsSinceRecentBc;
  }

  public void setMthsSinceRecentBc(String mthsSinceRecentBc) {
    this.mthsSinceRecentBc = mthsSinceRecentBc;
  }

  public String getTotalBalIl() {
    return totalBalIl;
  }

  public void setTotalBalIl(String totalBalIl) {
    this.totalBalIl = totalBalIl;
  }

  public String getBcUtil() {
    return bcUtil;
  }

  public void setBcUtil(String bcUtil) {
    this.bcUtil = bcUtil;
  }

  public String getNumTl30dpd() {
    return numTl30dpd;
  }

  public void setNumTl30dpd(String numTl30dpd) {
    this.numTl30dpd = numTl30dpd;
  }

  public String getDti() {
    return dti;
  }

  public void setDti(String dti) {
    this.dti = dti;
  }

  public String getAvgCurBal() {
    return avgCurBal;
  }

  public void setAvgCurBal(String avgCurBal) {
    this.avgCurBal = avgCurBal;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getMthsSinceLastMajorDerog() {
    return mthsSinceLastMajorDerog;
  }

  public void setMthsSinceLastMajorDerog(String mthsSinceLastMajorDerog) {
    this.mthsSinceLastMajorDerog = mthsSinceLastMajorDerog;
  }

  public String getBcOpenToBuy() {
    return bcOpenToBuy;
  }

  public void setBcOpenToBuy(String bcOpenToBuy) {
    this.bcOpenToBuy = bcOpenToBuy;
  }

  public String getOpenIl12m() {
    return openIl12m;
  }

  public void setOpenIl12m(String openIl12m) {
    this.openIl12m = openIl12m;
  }

  public String getRevolBal() {
    return revolBal;
  }

  public void setRevolBal(String revolBal) {
    this.revolBal = revolBal;
  }

  public String getTotHiCredLim() {
    return totHiCredLim;
  }

  public void setTotHiCredLim(String totHiCredLim) {
    this.totHiCredLim = totHiCredLim;
  }

  public String getNumSats() {
    return numSats;
  }

  public void setNumSats(String numSats) {
    this.numSats = numSats;
  }

  public String getPercentBcGt75() {
    return percentBcGt75;
  }

  public void setPercentBcGt75(String percentBcGt75) {
    this.percentBcGt75 = percentBcGt75;
  }

  public String getTotCurBal() {
    return totCurBal;
  }

  public void setTotCurBal(String totCurBal) {
    this.totCurBal = totCurBal;
  }

  public String getTotalBcLimit() {
    return totalBcLimit;
  }

  public void setTotalBcLimit(String totalBcLimit) {
    this.totalBcLimit = totalBcLimit;
  }

  public String getIl_util() {
    return il_util;
  }

  public void setIl_util(String il_util) {
    this.il_util = il_util;
  }

  public String getHomeOwnership() {
    return homeOwnership;
  }

  public void setHomeOwnership(String homeOwnership) {
    this.homeOwnership = homeOwnership;
  }

  public String getEarliestCrLine() {
    return earliestCrLine;
  }

  public void setEarliestCrLine(String earliestCrLine) {
    this.earliestCrLine = earliestCrLine;
  }

  public String getOpen_rv_12m() {
    return open_rv_12m;
  }

  public void setOpen_rv_12m(String open_rv_12m) {
    this.open_rv_12m = open_rv_12m;
  }

  public String getNumBcTl() {
    return numBcTl;
  }

  public void setNumBcTl(String numBcTl) {
    this.numBcTl = numBcTl;
  }

  public String getMthsSinceRecentBcDlq() {
    return mthsSinceRecentBcDlq;
  }

  public void setMthsSinceRecentBcDlq(String mthsSinceRecentBcDlq) {
    this.mthsSinceRecentBcDlq = mthsSinceRecentBcDlq;
  }

  public String getNumTl90gDpd24m() {
    return numTl90gDpd24m;
  }

  public void setNumTl90gDpd24m(String numTl90gDpd24m) {
    this.numTl90gDpd24m = numTl90gDpd24m;
  }

  public String getNumRevAccts() {
    return numRevAccts;
  }

  public void setNumRevAccts(String numRevAccts) {
    this.numRevAccts = numRevAccts;
  }

  public String getPctTlNvrDlq() {
    return pctTlNvrDlq;
  }

  public void setPctTlNvrDlq(String pctTlNvrDlq) {
    this.pctTlNvrDlq = pctTlNvrDlq;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getRevolUtil() {
    return revolUtil;
  }

  public void setRevolUtil(String revolUtil) {
    this.revolUtil = revolUtil;
  }

  public String getCollectionRecoveryFee() {
    return collectionRecoveryFee;
  }

  public void setCollectionRecoveryFee(String collectionRecoveryFee) {
    this.collectionRecoveryFee = collectionRecoveryFee;
  }

  public String getOpenAcc() {
    return openAcc;
  }

  public void setOpenAcc(String openAcc) {
    this.openAcc = openAcc;
  }

  public String getOpenIl24m() {
    return openIl24m;
  }

  public void setOpenIl24m(String openIl24m) {
    this.openIl24m = openIl24m;
  }

  public String getMoSinOldIlAcct() {
    return moSinOldIlAcct;
  }

  public void setMoSinOldIlAcct(String moSinOldIlAcct) {
    this.moSinOldIlAcct = moSinOldIlAcct;
  }

  public String getAccNowDelinq() {
    return accNowDelinq;
  }

  public void setAccNowDelinq(String accNowDelinq) {
    this.accNowDelinq = accNowDelinq;
  }

  public String getInqFi() {
    return inqFi;
  }

  public void setInqFi(String inqFi) {
    this.inqFi = inqFi;
  }

  public String getMthsSinceLastRecord() {
    return mthsSinceLastRecord;
  }

  public void setMthsSinceLastRecord(String mthsSinceLastRecord) {
    this.mthsSinceLastRecord = mthsSinceLastRecord;
  }

  public String getEmp_length() {
    return emp_length;
  }

  public void setEmp_length(String emp_length) {
    this.emp_length = emp_length;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getMthsSinceRcntIl() {
    return mthsSinceRcntIl;
  }

  public void setMthsSinceRcntIl(String mthsSinceRcntIl) {
    this.mthsSinceRcntIl = mthsSinceRcntIl;
  }

  public String getTotalAcc() {
    return totalAcc;
  }

  public void setTotalAcc(String totalAcc) {
    this.totalAcc = totalAcc;
  }

  public String getPubRec() {
    return pubRec;
  }

  public void setPubRec(String pubRec) {
    this.pubRec = pubRec;
  }

  public String getAnnualInc() {
    return annualInc;
  }

  public void setAnnualInc(String annualInc) {
    this.annualInc = annualInc;
  }

  public String getNumAcctsEver120Pd() {
    return numAcctsEver120Pd;
  }

  public void setNumAcctsEver120Pd(String numAcctsEver120Pd) {
    this.numAcctsEver120Pd = numAcctsEver120Pd;
  }

  public String getMaxBalBc() {
    return maxBalBc;
  }

  public void setMaxBalBc(String maxBalBc) {
    this.maxBalBc = maxBalBc;
  }

  public String getAllUtil() {
    return allUtil;
  }

  public void setAllUtil(String allUtil) {
    this.allUtil = allUtil;
  }

  public String getMoSinOldRevTlOp() {
    return moSinOldRevTlOp;
  }

  public void setMoSinOldRevTlOp(String moSinOldRevTlOp) {
    this.moSinOldRevTlOp = moSinOldRevTlOp;
  }

  public String getTot_coll_amt() {
    return tot_coll_amt;
  }

  public void setTot_coll_amt(String tot_coll_amt) {
    this.tot_coll_amt = tot_coll_amt;
  }

  public String getOpenRv24m() {
    return openRv24m;
  }

  public void setOpenRv24m(String openRv24m) {
    this.openRv24m = openRv24m;
  }

  public String getTotalBalExMort() {
    return totalBalExMort;
  }

  public void setTotalBalExMort(String totalBalExMort) {
    this.totalBalExMort = totalBalExMort;
  }

  public String getMthsSinceRecentRevolDelinq() {
    return mthsSinceRecentRevolDelinq;
  }

  public void setMthsSinceRecentRevolDelinq(String mthsSinceRecentRevolDelinq) {
    this.mthsSinceRecentRevolDelinq = mthsSinceRecentRevolDelinq;
  }

  public String getCollections12MthsExMed() {
    return collections12MthsExMed;
  }

  public void setCollections12MthsExMed(String collections12MthsExMed) {
    this.collections12MthsExMed = collections12MthsExMed;
  }

  public String getChargeoffWithin12Mths() {
    return chargeoffWithin12Mths;
  }

  public void setChargeoffWithin12Mths(String chargeoffWithin12Mths) {
    this.chargeoffWithin12Mths = chargeoffWithin12Mths;
  }

  public String getNumRevTlBalGt0() {
    return numRevTlBalGt0;
  }

  public void setNumRevTlBalGt0(String numRevTlBalGt0) {
    this.numRevTlBalGt0 = numRevTlBalGt0;
  }
}
