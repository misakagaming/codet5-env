f_0_trace();
if ( trace_ret_code != 8 )
{
  LocGroupContext_PS_002 = (int)TIRD2DEC.TIRD2DC1(1, 0, TIRD2DEC.ROUND_NONE, 0);
  if ( (LocGroupContext_PS_002 > w_la.LocGroupContext_MA) && (LocGroupContext_PS_002 <= 9) )
  w_la.LocGroupContext_MA = IntAttr.valueOf(LocGroupContext_PS_002);
}