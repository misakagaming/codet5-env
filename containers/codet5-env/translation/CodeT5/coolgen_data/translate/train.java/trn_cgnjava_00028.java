public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected isc1_component m_LocalEntity001;
	protected isc1_component m_LocalEntity002;
	protected iyy1_component m_LocalEntity003;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.return_code < 1) {
			
		  cyyy9831_mv_sc1_to_yy1 m_AuthorizationCheck = new cyyy9831_mv_sc1_to_yy1();
		  m_AuthorizationCheck.initialize(m_LocalEntity002);
		  iyy1_component m_Out1 = new isc1_component();
		  m_AuthorizationCheck.execute(m_Out1);
      
		}
	}

}