f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( ((double) w_la.LocErrorIsc1ComponentReturnCode < (double) w_la.LocDontChangeReturnCodesQ1Ok) )
  {
    globdata.getStateData().setLastStatementNumber( "0000000044" );
    f_0_trace();
    if ( trace_ret_code != 8 )
    {
      
      cyyy9831_ia = (gen.ort.yyy.CYYY9831_IA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9831_IA"));
      cyyy9831_oa = (gen.ort.yyy.CYYY9831_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYYY9831_OA"));
      cyyy9831_ia.ImpErrorIsc1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocErrorIsc1ComponentSeverityCode, (short)1);
      cyyy9831_ia.ImpErrorIsc1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_la.LocErrorIsc1ComponentRollbackIndicator, (
        short)1);
      cyyy9831_ia.ImpErrorIsc1ComponentOriginServid = DoubleAttr.valueOf(w_la.LocErrorIsc1ComponentOriginServid);
      cyyy9831_ia.ImpErrorIsc1ComponentContextString = StringAttr.valueOf(w_la.LocErrorIsc1ComponentContextString, (short)512);
      cyyy9831_ia.ImpErrorIsc1ComponentReturnCode = IntAttr.valueOf(w_la.LocErrorIsc1ComponentReturnCode);
      cyyy9831_ia.ImpErrorIsc1ComponentReasonCode = IntAttr.valueOf(w_la.LocErrorIsc1ComponentReasonCode);
      cyyy9831_ia.ImpErrorIsc1ComponentChecksum = FixedStringAttr.valueOf(w_la.LocErrorIsc1ComponentChecksum, (short)15);
      globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
      iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYYY9831", "CYYY9831", cyyy9831_ia, cyyy9831_oa);
      if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData()
        .getErrorEncounteredSW() != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != 
        ErrorData.NO_ERROR_FOUND_SW) )
      {
        throw new ABException();
      }
      globdata.getStateData().setCurrentABId( "0022020139" );
      globdata.getStateData().setCurrentABName( "CYY1S031_PARENT_MAINTAIN" );
      globdata.getStateData().setLastStatementNumber( "0000000044" );
      w_oa.ExpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
      w_oa.ExpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentRollbackIndicator, (
        short)1);
      w_oa.ExpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentOriginServid);
      w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentContextString, (short)512);
      w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentReturnCode);
      w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentReasonCode);
      w_oa.ExpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyyy9831_oa.ExpErrorIyy1ComponentChecksum, (short)15);
      cyyy9831_ia.freeInstance();
      cyyy9831_ia = null;
      cyyy9831_oa.freeInstance();
      cyyy9831_oa = null;
    }
  }
      
}