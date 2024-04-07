f_0_trace();
if ( trace_ret_code != 8 )
{
  BaseAttr.reset(datetimestamp_oa_ExportDatetimestampDateValue_FP_006);
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  TIRFDTTS.TIRFDTTS(iefRuntimeParm1, iefRuntimeParm2, globdata, w_oa.ExpReferenceIyy1ServerDataServerTimestamp, 
    datetimestamp_oa_ExportDatetimestampDateValue_FP_006);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  w_oa.ExpReferenceIyy1ServerDataServerDate = DateAttr.valueOf(datetimestamp_oa_ExportDatetimestampDateValue_FP_006.get());
}