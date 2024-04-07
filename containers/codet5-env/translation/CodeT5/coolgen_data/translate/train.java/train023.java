public class CYY1S011_TRAIN023 extends CTCoolGenCore {
	protected error_iyy1_component m_LocalEntity001;
	protected error_iyy1_component m_InputEntity001;

	
	@Override
	public void initialize(Object... inputs) {
		m_InputEntity001 = (error_iyy1_component) inputs[0];
	}

	@Override
	public void execute(Object...outputs) {
		
		cyyy9051_cmpnt_identifiers_get m_IdentifiersGet = new cyyy9051_cmpnt_identifiers_get();
		m_IdentifiersGet.executem_InputEntity001, m_LocalEntity001);
		
	}

}