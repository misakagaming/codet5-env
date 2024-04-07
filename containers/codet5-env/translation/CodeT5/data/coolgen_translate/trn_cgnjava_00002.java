f_0_trace();
if ( trace_ret_code != 8 )
{
  w_la.LocImpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_ia.ImpErrorIyy1ComponentSeverityCode, (short)1);
  w_la.LocImpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_ia.ImpErrorIyy1ComponentRollbackIndicator, (short)1);
  w_la.LocImpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_ia.ImpErrorIyy1ComponentOriginServid);
  w_la.LocImpErrorIyy1ComponentContextString = StringAttr.valueOf(w_ia.ImpErrorIyy1ComponentContextString, (short)512);
  w_la.LocImpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_ia.ImpErrorIyy1ComponentReturnCode);
  w_la.LocImpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_ia.ImpErrorIyy1ComponentReasonCode);
  w_la.LocImpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(w_ia.ImpErrorIyy1ComponentChecksum, (short)15);
}