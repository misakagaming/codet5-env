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
  globdata.getStateData().setCurrentABId( "0022020328" );
  globdata.getStateData().setCurrentABName( "CYY1S011_MAIN_MENU" );
  globdata.getStateData().setLastStatementNumber( "0000000027" );
  w_la.LocErrorIsc1ComponentSeverityCode = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentSeverityCode, (short)1);
  w_la.LocErrorIsc1ComponentRollbackIndicator = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentRollbackIndicator, (
    short)1);
  w_la.LocErrorIsc1ComponentOriginServid = DoubleAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentOriginServid);
  w_la.LocErrorIsc1ComponentContextString = StringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentContextString, (short)512);
  w_la.LocErrorIsc1ComponentReturnCode = IntAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentReturnCode);
  w_la.LocErrorIsc1ComponentReasonCode = IntAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentReasonCode);
  w_la.LocErrorIsc1ComponentChecksum = FixedStringAttr.valueOf(isc1z021_oa.ExpErrorIsc1ComponentChecksum, (short)15);
  w_oa.ExpIsc1AuthorizationInfoTokenId = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoTokenId, (short)32);
  w_oa.ExpIsc1AuthorizationInfoAuthorityInd = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityInd, (short)1)
    ;
  w_oa.ExpIsc1AuthorizationInfoAuthorityStatus01 = FixedStringAttr.valueOf(isc1z021_oa.ExpIsc1AuthorizationInfoAuthorityStatus01,
     (short)1);
  isc1z021_ia.freeInstance();
  isc1z021_ia = null;
  isc1z021_oa.freeInstance();
  isc1z021_oa = null;
}