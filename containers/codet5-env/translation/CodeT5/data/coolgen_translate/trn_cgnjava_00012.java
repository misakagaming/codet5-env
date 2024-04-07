f_0_trace();
if ( trace_ret_code != 8 )
{
  w_oa.ExpErrorIyy1ComponentSeverityCode = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentSeverityCode, (short)1);
  w_oa.ExpErrorIyy1ComponentRollbackIndicator = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentRollbackIndicator, (short)1)
    ;
  w_oa.ExpErrorIyy1ComponentOriginServid = DoubleAttr.valueOf(w_la.LocImpErrorIyy1ComponentOriginServid);
  w_oa.ExpErrorIyy1ComponentContextString = StringAttr.valueOf(w_la.LocImpErrorIyy1ComponentContextString, (short)512);
  w_oa.ExpErrorIyy1ComponentReturnCode = IntAttr.valueOf(w_la.LocImpErrorIyy1ComponentReturnCode);
  w_oa.ExpErrorIyy1ComponentReasonCode = IntAttr.valueOf(w_la.LocImpErrorIyy1ComponentReasonCode);
  w_oa.ExpErrorIyy1ComponentChecksum = FixedStringAttr.valueOf(w_la.LocImpErrorIyy1ComponentChecksum, (short)15);
}