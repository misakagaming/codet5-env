f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_la.LocErrorIyy1ComponentReturnCode < (double) w_la.LocDontChangeReturnCodesQ1Ok) )
  {
    globdata.getStateData().setLastStatementNumber( "0000000021" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocImpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentSeverityCode, (short)1);
      w_la.LocImpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentRollbackIndicator, (
        short)1);
      w_la.LocImpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_la.LocErrorIyy1ComponentOriginServid);
      w_la.LocImpErrorIyy1ComponentContextString = StringAttr.valueOf(w_la.LocErrorIyy1ComponentContextString, (short)512);
      w_la.LocImpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_la.LocErrorIyy1ComponentReturnCode);
      w_la.LocImpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_la.LocErrorIyy1ComponentReasonCode);
      w_la.LocImpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentChecksum, (short)15);
    }
  }
  
}