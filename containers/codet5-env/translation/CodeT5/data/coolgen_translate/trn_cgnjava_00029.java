f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_oa.ExpErrorIyy1ComponentReturnCode == 1) )
  {
    func_0020972182_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000036" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocReferenceIyy1ServerDataUserid = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoUserid, (short)8);
    }
    
    globdata.getStateData().setLastStatementNumber( "0000000038" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "INIT") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "1" );
        f_0_trace();
        {
          // Empty statement here.
          ;
        }
      }
      else {
        globdata.getStateData().setLastSubStatementNumber( "2" );
        f_0_trace();
        {
          f_20972164();
        }
      }
  }
      
}