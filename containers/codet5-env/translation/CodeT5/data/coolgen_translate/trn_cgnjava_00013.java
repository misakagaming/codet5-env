f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_oa.ExpErrorIyy1ComponentReturnCode < (double) w_la.LocDontChangeReturnCodesQ1Ok) )
  {
    
    globdata.getStateData().setLastStatementNumber( "0000000039" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      globdata.getStateData().setExitState( ex_StdReturnRb001 );
      globdata.getStateData().setExitInfoMsg( " " );
      globdata.getErrorData().setRollbackRequested( 'R' );
      globdata.getStateData().setExitMsgType( 'N' );
    }
    
  }
  else 
  {
    globdata.getStateData().setLastSubStatementNumber( "1" );
    f_0_trace();
    {
      
      globdata.getStateData().setLastStatementNumber( "0000000042" );
      f_0_trace();
      if ( trace_ret_code != 8 )
      {
        globdata.getStateData().setExitState( ex_StdReturn002 );
        globdata.getStateData().setExitInfoMsg( " " );
        globdata.getErrorData().setRollbackRequested( ' ' );
        globdata.getStateData().setExitMsgType( 'N' );
      }
          
    }
  }
      
}