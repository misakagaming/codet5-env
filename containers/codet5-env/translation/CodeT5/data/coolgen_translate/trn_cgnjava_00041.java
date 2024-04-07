f_0_trace();
if ( trace_ret_code != 8 )
{
      
  isc1z021_ia = (gen.ort.yyy.ISC1Z021_IA)(iefRuntimeParm2.getInstance("gen.ort.yyy.ISC1Z021_IA"));
  isc1z021_oa = (gen.ort.yyy.ISC1Z021_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.ISC1Z021_OA"));
  isc1z021_ia.ImpGroupTrans_MA = IntAttr.valueOf(w_ia.ImpGroupTrans_MA);
  for(adim1 = 1; adim1 <= w_ia.ImpGroupTrans_MA; ++(adim1))
  {
    isc1z021_ia.ImpGTransIsc1AuthorityObjectInfoObjectId[adim1-1] = FixedStringAttr.valueOf(
      w_ia.ImpGTransIsc1AuthorityObjectInfoObjectId[adim1-1], (short)20);
  }
  for(adim1 = w_ia.ImpGroupTrans_MA + 1; adim1 <= 30; ++(adim1))
  {
    isc1z021_ia.ImpGTransIsc1AuthorityObjectInfoObjectId[adim1-1] = "                    ";
  }
  isc1z021_ia.ImpIsc1AuthorizationInfoUserid = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoUserid, (short)20);
  isc1z021_ia.ImpIsc1AuthorizationInfoTokenId = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoTokenId, (short)32);
  isc1z021_ia.ImpIsc1AuthorizationInfoModuleId = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoModuleId, (short)20);
  isc1z021_ia.ImpIsc1AuthorizationInfoAuthorityObjectId = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoAuthorityObjectId,
     (short)20);
  isc1z021_ia.ImpIsc1AuthorizationInfoVersion = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoVersion, (short)4);
  isc1z021_ia.ImpIsc1AuthorizationInfoWorkingUnitNum = IntAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoWorkingUnitNum);
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.ISC1Z021", "ISC1Z021", isc1z021_ia, isc1z021_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020106" );
  globdata.getStateData().setCurrentABName( "CYY1S021_APPLICATION_MENU" );
  globdata.getStateData().setLastStatementNumber( "0000000027" );
  w_oa.ExpIsc1AuthorizationInfoTokenId = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoTokenId, (short)32);
  w_oa.ExpIsc1AuthorizationInfoAuthorityInd = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityInd, (short)1)
    ;
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatusR = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatusR, (
    short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatusU = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatusU, (
    short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatusD = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatusD, (
    short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatusL = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatusL, (
    short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus01 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus01,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus02 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus02,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus03 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus03,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus04 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus04,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus05 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus05,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus06 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus06,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus07 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus07,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus08 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus08,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus09 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus09,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus10 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus10,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus11 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus11,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus12 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus12,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus13 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus13,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus14 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus14,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus15 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus15,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus16 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus16,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus17 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus17,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus18 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus18,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus19 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus19,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus20 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus20,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus21 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus21,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus22 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus22,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus23 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus23,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus24 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus24,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus25 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus25,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus26 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus26,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus27 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus27,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus28 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus28,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus29 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus29,
     (short)1);
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus30 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus30,
     (short)1);
  w_la.LocErrorIsc1ComponentSeverityCode = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentSeverityCode, (short)1);
  w_la.LocErrorIsc1ComponentRollbackIndicator = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentRollbackIndicator, (
    short)1);
  w_la.LocErrorIsc1ComponentOriginServid = DoubleAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentOriginServid);
  w_la.LocErrorIsc1ComponentContextString = StringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentContextString, (short)512);
  w_la.LocErrorIsc1ComponentReturnCode = IntAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentReturnCode);
  w_la.LocErrorIsc1ComponentReasonCode = IntAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentReasonCode);
  w_la.LocErrorIsc1ComponentChecksum = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentChecksum, (short)15);
  isc1z021_ia.freeInstance();
  isc1z021_ia = null;
  isc1z021_oa.freeInstance();
  isc1z021_oa = null;
}