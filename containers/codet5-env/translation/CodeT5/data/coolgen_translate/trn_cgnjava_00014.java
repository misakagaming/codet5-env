f_0_trace();
if ( trace_ret_code != 8 )
{
  if ( todaysTimestamp == null )
  {
    todaysTimestamp = StringAttr.getInstance();
  }
  if ( todaysTime == null )
  {
    todaysTime = IntAttr.getInstance();
  }
  if ( todaysDate == null )
  {
    todaysDate = IntAttr.getInstance();
  }
  TIRDAT2.getSystemTimestamp(todaysTimestamp);
  TIRDAT2.getSystemDate(todaysDate, TIRDAT2.DF_YYYYMMDD);
  TIRDAT2.getSystemTime(todaysTime, TIRDAT2.TF_HHMMSS);
  w_oa.ExpReferenceIyy1ServerDataServerTimestamp = TimestampAttr.valueOf(todaysTimestamp.get());
}