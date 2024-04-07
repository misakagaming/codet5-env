f_0_trace();
if ( trace_ret_code != 8 )
{
  LocGroupContext_PS_001 = (int)TIRD2DEC.TIRD2DC1(2, 0, TIRD2DEC.ROUND_NONE, 0);
  if ( (LocGroupContext_PS_001 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_001 <= 9) )
  w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_001);
}