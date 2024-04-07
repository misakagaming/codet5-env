f_0_trace();
if ( trace_ret_code != 8 )
{
  
  cyyy9051_oa = (gen.ort.yyy.CYYY9051_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9051_OA"));
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYYY9051", "CYYY9051", null, cyyy9051_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020239" );
  globdata.getStateData().setCurrentABName( "CYY1A121_SERVER_TERMINATION" );
  globdata.getStateData().setLastStatementNumber( "0000000011" );
  w_la.LocErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
  w_la.LocErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentRollbackIndicator, (
    short)1);
  w_la.LocErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentOriginServid);
  w_la.LocErrorIyy1ComponentContextString = StringAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentContextString, (short)512);
  w_la.LocErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentReturnCode);
  w_la.LocErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentReasonCode);
  w_la.LocErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyyy9051_oa.ExpErrorIyy1ComponentChecksum, (short)15);
  w_la.LocImpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9051_oa.ExpIdentifiersIyy1ComponentOriginServid);
  w_la.LocImpErrorIyy1ComponentImplementationId = DoubleAttr.valueOf(cyyy9051_oa.ExpIdentifiersIyy1ComponentImplementationId);
  w_la.LocImpErrorIyy1ComponentSpecificationId = DoubleAttr.valueOf(cyyy9051_oa.ExpIdentifiersIyy1ComponentSpecificationId);
  cyyy9051_oa.freeInstance();
  cyyy9051_oa = null;
}