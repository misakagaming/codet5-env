public class CYY1S081_TRAIN005 extends CTCoolGenCore {

	protected iyy1_component m_LocalEntity001;
	protected iyy1_component m_LocalEntity002;
	
	@Override
	public void initialize(Object... inputs) {
	}

	@Override
	public void execute(Object...outputs) {
		
		if(m_LocalEntity001.return_code.equals(1)){
      switch (m_LocalEntity002.send_command)
		  {
			  case "INIT":
				  break;
		  }
    }
	}

}