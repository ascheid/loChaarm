package br.com.scheid.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class IndexMBean extends AbstractCommonMBean{

	@Override
	public String getBundleDir() {
		return "br/com/scheid/locale/common";
	}

}
