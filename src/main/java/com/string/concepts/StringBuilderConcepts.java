package com.string.concepts;

import java.sql.Connection;
import java.util.Objects;

public class StringBuilderConcepts {

	private static final String SELECT_CUSTOMER_EXT_PARTY_LINKAGE = "SELECT CILP.PARTY_ID,"
			+ "CIL.UPD_USER_ID,cil.LINK_ID,CIL.START_DATE,CIL.END_DATE,CIL.DROP_INTERESTED_PARTY_ID,CIL.CUSTOMER_IP_ROLE_CD,"
			+ "CIL.USE_ALL_INVESTMENT_ACCS_FLAG,CIL.SUPPRESS_MESSAGING_FLAG,EXPT.FIRST_NAME,EXPT.LAST_NAME,EXPT.COMMENTS,EXPT.EMAIL_ADDRESS,"
			+ "EXPT.EXTERNAL_FLAG,EXPT.STATUS_CD,EXPT.TEMPLATE_FLAG,EXPT.BRAND_CD FROM CUSTOMER_EXT_PARTY CEP,CUSTOMER_IP_LINK_PARTY CILP,"
			+ "EXT_PARTY EXPT,CUSTOMER_IP_LINK CIL,CUSTOMER_ACCOUNT_IP CAIP WHERE CEP.EXTERNAL_PARTY_ID = CILP.INTERESTED_PARTY_ID AND CIL.LINK_ID = "
			+ "CILP.LINK_ID AND CAIP.LINK_ID = CIL.LINK_ID AND CEP.CUSTOMER_ID = ? AND CEP.EXTERNAL_PARTY_ID = ? AND EXPT.EXT_PARTY_ID = ? "
			+ "AND CIL.CUSTOMER_IP_ROLE_CD = ? AND CIL.CUSTOMER_IP_AUTH_CD = ?";

	static String BLANK = " ";

	public static String getQuery(Long customerId, Long interestedPartyId, String contractRoleCode,
			String incomingStartDate, String incomingEndDate, String authorityCode, Connection dbConn) {

		StringBuilder queryBuilder = new StringBuilder(SELECT_CUSTOMER_EXT_PARTY_LINKAGE);
		queryBuilder.append(BLANK);
		if (Objects.isNull(incomingStartDate)) {
			queryBuilder.append("AND CIL.START_DATE is null");

		} else {
			queryBuilder.append("AND CIL.START_DATE = TO_TIMESTAMP(?, 'DD-MON-RRHH24:MI:SS.FF')");
		}
		queryBuilder.append(BLANK);
		if (Objects.isNull(incomingEndDate)) {
			queryBuilder.append("AND CIL.END_DATE is null");
		} else {

			queryBuilder.append("AND CIL.END_DATE = TO_TIMESTAMP(?, 'DD-MON-RRHH24:MI:SS.FF')");
		}
		queryBuilder.append(BLANK);
		queryBuilder.append("AND ROWNUM = 1 ORDER BY CILP.CREATION_DATE DESC");

		return queryBuilder.toString();
	}

	public static void main(String[] args) {

		System.out.println("Query is : " + getQuery(null, null, "", null, null, "", null));

	}
}