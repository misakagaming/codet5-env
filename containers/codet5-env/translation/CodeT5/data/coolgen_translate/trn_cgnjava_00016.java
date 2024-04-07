f_0_trace();
if ( trace_ret_code != 8 )
{
  BaseAttr.reset(timetimestamp_oa_ExportTimetimestampTimeValue_FP_008);
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  TIRFTMTS.TIRFTMTS(iefRuntimeParm1, iefRuntimeParm2, globdata, w_oa.ExpReferenceIyy1ServerDataServerTimestamp, 
    timetimestamp_oa_ExportTimetimestampTimeValue_FP_008);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  w_oa.ExpReferenceIyy1ServerDataServerTime = TimeAttr.valueOf(timetimestamp_oa_ExportTimetimestampTimeValue_FP_008.get());
}