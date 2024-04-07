f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_oa.ExpErrorIyy1ComponentReturnCode == 1) )
  {
    func_0020972280_esc_flag = false;
    
    globdata.getStateData().setLastStatementNumber( "0000000054" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "INIT") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "1" );
        f_0_trace();
        {
          ;
        }
      }
    }
  }
  
}