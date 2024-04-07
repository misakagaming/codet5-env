f_0_trace();
if ( trace_ret_code != 8 )
{
      
  cyyy9001_oa = (gen.ort.yyy.CYYY9001_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9001_OA"));
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYYY9001", "CYYY9001", null, cyyy9001_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020139" );
  globdata.getStateData().setCurrentABName( "CYY1S031_PARENT_MAINTAIN" );
  globdata.getStateData().setLastStatementNumber( "0000000021" );
  w_oa.ExpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
  w_oa.ExpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentRollbackIndicator, (
    short)1);
  w_oa.ExpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentOriginServid);
  w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentContextString, (short)512);
  w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentReturnCode);
  w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentReasonCode);
  w_oa.ExpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyyy9001_oa.ExpErrorIyy1ComponentChecksum, (short)15);
  cyyy9001_oa.freeInstance();
  cyyy9001_oa = null;
}