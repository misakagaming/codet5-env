f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_oa.ExpErrorIyy1ComponentReturnCode == (double) w_la.LocDontChangeReturnCodesQ1Ok) )
  {
    func_0020972691_esc_flag = false;
    

    globdata.getStateData().setLastStatementNumber( "0000000050" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocReferenceIyy1ServerDataUserid = FixedStringAttr.valueOf(w_ia.ImpIsc1AuthorizationInfoUserid, (short)8);
    }
    
    globdata.getStateData().setLastStatementNumber( "0000000052" );
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
      else if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "CREATE") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "2" );
        f_0_trace();
        {
          func_0020972802_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000053" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_oa.ExpIsc1AuthorizationInfoAuthorityStatusU, "Y") != 0 )
      {
        globdata.getStateData().setLastStatementNumber( "0000000054" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReturnCodesN1110UnauthorizedOperation, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000055" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReasonCodesQ1Default, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000056" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(3, 0, TIRD2DEC.ROUND_NONE, 0);
          if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
          w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
        }
        globdata.getStateData().setLastStatementNumber( "0000000057" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_la.LocGContextDontChangeTextText150[LocGroupContext_PS_001-1] = FixedStringAttr.valueOf(globdata.getStateData()
            .getClientUserId(), (short)150);
          f_173015082_rgvc();
        }
      }
      
    }
        }
      }
      else if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "READ") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "3" );
        f_0_trace();
        {
          func_0020972806_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000058" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_oa.ExpIsc1AuthorizationInfoAuthorityStatusR, "Y") != 0 )
      {
        globdata.getStateData().setLastStatementNumber( "0000000059" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReturnCodesN1110UnauthorizedOperation, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000060" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReasonCodesQ1Default, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000061" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(3, 0, TIRD2DEC.ROUND_NONE, 0);
          if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
          w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
        }
        globdata.getStateData().setLastStatementNumber( "0000000062" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_la.LocGContextDontChangeTextText150[LocGroupContext_PS_001-1] = FixedStringAttr.valueOf(globdata.getStateData()
            .getClientUserId(), (short)150);
          f_173015082_rgvc();
        }
      }
      
    }
        }
      }
      else if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "UPDATE") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "4" );
        f_0_trace();
        {
          func_0020972885_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000063" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_oa.ExpIsc1AuthorizationInfoAuthorityStatusU, "Y") != 0 )
      {
        globdata.getStateData().setLastStatementNumber( "0000000064" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReturnCodesN1110UnauthorizedOperation, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000065" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReasonCodesQ1Default, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000066" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(3, 0, TIRD2DEC.ROUND_NONE, 0);
          if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
          w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
        }
        globdata.getStateData().setLastStatementNumber( "0000000067" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_la.LocGContextDontChangeTextText150[LocGroupContext_PS_001-1] = FixedStringAttr.valueOf(globdata.getStateData()
            .getClientUserId(), (short)150);
          f_173015082_rgvc();
        }
      }
      
    }
        }
      }
      else if ( CompareExit.compareTo(w_ia.ImpCommandIyy1ComponentSendCommand, "DELETE") == 0 )
      {
        globdata.getStateData().setLastSubStatementNumber( "5" );
        f_0_trace();
        {
          func_0020972888_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000068" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( CompareExit.compareTo(w_oa.ExpIsc1AuthorizationInfoAuthorityStatusD, "Y") != 0 )
      {
        globdata.getStateData().setLastStatementNumber( "0000000069" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReturnCodesN1110UnauthorizedOperation, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000070" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
            w_la.LocDontChangeReasonCodesQ1Default, 0, TIRD2DEC.ROUND_NONE, 5));
        }
        globdata.getStateData().setLastStatementNumber( "0000000071" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(3, 0, TIRD2DEC.ROUND_NONE, 0);
          if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
          w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
        }
        globdata.getStateData().setLastStatementNumber( "0000000072" );
        f_0_trace();
        if ( trace_ret_code != 8 )
        {
          w_la.LocGContextDontChangeTextText150[LocGroupContext_PS_001-1] = FixedStringAttr.valueOf(globdata.getStateData()
            .getClientUserId(), (short)150);
          f_173015082_rgvc();
        }
      }
      
    }
        }
      }
      else {
        globdata.getStateData().setLastSubStatementNumber( "6" );
        f_0_trace();
        {
          func_0020972949_esc_flag = false;
    globdata.getStateData().setLastStatementNumber( "0000000073" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) 
        w_la.LocDontChangeReturnCodesN1120InvalidCommand, 0, TIRD2DEC.ROUND_NONE, 5));
    }
    globdata.getStateData().setLastStatementNumber( "0000000074" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf((int)TIRD2DEC.TIRD2DC1((double) w_la.LocDontChangeReasonCodesQ1Default, 
        0, TIRD2DEC.ROUND_NONE, 5));
    }
    globdata.getStateData().setLastStatementNumber( "0000000075" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(3, 0, TIRD2DEC.ROUND_NONE, 0);
      if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
      w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
    }
    globdata.getStateData().setLastStatementNumber( "0000000076" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      w_la.LocGContextDontChangeTextText150[LocGroupContext_PS_001-1] = FixedStringAttr.valueOf(
        w_ia.ImpCommandIyy1ComponentSendCommand, (short)150);
      f_173015082_rgvc();
    }
        }
      }
    }
    

    globdata.getStateData().setLastStatementNumber( "0000000080" );
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
      globdata.getStateData().setCurrentABId( "0022020139" );
      globdata.getStateData().setCurrentABName( "CYY1S031_PARENT_MAINTAIN" );
      globdata.getStateData().setLastStatementNumber( "0000000080" );
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
    globdata.getStateData().setLastStatementNumber( "0000000081" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      if ( ((double) w_la.LocErrorIyy1ComponentReturnCode < (double) w_la.LocDontChangeReturnCodesQ1Ok) )
      {
        globdata.getStateData().setLastStatementNumber( "0000000082" );
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
          globdata.getStateData().setLastStatementNumber( "0000000083" );
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