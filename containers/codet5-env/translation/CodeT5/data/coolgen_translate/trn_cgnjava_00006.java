f_0_trace();
if ( trace_ret_code != 8 )
{
  
  cyyy9041_ia = (gen.ort.yyy.CYYY9041_IA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9041_IA"));
  cyyy9041_oa = (gen.ort.yyy.CYYY9041_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9041_OA"));
  cyyy9041_ia.ImpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_la.LocImpErrorIyy1ComponentOriginServid);
  cyyy9041_ia.ImpErrorIyy1ComponentContextString = StringAttr.valueOf(w_la.LocImpErrorIyy1ComponentContextString, (short)512);
  cyyy9041_ia.ImpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_la.LocImpErrorIyy1ComponentReturnCode);
  cyyy9041_ia.ImpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_la.LocImpErrorIyy1ComponentReasonCode);
  cyyy9041_ia.ImpErrorIyy1ComponentImplementationId = DoubleAttr.valueOf(w_la.LocImpErrorIyy1ComponentImplementationId);
  cyyy9041_ia.ImpErrorIyy1ComponentSpecificationId = DoubleAttr.valueOf(w_la.LocImpErrorIyy1ComponentSpecificationId);
  cyyy9041_ia.ImpErrorIyy1ComponentDialectCd = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentDialectCd, (short)2);
  cyyy9041_ia.ImpErrorIyy1ComponentActivityCd = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentActivityCd, (short)15);
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYYY9041", "CYYY9041", cyyy9041_ia, cyyy9041_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020239" );
  globdata.getStateData().setCurrentABName( "CYY1A121_SERVER_TERMINATION" );
  globdata.getStateData().setLastStatementNumber( "0000000019" );
  w_la.LocErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
  w_la.LocErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentRollbackIndicator, (
    short)1);
  w_la.LocErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentOriginServid);
  w_la.LocErrorIyy1ComponentContextString = StringAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentContextString, (short)512);
  w_la.LocErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentReturnCode);
  w_la.LocErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentReasonCode);
  w_la.LocErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyyy9041_oa.ExpErrorIyy1ComponentChecksum, (short)15);
  w_la.LocErrorMsgIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9041_oa.ExpErrorMsgIyy1ComponentSeverityCode, (short)1)
    ;
  w_la.LocErrorMsgIyy1ComponentMessageTx = StringAttr.valueOf(cyyy9041_oa.ExpErrorMsgIyy1ComponentMessageTx, (short)512);
  cyyy9041_ia.freeInstance();
  cyyy9041_ia = null;
  cyyy9041_oa.freeInstance();
  cyyy9041_oa = null;
}