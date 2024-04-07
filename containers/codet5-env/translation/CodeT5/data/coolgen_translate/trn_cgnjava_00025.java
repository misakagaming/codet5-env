f_0_trace();
if ( trace_ret_code != 8 )
{
      
  cyy1a131_oa = (gen.ort.yyy.CYY1A131_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYY1A131_OA"));
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYY1A131", "CYY1A131", null, cyy1a131_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020328" );
  globdata.getStateData().setCurrentABName( "CYY1S011_MAIN_MENU" );
  globdata.getStateData().setLastStatementNumber( "0000000023" );
  w_la.LocReferenceIyy1ServerDataServerDate = DateAttr.valueOf(cyy1a131_oa.ExpReferenceIyy1ServerDataServerDate);
  w_la.LocReferenceIyy1ServerDataServerTime = TimeAttr.valueOf(cyy1a131_oa.ExpReferenceIyy1ServerDataServerTime);
  w_la.LocReferenceIyy1ServerDataReferenceId = TimestampAttr.valueOf(cyy1a131_oa.ExpReferenceIyy1ServerDataReferenceId);
  w_la.LocReferenceIyy1ServerDataServerTimestamp = TimestampAttr.valueOf(cyy1a131_oa.ExpReferenceIyy1ServerDataServerTimestamp);
  cyy1a131_oa.freeInstance();
  cyy1a131_oa = null;
}