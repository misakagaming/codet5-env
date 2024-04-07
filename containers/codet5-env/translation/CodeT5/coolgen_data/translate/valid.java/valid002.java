package com.j2cg.train;

import com.j2cg.base.CTCoolGenCore;
import com.j2cg.base.CTCoolGenGlobal;

public class CYY1S011_TRAIN004 extends CTCoolGenCore {
	
	protected iyy1_component m_LocalEntity001;
	protected imp_error_iyy1_component m_LocalEntity002;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if (m_LocalEntity001.message_tx <= SPACES) {
			
			m_LocalEntity001.message_tx = m_LocalEntity002.context_string
		}
	}

}