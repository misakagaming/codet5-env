f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_oa.ExpErrorIyy1ComponentReturnCode == 1) )
  {
    func_0020972417_esc_flag = false;
    

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
          ;
        }
      }
      else {
        globdata.getStateData().setLastSubStatementNumber( "2" );
        f_0_trace();
        {
          f_20972378();
        }
      }
    }
    globdata.getStateData().setLastStatementNumber( "0000000046" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      
      cyyy9141_ia = (gen.ort.yyy.CYYY9141_IA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9141_IA"));
      cyyy9141_oa = (gen.ort.yyy.CYYY9141_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9141_OA"));
      cyyy9141_ia.ImpGroupContext_MA = IntAttr.valueOf(w_la.LocGroupContext_MA);
      for(adim1 = 1; adim1 <= w_la.LocGroupContext_MA; ++(adim1))
      {
        cyyy9141_ia.ImpGContextDontChangeTextText150[adim1-1] = FixedStringAttr.valueOf(w_la.LocGContextDontChangeTextText150[
          adim1-1], (short)150);
      }
      for(adim1 = w_la.LocGroupContext_MA + 1; adim1 <= 9; ++(adim1))
      {
        cyyy9141_ia.ImpGContextDontChangeTextText150[adim1-1] = 
"                                                                                                                                                      "
          ;
      }
      globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
      iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYYY9141", "CYYY9141", cyyy9141_ia, cyyy9141_oa);
      if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
        != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
      {
        throw new ABException();
      }
      globdata.getStateData().setCurrentABId( "0022020106" );
      globdata.getStateData().setCurrentABName( "CYY1S021_APPLICATION_MENU" );
      globdata.getStateData().setLastStatementNumber( "0000000046" );
      w_la.LocContextIyy1ComponentContextString = StringAttr.valueOf(cyyy9141_oa.ExpContextIyy1ComponentContextString, (short)512);
      w_la.LocErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
      w_la.LocErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentRollbackIndicator, (
        short)1);
      w_la.LocErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentOriginServid);
      w_la.LocErrorIyy1ComponentContextString = StringAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentContextString, (short)512);
      w_la.LocErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentReturnCode);
      w_la.LocErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentReasonCode);
      w_la.LocErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyyy9141_oa.ExpErrorIyy1ComponentChecksum, (short)15);
      cyyy9141_ia.freeInstance();
      cyyy9141_ia = null;
      cyyy9141_oa.freeInstance();
      cyyy9141_oa = null;
    }
    globdata.getStateData().setLastStatementNumber( "0000000047" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( ((double) w_la.LocErrorIyy1ComponentReturnCode < 1) )
      {
        globdata.getStateData().setLastStatementNumber( "0000000048" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentSeverityCode, (short)1);
          w_oa.ExpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentRollbackIndicator, (short)
            1);
          w_oa.ExpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_la.LocErrorIyy1ComponentOriginServid);
          w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(w_la.LocErrorIyy1ComponentContextString, (short)512);
          w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_la.LocErrorIyy1ComponentReturnCode);
          w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_la.LocErrorIyy1ComponentReasonCode);
          w_oa.ExpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(w_la.LocErrorIyy1ComponentChecksum, (short)15);
        }
      }
      else 
      {
        globdata.getStateData().setLastSubStatementNumber( "1" );
        f_0_trace();
        {
          globdata.getStateData().setLastStatementNumber( "0000000049" );
          f_0_trace();
          if ( trace_ret_code != 8 )
          {
            w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(w_la.LocContextIyy1ComponentContextString, (short)512);
          }
        }
      }
      
    }
  }
      
}