f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_la.LocImpErrorIyy1ComponentReturnCode < (double) w_la.LocDontChangeReturnCodesQ1Ok) )
  {
    globdata.getStateData().setLastStatementNumber( "0000000031" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocImpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf("E", (short)1);
    }
    globdata.getStateData().setLastStatementNumber( "0000000032" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocErrorMsgIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentSeverityCode, (short)1);
    }
  }
  
}