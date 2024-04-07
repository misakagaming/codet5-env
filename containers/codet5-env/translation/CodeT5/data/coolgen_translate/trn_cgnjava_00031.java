f_0_trace();
if ( trace_ret_code != 8 )
{
      
  cyy1a121_ia = (gen.ort.yyy.CYY1A121_IA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYY1A121_IA"));
  cyy1a121_oa = (gen.ort.yyy.CYY1A121_OA)(iefRuntimeParm2.getInstance("gen.ort.yyy.CYY1A121_OA"));
  cyy1a121_ia.ImpDialectIyy1ComponentDialectCd = FixedStringAttr.valueOf(w_ia.ImpDialectIyy1ComponentDialectCd, (short)2);
  cyy1a121_ia.ImpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
  cyy1a121_ia.ImpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_oa.ExpErrorIyy1ComponentRollbackIndicator, (
    short)1);
  cyy1a121_ia.ImpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_oa.ExpErrorIyy1ComponentOriginServid);
  cyy1a121_ia.ImpErrorIyy1ComponentContextString = StringAttr.valueOf(w_oa.ExpErrorIyy1ComponentContextString, (short)512);
  cyy1a121_ia.ImpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_oa.ExpErrorIyy1ComponentReturnCode);
  cyy1a121_ia.ImpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_oa.ExpErrorIyy1ComponentReasonCode);
  cyy1a121_ia.ImpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(w_oa.ExpErrorIyy1ComponentChecksum, (short)15);
  globdata.getErrorData().setErrorEncounteredSW( ErrorData.NO_ERROR_FOUND_SW );
  iefRuntimeParm2.useActionBlock("gen.ort.yyy.CYY1A121", "CYY1A121", cyy1a121_ia, cyy1a121_oa);
  if ( ((!(globdata.getErrorData().getStatus().equals( ErrorData.NONE_SF ))) || (globdata.getErrorData().getErrorEncounteredSW() 
    != ErrorData.NO_ERROR_FOUND_SW)) || (globdata.getErrorData().getViewOverflowSW() != ErrorData.NO_ERROR_FOUND_SW) )
  {
    throw new ABException();
  }
  globdata.getStateData().setCurrentABId( "0022020328" );
  globdata.getStateData().setCurrentABName( "CYY1S011_MAIN_MENU" );
  globdata.getStateData().setLastStatementNumber( "0000000059" );
  w_oa.ExpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentSeverityCode, (short)1);
  w_oa.ExpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentRollbackIndicator, (
    short)1);
  w_oa.ExpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentOriginServid);
  w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentContextString, (short)512);
  w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentReturnCode);
  w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentReasonCode);
  w_oa.ExpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(cyy1a121_oa.ExpErrorIyy1ComponentChecksum, (short)15);
  w_oa.ExpMsgIyy1ComponentSeverityCode = FixedStringAttr.valueOf(cyy1a121_oa.ExpErrorMsgIyy1ComponentSeverityCode, (short)1);
  w_oa.ExpMsgIyy1ComponentMessageTx = StringAttr.valueOf(cyy1a121_oa.ExpErrorMsgIyy1ComponentMessageTx, (short)512);
  cyy1a121_ia.freeInstance();
  cyy1a121_ia = null;
  cyy1a121_oa.freeInstance();
  cyy1a121_oa = null;
}