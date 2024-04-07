f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( CompareExit.compareTo(w_la.LocErrorMsgIyy1ComponentSeverityCode, SPACES) <= 0 )
  {
    globdata.getStateData().setLastStatementNumber( "0000000027" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocErrorMsgIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentSeverityCode, (short)1);
    }
  }
  
}