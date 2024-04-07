public class DYYY0211_TRAIN021 extends CTCoolGenCore {
	@Override
	public void initialize(Object... inputs) {
		setDBConnection(inputs);
	}

	@Override
	public void execute(Object... outputs) {
		
		dont_change_return_codes m_LocalEntity001 = new dont_change_return_codes();
		dont_change_reason_codes m_LocalEntity002 = new dont_change_reason_codes();

		child m_Output01 = (child) outputs[0];
		error_iyy1_component m_Output02 = (error_iyy1_component) outputs[1];
		
		try {
				CTDBEntityQuery query = new CTDBEntityQuery(m_DBConnection, parent.class.getName());
				
				child m_Record = new child();
				m_Record.cinstance_id = m_InputEntity002.cinstance_id;
				m_Record.creference_id = m_InputEntity001.reference_id;
				m_Record.ccreate_user_id = m_InputEntity001.userid;
				m_Record.cparent_pkey_attr_text = m_InputEntity002.cparent_pkey_attr_text;
				
				query.insert(m_Record);
				switch (query.getErrorCode())
				{
					case CTDBQuery.DBERROR_SUCCESSFUL:
						moveMember(m_Record, m_Output01);
						break;
						
					default:
					    m_Output02.return_code = m_LocalEntity001.n40_obj_create_failed;
				}
				
		} catch (CTDBException de) {
			
		}

		isc1z021_o_authorization_check_s m_AuthorizationCheck = new isc1z021_o_authorization_check_s();
		m_AuthorizationCheck.initialize(m_LocalEntity001, m_LocalEntity002);
		isc1_authorization_info m_Out1 = new isc1_authorization_info();
		isc1_component m_Out2 = new isc1_component();
		m_AuthorizationCheck.execute(m_Out1, m_Out2);
	}

}
