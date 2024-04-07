public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected iyy1_component m_LocalEntity001;
	protected group_context m_LocalEntity002;
	protected iyy1_component m_LocalEntity003;
        protected iyy1_server_data m_LocalEntity004;
        protected isc1_authorization_info m_LocalEntity005;
        protected iyy1_component m_LocalEntity006;
        protected dont_change_return_codes m_LocalEntity007;
        protected dont_change_reason_codes m_LocalEntity008;
        protected g_context dont_change_text m_LocalEntity009;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.return_code.equals(1)) {
			m_LocalEntity004.userid = m_LocalEntity005.userid
      switch (m_LocalEntity006.send_command)
		  {
			  case "INIT":
				  break;
				
			  default:
          m_LocalEntity001.return_code = m_LocalEntity007.n1120_invalid_command;
          m_LocalEntity001.reason_code = m_LocalEntity008.one_default;
          m_LocalEntity002.setSubscript(3);
          m_LocalEntity009.text_150 = m_LocalEntity006.send_command;
          
		  }
			cyyy9141_context_string_set m_AuthorizationCheck = new cyyy9141_context_string_set();
		  m_AuthorizationCheck.initialize(m_LocalEntity002);
		  iyy1_component m_Out1 = new isc1_component();
      loc_context_iyy1_component m_Out2 = new loc_context_iyy1_component();
		  m_AuthorizationCheck.execute(m_Out1, m_Out2);
      if(m_Out1.return_code < 1){
        moveMember(m_Out1, m_LocalEntity001);
      }
      else{
        m_LocalEntity001.context_string = m_Out2.context_string;
      }
		}
	}

}