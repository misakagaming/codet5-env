public class DYYY0121_TRAIN028 extends CTCoolGenCore {
	protected parent m_InputEntity001;

	@Override
	public void initialize(Object... inputs) {
		setDBConnection(inputs);
	}

	@Override
	public void execute(Object... outputs) {
		
		dont_change_return_codes m_LocalEntity001 = new dont_change_return_codes();
		dont_change_reason_codes m_LocalEntity002 = new dont_change_reason_codes();
		
		parent m_Output01 = (parent) outputs[0];
		error_iyy1_component m_Output02 = (error_iyy1_component) outputs[1];
		
		try {
				CTDBEntityQuery query = new CTDBEntityQuery(m_DBConnection, parent.class.getName());
				query.addCondition(null, "pkey_attr_text", "=", m_InputEntity001.pkey_attr_text);
				query.locate();
				
				if (query.getErrorCode() == CTDBQuery.DBERROR_SUCCESSFUL) {
					parent m_Record = (parent) query.fetchEntity();
					moveMember(m_Record, m_Output01);
				}
				else {
						    m_Output02.return_code = m_LocalEntity001.n10_obj_not_found;
							m_Output02.reason_code = m_LocalEntity002.m_101_parent_not_found;
				}
				
		} catch (CTDBException de) {
			
		}
	}

}
