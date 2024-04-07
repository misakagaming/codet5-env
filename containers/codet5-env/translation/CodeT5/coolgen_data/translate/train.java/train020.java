public class DYYY0131_TRAIN020 extends CTCoolGenCore {
	protected dont_change_return_codes m_LocalEntity001;
	protected dont_change_reason_codes m_LocalEntity002 = new dont_change_reason_codes();
	@Override
	public void initialize(Object... inputs) {
		setDBConnection(inputs);
	}

	@Override
	public void execute(Object... outputs) {
		
		dont_change_return_codes m_LocalEntity001 = new dont_change_return_codes();
		

		parent m_Output01 = (parent) outputs[0];
		error_iyy1_component m_Output02 = (error_iyy1_component) outputs[1];
		
		try {
				CTDBEntityQuery query = new CTDBEntityQuery(m_DBConnection, parent.class.getName());
				
				parent m_Record = new parent();
				m_Record.preference_id = m_InputEntity001.reference_id;
				m_Record.pupdate_user_id = m_InputEntity001.userid;
				m_Record.psearch_attr_text = m_InputEntity002.psearch_attr_text;
				m_Record.pother_attr_text = m_InputEntity002.pother_attr_text;
				
				query.update(m_Record);
				switch (query.getErrorCode())
				{
					case CTDBQuery.DBERROR_SUCCESSFUL:
						moveMember(m_Record, m_Output01);
						break;
						
					case CTDBQuery.DBERROR_NOTUNIQUE:
					        m_Output02.return_code = m_LocalEntity001.n41_obj_update_failed;
						break;
						
					case CTDBQuery.DBERROR_PERMITTED_VALUE_VIOLATION:
					        m_Output02.return_code = m_LocalEntity001.n41_obj_update_failed;
						break;
				}
				
		} catch (CTDBException de) {
			
		}

		if (m_LocalEntity002.authority_status_l.equals("N")) {
			
			m_LocalEntity001.setSubscript(3);
		}
	}

}
